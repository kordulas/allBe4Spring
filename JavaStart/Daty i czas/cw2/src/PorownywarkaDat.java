import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class PorownywarkaDat {
    public static void main(String[] args) {
        try {
            LocalDate data1 = readDateFromUser();
            LocalDate data2 = readDateFromUser();

            showLaterDate(data1, data2);
            showPeroidBetween(data1, data2);
        } catch (DateTimeParseException e) {
            System.err.println("Podano date w zlym formacie!!!");
        }
    }
    private static void showPeroidBetween(LocalDate data1, LocalDate data2) {
        Period between = Period.between(data1,data2);
        int days = Math.abs(between.getDays());
        int months = Math.abs(between.getMonths());
        int years = Math.abs(between.getYears());
        System.out.format("Podane daty dzieli %d lat, %d miesiecy i %d dni", years,months,days);
    }

    private static void showLaterDate(LocalDate data1, LocalDate data2) {
        LocalDate data = data1.isAfter(data2)? data1:data2;
        System.out.println("Pozniejsza data to: " + data);
    }

    private static LocalDate readDateFromUser() {
        Scanner skanuj = new Scanner(System.in);
//        System.out.println("Podaj dzień: ");
//        int dzien = skanuj.nextInt();
//        System.out.println("Podaj miesiąc: ");
//        int miesiac = skanuj.nextInt();
//        System.out.println("Podaj rok: ");
//        int rok = skanuj.nextInt();
        System.out.println("Podaj date w formacie 'yyyy-MM-dd");
        String uzytkownika = skanuj.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(uzytkownika,dateTimeFormatter);

    }
}
