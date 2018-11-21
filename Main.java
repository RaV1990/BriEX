//Program ten jedynie trywialnie wypisuje w oknie konsoli
// dane osoby z podanego pliku  xml (wszystkie)
// lub wypisuje część danych z pliku txt w innym wypadku
// pomija wprowadzoną ścieżkę i wyświetla pola poszczególnych
// obiektów (stworzonych ręcznie podczas działania programu)
// Poszczególne zparsowane pola nie są wrzucone w obiekty
// i nie przekazane do tabel bazy danych (brak wogóle połączenia z bazą danych)
// klasa kontaktów stworzona poglądowo (brak rozdzielenia na typ kontaktu i nowych id do kolejnego)

package odczytywanieZPlikuDoBazy;

import java.util.Scanner;

import static odczytywanieZPlikuDoBazy.Contacts.contacts;
import static odczytywanieZPlikuDoBazy.Person.persons;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku");
        String ścieżka = scanner.nextLine();

        boolean xml = ścieżka.endsWith(".xml");
        boolean txt = ścieżka.endsWith(".txt");

        //wybór parsera po rozszerzeniu (.xml lub .txt)
        if(xml) {
            XMLParser.zparsujXMLa(ścieżka);
        }
        if(txt) {
            CSVParser.zparsujCSV(ścieżka);
        }
        //przykładowe ustawienia pól w obiekcie klasy Person
        else {
            Person marek = new Person(1);
            Person wiola = new Person(2);
            Contacts marekContacts = new Contacts(marek.getId());
            Contacts wiolaContacts = new Contacts(wiola.getId());
            wiola.setImie("Wioletta");
            marek.setMiasto("Lublin");
            wiola.setWiek(18);
            persons.add(marek);
            persons.add(wiola);
            contacts.add(marekContacts);
            contacts.add(wiolaContacts);
        }


        System.out.println(persons);
        System.out.println(contacts);
    }
}
