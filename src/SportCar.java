public class SportCar extends Car {
    private boolean czyWyscigowy;

    public SportCar(boolean czyWyscigowy) {
        this.czyWyscigowy = czyWyscigowy;
    }

    public SportCar(String nazwa, int cena, boolean czyWyscigowy) {
        super(nazwa, cena);
        this.czyWyscigowy = czyWyscigowy;
    }

    public boolean isCzyWyscigowy() {
        return czyWyscigowy;
    }

    public void setCzyWyscigowy(boolean czyWyscigowy) {
        this.czyWyscigowy = czyWyscigowy;
    }
}
