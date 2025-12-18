package exception;

// Simple try-catch-finally block

class Concept_4 {
    public static void main(String[] args) {

        try {
            System.out.println("Before Division");
            int a = 10 / 2;   // Exception occurs here
            System.out.println("After Division"); // This will NOT execute

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            // This block always executes
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues");


        // finally Without catch

        //  try {
        //     int a = 10 / 2;
        // } finally {
        //     System.out.println("Finally executed of wihout catch");
        // }
    }
}
