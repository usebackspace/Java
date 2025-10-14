package string;

class StringTwoDArray {
    public static void main(String[] args) {

        // 1. Declare and create 2D array with 3 rows and 2 columns
        String[][] avengers = new String[3][2];

        // 2. Assign values using row and column index
        avengers[0][0] = "Iron Man";
        avengers[0][1] = "Thor";

        avengers[1][0] = "Hulk";
        avengers[1][1] = "Black Widow";

        avengers[2][0] = "Captain America";
        avengers[2][1] = "Hawkeye";

        // Declare and initialize directly
        // String[][] avengers = {
        //         { "Iron Man", "Thor" },
        //         { "Hulk", "Black Widow" },
        //         { "Captain America", "Hawkeye" }
        // };

        // 3. Access an individual element
        System.out.println("First Avenger in first row: " + avengers[0][0]); // Iron Man

        // 4. Change a value
        avengers[1][0] = "Vision"; // Replacing Hulk

        // 5. Print all elements using nested loop
        System.out.println("Updated Avengers 2D List:");
        for (int i = 0; i < avengers.length; i++) { // rows
            for (int j = 0; j < avengers[i].length; j++) { // columns
                System.out.println("Row " + i + " Column " + j + ": " + avengers[i][j]);
            }
        }
    }
}
