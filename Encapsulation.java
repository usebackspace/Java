public class Encapsulation {
    
    public static void main(String[] args) {
        Student s = new Student();
        s.age = -10;   // Direct access
        System.out.println(s.age);

        Student_Enc s1 = new Student_Enc();
        s1.setAge(-10);   // Cannot set invalid value
        s1.setName("Steve Roger");
        System.out.println(s1.getName());
    }
}

class Student {
    public int age;
}



class Student_Enc {
     // Private variables (data hiding)
     private int age;
     private String name;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    // Public getter method
    public String getName() {
        return name;
    }

    // Public setter method
    public void setName(String name) {
        this.name = name;
    }
}

