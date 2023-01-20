package transport;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int capacity;
    private boolean seasonTires;



    public Car(String brand, String model, double engineVolume, String color, int year, String country, int maxSpeed,
               String transmission, String bodyType, String regNumber, int capacity, boolean seasonTires) {
        super(brand, model,  color, year, country, maxSpeed);


        if (engineVolume <= 0) { engineVolume = 1.5; }

        if (transmission == "" || transmission == null) { transmission = "default"; }
        if (bodyType == "" || bodyType == null) { bodyType = "default"; }
        if (regNumber == "" || regNumber == null) { regNumber = "default"; }
        if (capacity <= 0) { capacity = 5; }


        this.engineVolume = engineVolume;

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




    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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
        return super.toString() +
                ", объём двигателя = " + engineVolume +
                ", коробка передач = " + transmission +'\'' +
                ", тип кузова = " + bodyType + '\'' +
                ", рег. номер = " + regNumber + '\'' +
                ", количество мест = " + capacity + '\'' +
                (seasonTires ? "зимняя" : "летняя" + " резина") + '\'';
    }
}
