package Temperatura;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj aktualna temperature");
        double currentTemp = sc.nextInt();
        System.out.println("Podaj docelowa temperature");
        double targetTemp = sc.nextInt();

        while (currentTemp != targetTemp){
            System.out.println("Aktualna temperatura: " + currentTemp);
            double tempTemp = targetTemp - currentTemp;
            if (tempTemp > 0){
                currentTemp += 0.5;
            }else if(tempTemp < 0){
                currentTemp -= 0.5;
            }
        }
        System.out.println("Osiagnieto temperature docelowa: "+ currentTemp + " stopni.");
    }
}