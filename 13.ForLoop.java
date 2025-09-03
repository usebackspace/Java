class ForLoop {
    public static void main(String[] args) {

       
        System.out.println("-------- Printing Inner loop And Outer Loop----------");

        // Nested For Loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer Loop");
            for (int j = 1; j < 4; j++) {
                System.out.println("Inner loop");
            }
            System.out.println("Another Loop Started");
        }

        System.out.println("-------- Printing Table Using For Loop ----------");

        int x = 11;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }

        System.out.println("-------- Printing Table Using Nested For Loop ----------");

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println(); // Add an empty line to separate each row
        }

    }
}
