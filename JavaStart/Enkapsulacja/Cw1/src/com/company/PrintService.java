package com.company;

public class PrintService {
    public void printSummary(Client klient, double orginalPrice, double disountPrice){
        powitaj(klient);
        printPrices(orginalPrice,disountPrice);
    }

    public void powitaj(Client klient) {
        String firstName = klient.getFirstName();
        String secondName = klient.getSecondName();
        if(firstName != null && secondName == null)
                System.out.println("Witaj: "+ klient.getFirstName());
          else if(firstName!= null & secondName != null)
                System.out.println("Witaj: " + klient.getFirstName() + " "+ klient.getSecondName());
          else if (firstName == null && secondName != null)
                System.out.println("Dzień dobry pani/panie: " + klient.getSecondName());
          else
            System.out.println("Witaj nieznajomy");
        }

        private void printPrices(double originalPrice, double discountPrice){
            System.out.println("Kwota przed rabate: "+ originalPrice);
            System.out.println("Kwota po rabacie: "+ discountPrice);
        }
    }

