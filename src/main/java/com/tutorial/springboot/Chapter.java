package com.tutorial.springboot;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Chapter {

    @Id
    @Getter
    private String id;

    @Getter
    private String name;

    public Chapter(String name) {
        this.name = name;
    }

/*    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }*/

    @Override
    public String toString() {
        return "Chapter: " + id + ":::" + name;
    }
}
