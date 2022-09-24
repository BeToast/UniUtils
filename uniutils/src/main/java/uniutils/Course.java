package uniutils;

import java.util.ArrayList;

import org.joda.time.DateTime;

/**
    A course programme class containing course name (CS & IT or ECE, etc.), list of
    modules, list of students that are enrolled, academic start date and end date.
    Start and end dates should use Terasoluna Joda Time classes (i.e. DateTime), which
    must be added as a project dependency (see
    https://mvnrepository.com/artifact/org.terasoluna.gfw/terasoluna-gfw-jodatime).
 */

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startdate;
    private DateTime enddate;

    public Course(String name, DateTime startdate, DateTime enddate){
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public void addStudent(Student student){
        if (students == null) students = new ArrayList<Student>();
        students.add(student);
    }

    public void addModule(Module module){
        if (modules == null) modules = new ArrayList<Module>();
        modules.add(module);
    }

    public String toString(){
        return
            "Course: " + name + "\n" +
            "Start: " + startdate + "\n" +
            "End: " + enddate + "\n" +
            "Modules: " + modules.toString() + "\n" +
            "Students: " + students.toString()
        ;
    }
}
