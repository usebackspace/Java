//1.We can access Instance variable and Static variable directly in instance method in same class.We don't need to create object.
//2.We cannot access instance variable inside static method because it belongs to the instance.


class Model {
    String model="Ford";      // Instance Variable
    static int year;         // Static Variable
    
    void carInfo() {
        System.out.println("Model of car is :" + model + ". Launch in year " + year);
    }

}

class StaticVariable {
    public static void main(String[] args) {
        Model m1 = new Model();
        Model m2 = new Model();
        Model m3 = new Model();

        m1.model = "Ferari";
        m2.model = "BMW";
        m3.model = "Volvo";
        
        m1.year = 1934;    // We can access using object, but we have to use className.variable
        m2.year = 1935;    
        Model.year = 1936;  // we have to have access static variable in this way.

        System.out.println("Model is :"+m1.model);
        System.out.println("Launch Year is :"+m1.year);
        System.out.println("Model is :"+m2.model);
        System.out.println("Launch Year is :"+m2.year);
        System.out.println("Model is :"+m3.model);
        System.out.println("Launch Year is :"+m3.year);
    }
}

