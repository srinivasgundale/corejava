import java.util.ArrayList;
import java.util.HashMap;

//file write
import java.io.FileWriter;
import java.io.IOException;

//file read
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
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

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, Java! in output.txt file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader file = new FileReader("output.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        MyThread thread = new MyThread();
        thread.start();

    }
}