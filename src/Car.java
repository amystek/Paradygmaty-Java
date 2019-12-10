public class Car {
    private String nazwa;
    private int cena;
    private double spalanie;

    public Car() {
        this.nazwa = null;
        this.cena = -1;
        this.spalanie = -1;
    }

    public Car(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.spalanie = -1;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }
}
