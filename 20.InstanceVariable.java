class Model {
    String model="Ford";      // Instance Variable
    int year; // Instance Variable
    
    //We can access Instance variable and Static variable directly in instance method in same class.
    void carInfo() {
        System.out.println("Model of car is :"+model+". Launch in year "+year);
    }
}

class InstanceVariable {
    public static void main(String[] args) {
        Model m1 = new Model();
        Model m2 = new Model();
        Model m3 = new Model();

        m1.model = "Ferari";
        m2.model = "BMW";
        m3.model = "Volvo";
        
        m1.year = 1934;
        m2.year = 1935;
        m3.year = 1936;

        System.out.println("Model is :"+m1.model);
        System.out.println("Launch Year is :"+m1.year);
        System.out.println("Model is :"+m2.model);
        System.out.println("Launch Year is :"+m2.year);
        System.out.println("Model is :"+m3.model);
        System.out.println("Launch Year is :"+m3.year);
    }
}

