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

// GrandChild class (Inherits from Child, which inherits from Parent)
class GrandChild extends Child {
    void grandchildProperty() {
        System.out.println("GrandChild's property");
    }
}

// Main class to run the program
class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an instance of the GrandChild class
        GrandChild gc = new GrandChild();
        gc.grandchildProperty();
        gc.childProperty();
        gc.parentProperty();  // Inherited from Parent class

        System.out.println();

        // Creating an instance of the Child class
        Child c = new Child();
        c.parentProperty();
        c.childProperty();
        // c.grandchildProperty(); // Error: Cannot access grandchild method from Child instance

        System.out.println();

        // Creating an instance of the Parent class
        Parent parent = new Parent();
        parent.parentProperty();
        // parent.childProperty(); // Error: Parent cannot access Child's method
    }
}
