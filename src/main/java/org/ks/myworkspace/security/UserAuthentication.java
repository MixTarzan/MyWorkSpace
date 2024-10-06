package org.ks.myworkspace.security;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserAuthentication {
    UserDetails loadUser(String username);
}

