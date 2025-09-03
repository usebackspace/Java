class If_Else_IF{
    public static void main(String[] args) {

        // Example 1: elif statement
        System.out.println("-----1. elif statement--------");
        if (5 < 4) {
            System.out.println("5 is greater");
        } else if (4 < 3) {
            System.out.println("4 is greater");
        } else if (6 > 7) {
            System.out.println("6 is smaller");
        } else {
            System.out.println("7 is greater");
        }

        System.out.println();

        // Example 2: elif statement with grade
        System.out.println("-----2. elif statement--------");
        int grade = 85;

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println();

        // Example 3: Nested elif with temperature and rain
        System.out.println("-----3. elif statement--------");
        int temperature = 25;
        boolean isRaining = true;

        if (temperature > 30) {
            if (isRaining) {
                System.out.println("It's hot, and it's raining. Consider staying indoors.");
            } else {
                System.out.println("It's hot. Enjoy the sunshine!");
            }
        } else if (temperature > 20) {
            if (isRaining) {
                System.out.println("It's warm, but it's raining. Don't forget your umbrella.");
            } else {
                System.out.println("It's warm and sunny. Perfect weather!");
            }
        } else {
            if (isRaining) {
                System.out.println("It's cool, and it's raining. Bring a jacket and an umbrella.");
            } else {
                System.out.println("It's cool and dry. Grab a light jacket and enjoy the day.");
            }
        }
    }
}
