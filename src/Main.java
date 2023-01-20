import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car("Lada","Granta", 1.7, "", 2015, "Россия",
                160,"МКПП", "седан", "а456пр56", 5, true );

        Car myCar2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия",
                250,"МКПП", "седан", "а456пр56", 5, true);

        Car myCar3 = new Car("BMW", "Z8", 0, "чёрный", 2021, "Германия",
                300,"МКПП", "седан", "а456пр56", 5, true);

        Car myCar4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2021, "Южная Корея",
                180,"МКПП", "седан", "а456пр56", 5, true);

        Car myCar5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                170,"МКПП", "седан", "а456пр56", 5, true);

        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(myCar4);
        System.out.println(myCar5);

        Bus myBus = new Bus("Камаз", "Нефаз", "белый", 2021,"Россия", 120);
        System.out.println(myBus);
    }
}