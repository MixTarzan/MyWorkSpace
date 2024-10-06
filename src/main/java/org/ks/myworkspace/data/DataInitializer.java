package org.ks.myworkspace.data;

import org.ks.myworkspace.model.cvcreator.Role;
import org.ks.myworkspace.repositry.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        if (roleRepository.findByName("ROLE_USER").isEmpty()) {
            Role roleUser = new Role("ROLE_USER");
            roleRepository.save(roleUser);
        }
        if (roleRepository.findByName("ROLE_ADMIN").isEmpty()) {
            Role roleUser = new Role("ROLE_ADMIN");
            roleRepository.save(roleUser);
        }
    }
}
