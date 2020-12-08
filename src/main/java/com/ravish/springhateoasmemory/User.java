package com.ravish.springhateoasmemory;

import org.springframework.hateoas.RepresentationModel;

public class User extends RepresentationModel<User> {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
}
