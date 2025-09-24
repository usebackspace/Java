class LocalVariable {
    String instanceVariable = "I am an instance variable";
    

    // Instance method
    void myMethod() {
        // Local variable
        String localVariable = "I am a local variable";
        System.out.println(localVariable);

        // Accessing instance variable
        System.out.println(instanceVariable);
    }

    // Main method to run the code
    public static void main(String[] args) {
        // Create an instance of LocalVariable
        LocalVariable lv = new LocalVariable();
            
        lv.myMethod();

        // Access instance variable
        System.out.println(lv.instanceVariable); // This will work

        // System.out.println(lv.localVariable); // This will NOT work – causes compile error
    }

}
