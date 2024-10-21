package org.ks.myworkspace.repositry;

import org.ks.myworkspace.model.cvcreator.CV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepository extends JpaRepository<CV, Long> {
    // Custom query methods can go here
}
