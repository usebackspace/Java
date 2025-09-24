// Avenger class definition
class Avenger {
    String name;
    String superPower;
    String weapon;

    // Constructor
    Avenger(String name, String superPower, String weapon) {
        this.name = name;
        this.superPower = superPower;
        this.weapon = weapon;
    }

    // Method to display Avenger info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Super Power: " + superPower);
        System.out.println("Weapon: " + weapon);
        System.out.println("--------------------------");
    }
}

// Main class
public class AvengerDemo {
    public static void main(String[] args) {
        // Creating Avenger objects
        Avenger ironMan = new Avenger("Iron Man", "Genius-level intellect", "Suit");
        Avenger captainAmerica = new Avenger("Captain America", "Super Soldier", "Shield");
        Avenger thor = new Avenger("Thor", "God of Thunder", "Mjolnir");

        // Displaying their info
        System.out.println("Avengers Info:");
        System.out.println("==========================");
        ironMan.displayInfo();
        captainAmerica.displayInfo();
        thor.displayInfo();
    }
}
