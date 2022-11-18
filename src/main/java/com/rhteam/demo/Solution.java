package com.rhteam.demo;

import java.io.*;
import java.util.*;

public class Solution {

    static List<String> getTaskWithDependencies(List<Task> tasks, String dependsOn) {
        // TODO: please implement logic here
        // answer from here
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < tasks.size(); i++) {
            map.put(tasks.get(i).getName(), tasks.get(i).getDependsOn());
        }
        List<String> exeOrder = new ArrayList<>();
        getOrder(map, exeOrder, dependsOn);
        return exeOrder;
    }

    private static void getOrder(Map<String, List<String>> map, List<String> exeOrder, String dependsOn) {
        List<String> dependencies = map.get(dependsOn);

        for(String dependency: dependencies) {
            getOrder(map, exeOrder, dependency);
        }

        exeOrder.add(dependsOn);
    }
}
