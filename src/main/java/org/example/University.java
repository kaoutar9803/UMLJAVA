package org.example;
import java.util.ArrayList;
import java.util.List;
public class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayUniversityInfo() {
        System.out.println("University Name: " + name);
        System.out.println("Students enrolled:");
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}
