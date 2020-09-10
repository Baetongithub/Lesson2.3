package com.company;

public class Main {

    public static void printAll(){
        System.out.println("JAVA");
        System.out.println("Hello");
        System.out.println("GeekTech");
        test();
    }

    public static void main(String[] args) {
        hello();
        test();
        System.out.println("hello");
        printAll();
        System.out.println("End of program");
    }

    public static void test(){
        System.out.println("Working method test");
    }

    public static void hello(){
        System.out.println("let's print it!");
    }


}
