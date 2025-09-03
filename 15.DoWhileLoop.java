class DoWhileLoop {
    public static void main(String[] args) {

        // Simple do-while loop
        int i = 1;
        do {
            System.out.println("Do-While loop");
            i = i + 1;
        } while (i < 4);

        System.out.println("-----Nested Do-While Loop--------");

        // Nested do-while loop
        i = 1;
        do {
            System.out.println("Inner loop " + i);
            i = i + 1;

            int j = 1;
            do {
                System.out.println("Outer loop " + j);
                j = j + 1;
            } while (j < 3);

        } while (i < 4);
    }
}
