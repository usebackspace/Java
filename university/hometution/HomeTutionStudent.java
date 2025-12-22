package university.hometution;

// Different Package + Subclass

import university.school.Student;

public class HomeTutionStudent extends Student {

    public static void main(String[] args) {

        HomeTutionStudent h = new HomeTutionStudent();

        System.out.println(h.rollNo); // ✔ public
        System.out.println(h.name);   // ✔ protected (inheritance)
        // System.out.println(h.marks); // X default
        // System.out.println(h.age);   // X private

    }
}