package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 37;
        Integer  carlosAge = 37;
        Integer santiAge = 20;

        int ageIsabela = 20;
        int total = ageIsabela+carlosAge;
        boolean isFemale = true;
        isFemale = false;

        String name = "Carlos";

        final User santiago = new User("Carlos");
        User carlos = new User("Carlos");

        int saldo;
        saldo = 12;
        System.out.println(carlos.equals(saldo));
    }
}