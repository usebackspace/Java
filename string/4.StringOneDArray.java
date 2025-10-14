package string;

class StringOneDArray {
    public static void main(String[] args) {

        // 1. Declare and create array of size 4
        String[] avengers = new String[4];    // More suitable for taking value from the user.

        // 2. Assign values using index
        avengers[0] = "Iron Man";
        avengers[1] = "Thor";
        avengers[2] = "Hulk";
        avengers[3] = "Captain America";

        // Step 1: Declare and initialize
        // String[] avengers = { "Iron Man", "Thor", "Hulk", "Captain America" };

        // Step 2: Access individual elements
        System.out.println("First Avenger: " + avengers[0]); // Iron Man

        // Step 3: Change a value
        avengers[2] = "Black Widow"; // Replacing Hulk

        // If we want to Take input from user using a loop
        // System.out.println("Enter names of 4 Avengers:");
        // for (int i = 0; i < avengers.length; i++) {
        //     System.out.print("Enter name for index " + i + ": ");
        //     avengers[i] = scanner.nextLine();
        // }

        // Step 4: Print all elements using loop
        System.out.println("Updated Avengers List:");
        for (int i = 0; i < avengers.length; i++) {
            System.out.println("Index " + i + ": " + avengers[i]);
        }
    }
}



