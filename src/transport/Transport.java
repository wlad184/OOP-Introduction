package transport;

public abstract class Transport<T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private double engineVolume;
   private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {

        if (brand == "" || brand == null) {
            brand = "default";
        }
        if (model == "" || model == null) {
            model = "default";
        }
        if (engineVolume <= 0) { engineVolume = 1.5; }


        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;


    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
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
        if (engineVolume <= 0){engineVolume =1.7;}
        this.engineVolume = engineVolume;
    }


    abstract void startMoving();

   abstract void finishTheMove();
   abstract void printType();





    @Override
    public String toString() {
        return "Автомобиль: " +
                "бренд = " + brand +
                ", модель = " + model ;

    }
}
