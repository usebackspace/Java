class LabelContinue {
    
    public static void main(String[] args) {

        System.out.println("===== Unlabeled Continue =====");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2) {
                    continue; // skips only the current inner loop iteration
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("===== Labeled Continue =====");

        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2) {
                    continue outer; // skips current outer loop iteration
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

    }
}
