package transport;

public class Car extends Transport implements Competing {


    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void bestLapTime() {
        Competing.super.bestLapTime();
    }

    @Override
    public void maxSpeed() {
        Competing.super.maxSpeed();
    }

    @Override
    public void pitStop() {
        Competing.super.pitStop();
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void finishTheMove() {
        super.finishTheMove();
    }

    @Override
    public String toString() {
        return super.toString();
        }
    }

