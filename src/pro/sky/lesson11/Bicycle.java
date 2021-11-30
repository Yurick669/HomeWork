package pro.sky.lesson11;

public class Bicycle extends ParentClass {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}