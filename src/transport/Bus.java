package transport;

import java.util.List;

public class Bus extends Transport<Category_D> {
    private CapacityPassengers capacityPassengers;

    public Bus(String brand, String model, double engineVolume, Category_D driver, CapacityPassengers capacityPassengers, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.capacityPassengers = capacityPassengers;
    }

    public CapacityPassengers getCapacityPassengers() {
        return capacityPassengers;
    }

    public void setCapacityPassengers(CapacityPassengers capacityPassengers) {
        this.capacityPassengers = capacityPassengers;
    }
    @Override
    public void pitStop() {
        System.out.println("bvjvm");

    }
    @Override
    public void bestLapTime() {
    }
    @Override
    public void maxSpeed() {

    }


    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMove() {

    }



    @Override
    public void printType() {

    }

    @Override
    public void passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобус не проходит диагностику");
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
