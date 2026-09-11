public class Cat {
    private String name;
    private int age;

    // Default Constructor
    public Cat() {
        this.name ="Unknown";
        this.age = 0;
    }

    public void displayInfo() {
        System.out.println("Cat Name:"+ name);
        System.out.println("Cat Age:"+age);
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.displayInfo();
    }
}