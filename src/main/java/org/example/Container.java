package org.example;

import org.example.system.controller.SystemController;

import java.util.Scanner;

public class Container {
    private static Scanner sc;

    public static void init() {
        sc = new Scanner(System.in);
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void close() {
        sc.close();
    }
}
