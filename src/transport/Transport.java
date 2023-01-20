package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {

        if (brand == "" || brand == null) {
            brand = "default";
        }
        if (year <= 0) {
            year = 2000;
        }
        if (color == "" || color == null) {
            color = "белый";
        }

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "бренд = " + brand +
                ", модель = " + model +
                ", цвет = " + color +
                ", год выпуска = " + year +
                ", страна сборки = " + country +
                ", максимальная скорость = " + maxSpeed;

    }
}
