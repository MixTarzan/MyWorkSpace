package org.ks.myworkspace.model.cvcreator;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class CV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Education> education;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Experience> experience;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Project> projects;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL)
    private List<Certification> certifications;

    @ElementCollection
    private List<String> skills;

    @Embedded
    private ContactInformation contactInformation;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setCertifications(List<Certification> certifications) {
        this.certifications = certifications;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }
}
