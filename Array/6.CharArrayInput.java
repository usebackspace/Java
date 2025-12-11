import java.util.Scanner;

class CharArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the size of the char array: ");
        int size = sc.nextInt();  // Take size of array

        char[] arr = new char[size];  // Create char array of given size

        System.out.println("Enter " + size + " characters:");

        // Input characters using loop
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);  // Take one character as input
        }

        // Display the char array
        System.out.println("The char array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();  // Close the scanner
    }
}
