class AvengerInstanceReturn {
    // Instance method returning name and age as String
    String getAvengerDetails(String name, int age) {
        return "Avenger Name: " + name + "\nAge: " + age + "\n----------------------";
    }

    // Instance method returning power level as int
    int getPowerLevel(int powerLevel) {
        return powerLevel;
    }

    public static void main(String[] args) {
        AvengerInstanceReturn team = new AvengerInstanceReturn(); // Create object

        // Iron Man
        String ironManDetails = team.getAvengerDetails("Iron Man", 48);
        int ironManPowerLevel = team.getPowerLevel( 8500);

        // Thor
        String thorDetails = team.getAvengerDetails("Thor", 1500);
        int thorPowerLevel = team.getPowerLevel( 95000);

        // Print results
        System.out.println(ironManDetails);
        System.out.println("Power Level: " + ironManPowerLevel + " HP\n");

        System.out.println(thorDetails);
        System.out.println("Power Level: " + thorPowerLevel + " HP\n");

    }
}
