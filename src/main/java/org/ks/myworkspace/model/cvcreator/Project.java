package org.ks.myworkspace.model.cvcreator;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;
    private String description;
    private String projectLink;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;

    public void setId(Long id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }
}

