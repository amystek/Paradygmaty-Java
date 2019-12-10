public class SuperCar extends Car {
    private boolean czyPoleasingowy;

    public SuperCar(String nazwa, int cena, boolean czyPoleasingowy) {
        super(nazwa, cena);
        this.czyPoleasingowy = czyPoleasingowy;
    }

    public boolean isCzyPoleasingowy() {
        return czyPoleasingowy;
    }

    public void setCzyPoleasingowy(boolean czyPoleasingowy) {
        this.czyPoleasingowy = czyPoleasingowy;
    }
}
