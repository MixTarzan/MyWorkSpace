package org.ks.myworkspace.repositry;

import org.ks.myworkspace.model.cvcreator.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByUsername(String userName);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}