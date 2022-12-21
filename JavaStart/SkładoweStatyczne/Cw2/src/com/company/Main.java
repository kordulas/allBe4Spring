package com.company;

public class Main {

    public static void main(String[] args) {

        szklanka(0.5);
        lyzka(5);
        lyzeczka(8.5);

    }
    public static void szklanka(double ile){
        System.out.println(ile + " szklanka/i/ek to: " + (ile * 250) + " ml");
    }
    public static void lyzka(double ile){
        System.out.println(ile + " lyzka/i/ek to: " + (ile * 15) + " ml");
    }
    public static void lyzeczka(double ile){
        System.out.println(ile + " lezeczka/i/ek to: " + (ile * 5) + " ml");
    }
}
