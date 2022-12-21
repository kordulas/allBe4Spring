import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Aby rozpocząć liczenie czasu wciśnij ENTER!");
        Scanner skanuj = new Scanner(System.in);
        skanuj.nextLine();
        Instant i1 = Instant.now();

        System.out.println("Aby zatrzymać odlicznie klinij ponownie wciśnij ENTER!");
        skanuj.nextLine();
        Instant i2 = Instant.now();

        Duration timeBetween = Duration.between(i1,i2);
        System.out.println("Upłyneło: " + timeBetween.getSeconds() + " sekund");
        skanuj.close();
    }
}
