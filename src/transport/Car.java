package transport;

public class Car extends Transport<Category_B> {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, Category_B driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }

    @Override
    public void pitStop() {

    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMove() {

    }

    @Override
    void printType() {

    }

    @Override
    public String toString() {
        return super.toString();
        }
    }

