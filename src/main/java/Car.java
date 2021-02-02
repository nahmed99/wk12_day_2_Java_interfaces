public class Car implements Convert, IMove {

    private String name;
    private int age;

    public Car(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String convert() {
        return "Car data";
    }

    public String move(int distance) {
        return "Moved " + distance;
    }
}
