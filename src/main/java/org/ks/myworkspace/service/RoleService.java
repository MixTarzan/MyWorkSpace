package org.ks.myworkspace.service;

import org.ks.myworkspace.model.cvcreator.Role;
import org.ks.myworkspace.repositry.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role findByName(String roleName) {
        Optional<Role> roleOptional = roleRepository.findByName(roleName);
        if (roleOptional.isEmpty()) {
            throw new RuntimeException("Role not found: " + roleName);
        }
        return roleOptional.get();
    }

    public Role createRole(String roleName) {
        Optional<Role> roleOptional = roleRepository.findByName(roleName);
        if (roleOptional.isPresent()) {
            return roleOptional.get();
        }
        Role newRole = new Role(roleName);
        return roleRepository.save(newRole);
    }

}
