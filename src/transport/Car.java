package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int capacity;
    private boolean seasonTires;



    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String regNumber, int capacity, boolean seasonTires) {

        if (brand == "" || brand == null) { brand = "default"; }
        if (engineVolume <= 0) { engineVolume = 1.5; }
        if (year <= 0) { year = 2000; }
        if (color == "" || color == null) { color = "белый"; }
        if (transmission == "" || transmission == null) { transmission = "default"; }
        if (bodyType == "" || bodyType == null) { bodyType = "default"; }
        if (regNumber == "" || regNumber == null) { regNumber = "default"; }
        if (capacity <= 0) { capacity = 5; }

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.capacity = capacity;
        this.seasonTires = seasonTires;

    }
    public void seasonOfTires(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            seasonTires = false;
        } else {
            seasonTires = true;
        }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSeasonTires() {
        return seasonTires;
    }

    public void setSeasonTires(boolean seasonTires) {
        this.seasonTires = seasonTires;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "бренд = " + brand + '\'' +
                ", модель = " + model + '\'' +
                ", объём двигателя = " + engineVolume +
                ", цвет = " + color + '\'' +
                ", год выпуска = " + year +
                ", страна сборки = " + country + '\'' +
                ", коробка передач = " + transmission +'\'' +
                ", тип кузова = " + bodyType + '\'' +
                ", рег. номер = " + regNumber + '\'' +
                ", количество мест = " + capacity + '\'' +
                (seasonTires ? "зимняя" : "летняя" + " резина") + '\'';
    }
}
