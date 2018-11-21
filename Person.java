package odczytywanieZPlikuDoBazy;

import java.util.ArrayList;
import java.util.List;


public class Person {
    private int id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private String miasto;
    public static List<Person> persons = new ArrayList<Person>();

    public Person() {
        this.imie = "";
        this.nazwisko = "";
        this.miasto ="";
    }

    public Person(int id) {
        this.id = id;
        this.imie = "";
        this.nazwisko = "";
        this.miasto ="";
    }

    public Person(int id, String imie, String nazwisko, int wiek, String miasto) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.miasto = miasto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void dodajOsobę(int id) {
        Person osoba = new Person(id);
        persons.add(osoba);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
