package university.hometution;

// Different Package, Not a Subclass

import university.school.Student;

public class HomeTutor {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.rollNo); // ✔ public
        // System.out.println(s.name);   // X protected
        // System.out.println(s.marks);  // X default
        // System.out.println(s.age);    // X private
    }
}
