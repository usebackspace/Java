package string;

import java.util.Scanner;

class StringTwoDArrayInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define size of 2D array: 3 rows and 2 columns
        int rows = 3;
        int cols = 2;
        String[][] avengers = new String[rows][cols];

        // Take input from user for each element
        System.out.println("Enter names of Avengers for " + rows + " rows and " + cols + " columns:");

        for (int i = 0; i < rows; i++) { // Loop over rows
            for (int j = 0; j < cols; j++) { // Loop over columns
                System.out.print("Enter name for row " + i + ", column " + j + ": ");
                avengers[i][j] = scanner.nextLine();
            }
        }

        // Print the entered names
        System.out.println("\nEntered Avengers List:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Row " + i + " Column " + j + ": " + avengers[i][j]);
            }
        }

        scanner.close();
    }
}
