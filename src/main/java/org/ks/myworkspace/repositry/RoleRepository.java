package org.ks.myworkspace.repositry;

import org.ks.myworkspace.model.cvcreator.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
