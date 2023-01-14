package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        rw.setName("Dinesh");
        System.out.println(rw.getName());


        // Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        // The field RWOnly.str is not visible
        // The field RWOnly.str is not visible

    }
}