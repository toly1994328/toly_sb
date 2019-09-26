package com.toly1994.toly_sb.model;

import java.util.UUID;

public class Widget {
    private final UUID id;
    private final String name;

    public Widget(UUID id, String name) {
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
