class AvengerParameterStatic {
  // Static method with two parameters
    static void showAvenger(String name, int age) {
        System.out.println("Avenger Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        // Calling static method directly without creating an object
        showAvenger("Iron Man", 48);
        showAvenger("Thor", 1500);
        showAvenger("Spider-Man", 18);
    }   
}
