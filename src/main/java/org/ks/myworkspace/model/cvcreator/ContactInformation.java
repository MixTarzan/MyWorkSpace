package org.ks.myworkspace.model.cvcreator;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ContactInformation {

    private String fullName;
    private String gender;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String linkedinProfile;
    private String githubProfile;
    private String jobTitle;
}
