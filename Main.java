package com.company;

public class Main {

    public static void main(String[] args) {

        Floor floor1 = new Floor(2,2);
        Carpet carpet1 = new Carpet(2);

        Calculator calculator1 = new Calculator(floor1,carpet1);

        System.out.println(calculator1.getTotalCost());




    }



}


