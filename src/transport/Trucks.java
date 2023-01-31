package transport;

public class Trucks extends Transport<Category_C>{
    private LoadCapacity loadCapasity;

    public Trucks(String brand, String model, double engineVolume, Category_C driver, LoadCapacity loadCapasity) {
        super(brand, model, engineVolume, driver);
        this.loadCapasity = loadCapasity;
    }

    public LoadCapacity getLoadCapasity() {
        return loadCapasity;
    }

    public void setLoadCapasity(LoadCapacity loadCapasity) {
        this.loadCapasity = loadCapasity;
    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMove() {

    }

    @Override
    public void maxSpeed() {

    }

    @Override
    public void pitStop() {

    }

    @Override
    void printType() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
