class Avenger {
    String name;
    String power;
    int age;

    // Constructor 1 - No parameters
    Avenger() {
        System.out.println("Unknown Avenger created.");
    }

    // Constructor 2 - One parameter
    Avenger(String n) {
        name = n;
        System.out.println("Avenger " + name + " created.");
    }

    // Constructor 3 - Three parameters
    Avenger(String n, String p, int a) {
        name = n;
        power = p;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Power: " + power + ", Age: " + age);
    }

    public static void main(String[] args) {
        Avenger a1 = new Avenger(); // Calls Constructor 1
        Avenger a2 = new Avenger("Iron Man"); // Calls Constructor 2
        Avenger a3 = new Avenger("Thor", "Thunder", 1500); // Calls Constructor 3
        a3.display();
    }
}
