package uniutils;

import java.util.ArrayList;

/**
    A module class, which should contain information such as module name, id (e.g.
    CT417), list of students, courses it is associated with, and lecturer responsible).
 */
public class Module {
    String name;
    String id; //CT417
    ArrayList<Student> students;
    ArrayList<String> courseNames;
    Lecturer lecturer;

    /**
     * Defulat Module constructor.
     * 
     * @param name
     * @param id
     * @param lecturer
     */
    public Module(String name, String id, Lecturer lecturer){
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
        this.students = new ArrayList<Student>();
        this.courseNames = new ArrayList<String>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addCourseName(String course) {
        this.courseNames.add(course);
    }

    public String toString(){
        return "Name: " + this.name + ", id: " + this.id + ", lecurer: " +this.lecturer.toString();
    }
}
