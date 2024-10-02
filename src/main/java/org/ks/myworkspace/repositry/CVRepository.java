package org.ks.myworkspace.repositry;

import org.ks.myworkspace.model.cvcreator.CV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVRepository extends JpaRepository<CV, Long> {
}