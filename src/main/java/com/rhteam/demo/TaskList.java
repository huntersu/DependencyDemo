package com.rhteam.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TaskList {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("application A", Arrays.asList("mongo")));
        tasks.add(new Task("storage"));
        tasks.add(new Task("mongo", Arrays.asList("storage")));
        tasks.add(new Task("memcache"));
        tasks.add(new Task("application B", Arrays.asList("memcache")));

        return tasks;
    }
}