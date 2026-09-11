public class Dog {
    private String name;
    private String color;

    // Parameterized Constructor
    public Dog(String name, String color) {
        this.name= name;
        this.color= color;
    }

   public void displayInfo() {
    System.out.println("Dog Name:"+ name);
    System.out.println("Dog Color:"+ color);
   }

    public static void main(String[] args) {
        Dog myDog = new Dog("Tommy", "Brown");
        myDog.displayInfo();
    }
}