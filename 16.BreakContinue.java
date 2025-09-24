class BreakContinue {
    public static void main(String[] args) {

        // Applying Break Using For loop
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("------Applying break using while loop--------");

        // Applying Break Using while loop
        int i = 1;
        while (true) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("-------- Continue Statement Start Here -------");

        // Applying Continue Using For loop
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }

        System.out.println("------Applying Continue using while loop--------");

        // Applying Continue Using while loop
        int k = 0;
        while (k < 10) {
            k++;
            if (k == 3) {
                continue;
            }
            System.out.println(k);
        }

        System.out.println("-------- Pass Statement Start Here -------");
    }
}
