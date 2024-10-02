package org.ks.myworkspace.model.cvcreator;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class ContactInformation {

    private String phoneNumber;
    private String address;
    private String linkedinProfile;
    private String githubProfile;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
    }

    public void setGithubProfile(String githubProfile) {
        this.githubProfile = githubProfile;
    }
}
