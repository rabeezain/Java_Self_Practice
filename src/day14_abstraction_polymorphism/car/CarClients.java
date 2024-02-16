package day14_abstraction_polymorphism.car;

public class CarClients {

    public static void main(String[] args) {


        Car toyota = new Toyota("Toyota", "Yaris", 1887, 15_000, "Black");
        Honda honda = new Honda("Honda", "Civic", 2019, 12_000, "White");
        BMW bmw = new BMW("BMW", "X6", 2018, 20_000, "Blue");
        Audi audi = new Audi("Audi", "A4", 2021, 24_000, "Green");
        Mercedes mercedes = new Mercedes("Mercedes", "E-Class", 2022, 28_000, "Gray");
        Tesla tesla = new Tesla("Tesla", "Model S", 2020, 38_000, "Red");
        Nio nio = new Nio("Nio", "ES7", 2019, 25_000, "Pink");
        CydeoCar cydeoCar = new CydeoCar("Cydeo", "Java", 2023, 4500, "Yellow");

        System.out.println(toyota);
        System.out.println("--------------------------------------");

        carFunctions(toyota);
        System.out.println("--------------------------------------");
        carFunctions(honda);
        System.out.println("--------------------------------------");
        carFunctions(bmw);
        System.out.println("--------------------------------------");
        carFunctions(audi);
        System.out.println("--------------------------------------");
        carFunctions(mercedes);
        System.out.println("--------------------------------------");
        carFunctions(tesla);
        System.out.println("--------------------------------------");
        carFunctions(nio);
        System.out.println("--------------------------------------");
        carFunctions(cydeoCar);

    }

    public static void carFunctions(Car car){

        System.out.println("Testing " + car.getMake() + " " + car.getModel() + " :");
        car.start();
        car.drive();
        car.stop();

        if (car instanceof AutoPark){ ((AutoPark) car).autoPark(); }
        if (car instanceof AutoPilot){ ((AutoPilot) car).selfDrive();}
        if (car instanceof Flyable){ ((Flyable) car).fly();}

    }
}
/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */