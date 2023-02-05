import transport.*;

import static transport.BodyType.*;
import static transport.CapacityPassengers.*;
import static transport.LoadCapacity.*;


public class Main {
    public static void main(String[] args) {
        Category_B category_b = new Category_B("asd", "true", 5 );
        Category_C category_c = new Category_C("agd", "true", 6);
        Category_D category_d = new Category_D("ask", "true", 7);

        Car myCar1 = new Car("Audi","A8", 2.4, category_b, SEDAN);
        Car myCar2 = new Car("BMW","E8", 2.8, category_b,SEDAN);
        Car myCar3 = new Car("LADA","Vesta", 1.8, category_b,SEDAN);

        Bus myBus1 = new Bus("Kia", "Granbird", 17.2, category_d,C1);
        Bus myBus2 = new Bus("Hunday", "Granbird", 18.3, category_d,C2);
        Bus myBus3 = new Bus("Kia", "Granbird", 20, category_d, C3);

        Trucks myTrucks1 = new Trucks("Man","MAN TGS 6×6", 12.4, category_c, N1);
        Trucks myTrucks2 = new Trucks("Man","MAN TGS 6×6", 12.4, category_c, N2);
        Trucks myTrucks3 = new Trucks("Man","MAN TGS 6×6", 12.4, category_c, N3);


        try {
            System.out.println("1");
            myCar1.passDiagnostic();
            myCar2.passDiagnostic();
            System.out.println("2");

        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }


    }
}