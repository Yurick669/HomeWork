package pro.sky.q2.lesson1;

public class ParentClass {

    public ParentClass(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    private final String modelName;
    private final int wheelsCount;

    public void service() {
        System.out.println("modelName = " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updatetype();
        }
    }

    public void updatetype() {
        System.out.println("");
    }


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
