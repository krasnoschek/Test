package org.krasnoschek.model;


import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {

    private String auth;

    @Override
    public String getAuthority() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
