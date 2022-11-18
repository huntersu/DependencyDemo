package com.rhteam.demo;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String>  exeOrder = com.rhteam.demo.Solution.getTaskWithDependencies(TaskList.getTasks(), "application A");

        for (String str:exeOrder) {

            System.out.println(str);

        }

    }
}
