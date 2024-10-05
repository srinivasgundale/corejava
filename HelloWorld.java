// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int age = 25;
        double salary = 55000.50;
        char grade = 'A';
        boolean isEmployed = true;
        String name = "John Doe";
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Employed: " + isEmployed);

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an Adult");
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }

        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);




    }
}
