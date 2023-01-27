package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume/*String color, int year, String country, int maxSpeed*/) {
        super(brand, model,engineVolume/*color, year, country, maxSpeed*/);
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
    public void bestLapTime() {
        Competing.super.bestLapTime();
    }

    @Override
    public void pitStop() {
        Competing.super.pitStop();
    }

    @Override
    public void maxSpeed() {
        Competing.super.pitStop();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
