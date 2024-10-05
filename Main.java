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
    }
}