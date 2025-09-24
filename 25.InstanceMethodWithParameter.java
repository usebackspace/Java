class AvengerParameter {
    // Instance method with two parameters: name and age
    void showAvenger(String name, int age) {
        System.out.println("Avenger Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        AvengerParameter team = new AvengerParameter(); // Creating object

        // Calling instance method with name and age
        team.showAvenger("Iron Man", 48);
        team.showAvenger("Thor", 1500);
        team.showAvenger("Spider-Man", 18);
    }
}
