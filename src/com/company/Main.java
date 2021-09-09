package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo: ");
        float cislo = sc.nextFloat();
        int vstup = 1;
        //float soucet = 0;

        for (int docisli = 0; cislo > docisli; cislo--) {

                System.out.println(1 / cislo);
                //soucet = soucet + cislo;
            //System.out.println("1/" + vstup + "=>" + 1 / cislo);
            //vstup++;

        }

        //System.out.println(soucet);

    }
}