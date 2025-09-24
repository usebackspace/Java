class Model {
    String model="Ford";
    int year;

    void carInfo() {
        System.out.println("Model of car is :"+model+". Launch in year "+year);
    }
}

class Car {
    public static void main(String[] args) {
        Model m = new Model();

        // m.model = "Ferari";            // Intializating Value
        // m.year = 1934;                 // Intializating Value

        System.out.println("Model is :"+m.model);
        System.out.println("Launch Year is :"+m.year);
    }
}
