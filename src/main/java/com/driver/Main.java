package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        rw.setStr("Dinesh");
        System.out.print(rw.getStr());
        

        // Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        // The field RWOnly.str is not visible
        // The field RWOnly.str is not visible

    }
}