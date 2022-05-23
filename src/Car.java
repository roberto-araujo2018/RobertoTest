public class Car {
    private int cylinders;
    private int wheels;
    private String name;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine () {
        return this.name + " startEngine()";
    }

    public String accelerate (){
        return this.name + " accelerate()";
    }

    public String brake(){
        return this.name + " brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
