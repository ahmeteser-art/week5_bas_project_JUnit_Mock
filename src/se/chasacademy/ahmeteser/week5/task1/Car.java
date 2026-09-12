package se.chasacademy.ahmeteser.week5.task1;

public class Car {

    private String registreringsnummer;
    private String brand;

    public Car(String registreringsnummer, String brand) {
        this.registreringsnummer = registreringsnummer;
        this.brand = brand;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public String getBrand() {
        return brand;
    }
}
