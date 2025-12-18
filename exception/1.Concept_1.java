package exception;

//   Simple try catch block

class Concept_1 {
    public static void main(String[] args) {
        try {
            
            System.out.println("Before Divsion");
            // int a=10/2;
            int a = 10 / 0;                // As Exceptions occur Program doesn't continue it directly switch to catch block
            System.out.println("After Divsion");
            
        } catch (ArithmeticException e) {
            
            System.out.println("Cannot divide by zero");
            // System.out.println(e);    // Provide the output provided by system
            
        }

        System.out.println("Program continues");
    }
}

// Only include operational part in try block which can give error
// try{
//     int a=10/2;
// }