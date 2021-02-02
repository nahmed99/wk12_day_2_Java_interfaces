public class Car implements Convert, IMove, IStart {

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

    public String start() {
        return "I have started, so I will finish!";
    }
}
