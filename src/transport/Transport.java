package transport;

import java.util.List;
public abstract class Transport<T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    List <Mechanic> mechanicList;


    public Transport(String brand, String model, double engineVolume, T driver, List <Mechanic> mechanicList) {

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
        this.mechanicList = mechanicList;


    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
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

   public abstract void finishTheMove();
   public abstract void printType();
   public abstract void passDiagnostic() throws TransportTypeException;





    public String toString() {
        return "Автомобиль: " +
                " бренд = " + brand +
                " модель = " + model ;

    }
}
