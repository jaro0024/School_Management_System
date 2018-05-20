package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniela Jaros on 05/18/18.
 */

public class Main {
    public static void main(String[] args) {

        Teacher sarah = new Teacher(1, "Sarah", 500);
        Teacher felicia = new Teacher(2, "Felicia", 700);
        Teacher john = new Teacher(3, "John", 600);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(sarah);
        teacherList.add(felicia);
        teacherList.add(john);

        Student gabriela = new Student(1, "Gabriela", 2);
        Student alexander = new Student(2, "Alexander", 1);
        Student kai = new Student(3, "Kai", 5);

        List<Student> studentList = new ArrayList<>();

        studentList.add(gabriela);
        studentList.add(alexander);
        studentList.add(kai);

        School ghs = new School(teacherList, studentList);

        Teacher gloria = new Teacher(4, "GLoria", 800);

        ghs.addTeacher(gloria);

        gabriela.payFees(5000);
        alexander.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY------");
        sarah.receiveSalary(sarah.getSalary());
        System.out.println("GHS has spent for salary to " + sarah.getName() + " and now has $" +
                ghs.getTotalMoneyEarned());

        john.receiveSalary(john.getSalary());
        System.out.println("GHS has spent for salary to " + john.getName() + " and now has $" +
                ghs.getTotalMoneyEarned());

        System.out.println(alexander);

        felicia.receiveSalary(felicia.getSalary());
        System.out.println(felicia);

    }
}

