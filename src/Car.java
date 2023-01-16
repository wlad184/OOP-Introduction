public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (brand == "" || brand == null){ this.brand = "default"; }
        if (engineVolume <= 0){ this.engineVolume = 1.5; }
        if (year <= 0){ this.year = 2000; }
        if (color == "" || color == null){ this.color = "белый"; }
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "бренд = " + brand + '\'' +
                ", модель = " + model + '\'' +
                ", объём двигателя = " + engineVolume +
                ", цвет = " + color + '\'' +
                ", год выпуска = " + year +
                ", страна сборки = " + country + '\'';
    }
}
