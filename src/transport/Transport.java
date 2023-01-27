package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
   // private String color;
   // private final int year;
    //private final String country;
    //private int maxSpeed;

    public Transport(String brand, String model, double engineVolume/*String color, int year, String country, int maxSpeed*/) {

        if (brand == "" || brand == null) {
            brand = "default";
        }
        if (engineVolume <= 0) { engineVolume = 1.5; }


        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;


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


    public void startMoving(){

   }
   public void finishTheMove(){

   }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "бренд = " + brand +
                ", модель = " + model ;

    }
}
