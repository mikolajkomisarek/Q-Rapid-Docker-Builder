package com.acme;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getGreeting());
        System.out.println(new App().getGreeting());
        System.out.println(new App().getGreeting());

        Example example = new Example("",",","");
        Example exampl2e = new Example("",",","");
        Example exampledas = new Example("",",","");

        example.test = "32423";
    }
}
