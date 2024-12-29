import modules.*;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        File sfile = new File("src/students.txt");
        File tfile = new File("src/teachers.txt");

        Scanner sc1 = new Scanner(sfile);
        School school = new School();

        List<Student> students = new ArrayList<>();

        while (sc1.hasNext()) {
            String[] parts  = sc1.nextLine().split(" ");
            ArrayList<Integer> grades = new ArrayList<>();
            for (int i = 4; i < parts.length; i++) {
                grades.add(Integer.parseInt(parts[i]));
            }
            Boolean gender = parts[3].equals("Male");
            Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), gender, grades);
            school.addMember(student);
        }
        sc1.close();

        sc1 = new Scanner(tfile);
        while (sc1.hasNext()) {
            String[] parts  = sc1.nextLine().split(" ");
            Boolean gender = parts[3].equals("Male");
            Teacher teacher = new Teacher(parts[0], parts[1], Integer.parseInt(parts[2]), gender, parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
            school.addMember(teacher);
        }

        sc1.close();
        school.getMembers().forEach(System.out::println);

        System.out.println("............................................................................");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(78);
        grades.add(89);
        grades.add(99);
        grades.add(51);
        Student student = new Student("Harry", "Potter", 21, true, grades);
        System.out.println("Harry Potter's GPA - " + student.calculateGPA());

        System.out.println("............................................................................");
        school.giveRaiseToExperiencedTeachers(10, 60);
        school.getMembers().forEach(System.out::println);
    }
}