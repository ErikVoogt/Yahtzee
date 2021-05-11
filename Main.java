package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        YahtzeeSpel spelen = new YahtzeeSpel();
        spelen.spelen();


    }
}

class YahtzeeSpel {

    ArrayList dobbelstenen = new ArrayList();






    void spelen(){
        dobbelstenen.add("dobbelsteen");
        dobbelstenen.add("dobbelsteen");
        dobbelstenen.add("dobbelsteen");
        dobbelstenen.add("dobbelsteen");
        dobbelstenen.add("dobbelsteen");
        boolean doorspelen = true;
        Scanner invoer = new Scanner(System.in);
        while(doorspelen){
            System.out.println("Druk op Enter om te spelen of op q om te stoppen \n");
            String keuze = invoer.nextLine();
            if(keuze.equals("")){
                System.out.println("Je hebt op enter gedrukt");
            } else if(keuze.equals("q") ){
                doorspelen = false;
                System.out.println("Het spel is klaar");
            }else {
                System.out.println("Kies opnieuw");
            }
        }
    }



    class Dobbelsteen{

        int worp;

        int werpen(){
            worp = (int) (Math.random() *6) +1;
            return worp;


        }
    }

}

