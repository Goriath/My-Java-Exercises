package com.kfryc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911"); // it is not set in Car class
        System.out.println("Model is " + porsche.getModel());
    }
}
