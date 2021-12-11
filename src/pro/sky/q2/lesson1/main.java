package pro.sky.q2.lesson1;

public class main {
    public static void main(String[] args) {

        Car car = new Car("Машина1",4);
        Car car2 = new Car("Машина2",4);

        Truck truck = new Truck("Грузовик1",4);
        Truck truck2 = new Truck("Грузовик2",8);


        Bicycle bicycle = new Bicycle("Велосипед1", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед2", 3);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);


    }
}
