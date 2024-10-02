package org.ks.myworkspace.repositry;

import org.ks.myworkspace.model.cvcreator.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}