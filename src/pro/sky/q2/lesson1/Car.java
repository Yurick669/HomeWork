package pro.sky.q2.lesson1;

public class Car extends ParentClass {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
