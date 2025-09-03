class WhileLoop {
    public static void main(String[] args) {

        // Simple while loop
        int i = 1;
        while (i < 4) {
            System.out.println("While loop");
            i = i + 1;
        }

        System.out.println("-----Nested While Loop--------");

        // Reset i for nested loop
        i = 1;
        while (i < 4) {
            System.out.println("Inner loop " + i);
            i = i + 1;

            int j = 1;
            while (j < 3) {
                System.out.println("Outer loop " + j);
                j = j + 1;
            }
        }
    }
}
