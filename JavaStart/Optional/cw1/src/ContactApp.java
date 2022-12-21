import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        ContactReader.readFile("contacts.csv")
                .ifPresentOrElse(ContactApp::findByEmail,
                        ContactApp::fileNotFound
                        );
        
    }

    private static void findByEmail(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        contactManager.findByEmail(email)
                .ifPresentOrElse(ContactApp::showShortInfo, ContactApp::contactNotFoundMessage
                        );
    }

    private static void showShortInfo(Contact contactByEmail) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contactByEmail.getShortInfo());
    }

    private static void fileNotFound() {
        System.out.println("Nie odnaleziono pliku z danymi");
    }

    private static void contactNotFoundMessage(){
        System.out.println("Nie odnaleziono kontaktu z takim adresem EMAIL");
    }
}