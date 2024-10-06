package org.ks.myworkspace.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String username;

    private String password;

    private String email;

    private String firstName;
    private String lastName;
}
