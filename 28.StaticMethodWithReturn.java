class AvengerStaticReturn {

    // Static method returning name and age as String
    static String getAvengerDetails(String name, int age) {
        return "Avenger Name: " + name + "\nAge: " + age + "\n----------------------";
    }

    // Static method returning power level as int
    static int getPowerLevel(int powerLevel) {
        return powerLevel;
    }

    public static void main(String[] args) {
        // Iron Man
        String ironManDetails = getAvengerDetails("Iron Man", 48);
        int ironManPowerLevel = getPowerLevel(8500);

        // Thor
        String thorDetails = getAvengerDetails("Thor", 1500);
        int thorPowerLevel = getPowerLevel(95000);

        // Print results
        System.out.println(ironManDetails);
        System.out.println("Power Level: " + ironManPowerLevel + " HP\n");

        System.out.println(thorDetails);
        System.out.println("Power Level: " + thorPowerLevel + " HP\n");
    }
}
