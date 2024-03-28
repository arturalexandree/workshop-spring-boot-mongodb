package com.nelioalves.workshopmongo.dto;

import com.nelioalves.workshopmongo.domain.User;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();


    }
}
