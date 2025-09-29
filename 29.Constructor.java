class AvengerConstructor {
    String name;
    String power;
    int age;

    // 1. Default constructor (same as no-arg if empty)
    AvengerConstructor() {
        System.out.println("Default Avenger created");
    }

    // 2. Single Parameter constructor (can initialize default values)
    AvengerConstructor(String nm) {
        this.name = nm;
        System.out.println("Avenger " + name + " created");
    }

    // 3. Parameterized constructor
    AvengerConstructor(String nm, String pr, int ag) {
        this.name = nm;
        this.power = pr;
        this.age = ag;
    }

    // Display method to show Avenger details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Power: " + power);
        System.out.println("Age: " + age);
        System.out.println("------------------------");
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        AvengerConstructor a1 = new AvengerConstructor();

        // Using no-arg constructor with 1 value
        AvengerConstructor a2 = new AvengerConstructor("Iron Man");

        // Using parameterized constructor
        AvengerConstructor a3 = new AvengerConstructor("Thor", "Thunder", 1500);
        a3.display();
    }
}
