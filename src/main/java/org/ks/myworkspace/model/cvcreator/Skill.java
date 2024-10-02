package org.ks.myworkspace.model.cvcreator;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String proficiencyLevel; // Beginner, Intermediate, Advanced

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }
}

