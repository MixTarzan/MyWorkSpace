package org.ks.myworkspace.model.cvcreator;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String institutionName;
    private String degree;
    private String fieldOfStudy;
    private String startDate;
    private String endDate;
    private String grade;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;

    public void setId(Long id) {
        this.id = id;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }
}

