import java.util.Objects;

public class User {
    private String imie;
    private String nazwisko;
    private String email;
    private String telefon;


    // nie tworzę konstruktora bezparametrowego, ponieważ pola imie i nazwisko są wymagane
    public User(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public User(String imie, String nazwisko, String email, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.telefon = telefon;
    }

    // metoda equals stworzona automatycznie przez IntelliJ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;     // porównanie samemu do siebie daje true
        if (!(o instanceof User)) return false;     // jeśli Object nie jest instancją klasy User to zwracamy false
        User user = (User) o;       // rzutujemy Object na User i sprawdzamy czy imiona i nazwiska się zgadzają
        return getImie().equals(user.getImie()) &&
                getNazwisko().equals(user.getNazwisko());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko());
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
