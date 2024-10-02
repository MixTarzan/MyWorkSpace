package org.ks.myworkspace.model.cvcreator;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String certificationName;
    private String organization;
    private String issueDate;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }
}

