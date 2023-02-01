import transport.*;

public class Main {
    public static void main(String[] args) {
        Category_B category_b = new Category_B("asd", "true", 5);
        Category_C category_c = new Category_C("agd", "true", 6);
        Category_D category_d = new Category_D("ask", "true", 7);
        Car myCar = new Car("Audi","A8", 2.4, category_b);
        Bus myBus = new Bus("Kia", "Granbird", 17.2, category_d);
        Trucks myTrucks = new Trucks("Man","MAN TGS 6×6", 12.4, category_c);


    }
}