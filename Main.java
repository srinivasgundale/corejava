import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020); // Object instantiation
        car1.displayInfo(); // Calling method

        Person person = new Person();
        person.setName("John");
        System.out.println("Name: " + person.getName());

        Dog dog = new Dog();
        dog.sound();
        dog.bite();

        DogBehaviour behaviour = new DogBehaviour();
        behaviour.sound();

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);

        System.out.println(scores.get("Alice"));  // Output: 90

    }
}