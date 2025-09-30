// Parent class or Base Class or Super Class
class Parent {
    void parentProperty() {
        System.out.println("parent's property");
    }
}

// Child class or Derived class or Sub Class
class Child extends Parent {
    void childProperty() {
        System.out.println("Child's property");
    }
}

// Main class to test the code
class SingleInheritance {
    public static void main(String[] args) {
        // Creating an instance of the Child class
        Child ch = new Child();
        ch.childProperty();
        ch.parentProperty();  // Inherited method from Parent class

        System.out.println();

        // Creating an instance of the Parent class
        Parent par = new Parent();
        par.parentProperty();

        // The following line would cause a compile-time error in Java:
        // par.childProperty(); // Not allowed – Parent can't access Child-specific methods
    }
}
