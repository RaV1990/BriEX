package odczytywanieZPlikuDoBazy;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private int id;
    private int id_klienta;
    private int telefon;
    private String e_mail;
    private String icq;
    private String jabbler;
    public static List<Contacts> contacts = new ArrayList<Contacts>();

    public Contacts() {
    }

    public Contacts(int id_klienta) {
        this.id_klienta = id_klienta;
    }

    public Contacts(int id, int id_klienta) {
        this.id = id;
        this.id_klienta = id_klienta;
    }

    public Contacts(int id, int id_klienta, int telefon, String e_mail, String icq, String jabbler) {
        this.id = id;
        this.id_klienta = id_klienta;
        this.telefon = telefon;
        this.e_mail = e_mail;
        this.icq = icq;
        this.jabbler = jabbler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(int id_klienta) {
        this.id_klienta = id_klienta;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }

    public String getJabbler() {
        return jabbler;
    }

    public void setJabbler(String jabbler) {
        this.jabbler = jabbler;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", id_klienta=" + id_klienta +
                ", telefon=" + telefon +
                ", e_mail='" + e_mail + '\'' +
                ", icq='" + icq + '\'' +
                ", jabbler='" + jabbler + '\'' +
                '}';
    }
}
