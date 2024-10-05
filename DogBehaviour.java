class DogBehaviour extends Animal {
    public void sound() {
        System.out.println("Dog barking");
        try {
            int result = 10 / 0;  // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
        
    }
}