import transport.*;

import java.util.*;

import static transport.BodyType.*;
import static transport.CapacityPassengers.*;
import static transport.LoadCapacity.*;


public class Main {
    public static void main(String[] args) {
        Category_B category_b = new Category_B("asd", "true", 5);
        Category_C category_c = new Category_C("agd", "true", 6);
        Category_D category_d = new Category_D("ask", "true", 7);

        Mechanic mechanic1 = new Mechanic("AA", "B'B");
        Mechanic mechanic2 = new Mechanic("HH", "D'D");
        Mechanic mechanic3 = new Mechanic("GG", "L'L");
        Mechanic mechanic4 = new Mechanic("UU", "W'W");


        Car myCar1 = new Car("Audi","A8", 2.4, category_b, SEDAN, List.of(mechanic1));
        Car myCar2 = new Car("BMW","E8", 2.8, category_b,SEDAN, List.of(mechanic2));
        Car myCar3 = new Car("LADA","Vesta", 1.8, category_b,SEDAN, List.of(mechanic1));

        Bus myBus1 = new Bus("Kia", "Granbird", 17.2, category_d,C1, List.of(mechanic3));
        Bus myBus2 = new Bus("Hunday", "Granbird", 18.3, category_d,C2, List.of(mechanic1));
        Bus myBus3 = new Bus("Kia", "Granbird", 20, category_d, C3, List.of(mechanic3));

        Trucks myTrucks1 = new Trucks("Man","MAN TGS 6×6", 12.4, category_c, N1, List.of(mechanic4));
        Trucks myTrucks2 = new Trucks("Man","MAN TGS 6×6", 12.4, category_c, N2, List.of(mechanic3));
        Trucks myTrucks3 = new Trucks("Man","MAN TGS 6×6", 12.4, category_c, N3, List.of(mechanic4));


        try {
            System.out.println("1");
            myCar1.passDiagnostic();
            myCar2.passDiagnostic();
            System.out.println("2");

        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        List<Transport> listTransport = new ArrayList<>();
        listTransport.add(myCar1);
        listTransport.add(myCar2);
        listTransport.add(myCar3);
        listTransport.add(myBus1);
        listTransport.add(myBus2);
        listTransport.add(myBus3);
        listTransport.add(myTrucks1);
        listTransport.add(myTrucks2);
        listTransport.add(myTrucks3);




        List <Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);
        mechanicList.add(mechanic4);

        System.out.println(myCar1.getMechanicList());

        Map<Transport, Mechanic> map = new HashMap<>();
        for (int i = 1; i < listTransport.size(); i++){
            int j = i;
            if (mechanicList.size() - 1 < i) j = i % mechanicList.size();
            map.put(listTransport.get(i), mechanicList.get(j));
        }
        for (Map.Entry<Transport, Mechanic> log : map.entrySet()){
            System.out.println(log.getKey() + " механик " + log.getValue());
        }
        System.out.println();

        Set<Driver> drivers = new HashSet<>();
        drivers.add(category_b);
        drivers.add(category_c);
        drivers.add(category_d);
        drivers.add(category_d);

        Iterator<Driver> iterName = drivers.iterator();
        while (iterName.hasNext()) {
            System.out.println(iterName.next());
        }

    }
}