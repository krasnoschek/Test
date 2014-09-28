package org.krasnoschek.model;


import org.springframework.security.core.GrantedAuthority;

public class Authority extends BaseModel implements GrantedAuthority {

    public Authority(String auth) {
        this.auth = auth;
    }

    public Authority() {
    }

    private String auth;

    @Override
    public String getAuthority() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
