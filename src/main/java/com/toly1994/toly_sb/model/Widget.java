package com.toly1994.toly_sb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Widget {
    private final UUID id;
    private final String name;

    //@JsonProperty json属性标识
    public Widget(@JsonProperty("id") UUID id,
                  @JsonProperty("name")String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
