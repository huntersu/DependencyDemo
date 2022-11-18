package com.rhteam.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Task{
    private final String name;
    private final List<String> dependsOn;

    Task(String name) {
        this(name, new ArrayList<>());
    }

    Task(String name, List<String> dependsOn) {
        this.name = name;
        this.dependsOn = dependsOn;
    }

    public String getName() { return this.name; }
    public List<String> getDependsOn() { return this.dependsOn; }
}

