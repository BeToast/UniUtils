package uniutils;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
    A student class should contain some attributes such as (Name, Age, DOB, ID,
    username, courses and modules registered for, etc.).
    A specific method (getUsername()) will generate the student’s username by
    concatenating their name and age
 */

public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String username;
    private Course course;
    private ArrayList<Module> modules; 
    
    public Student(String name, int age, DateTime dob, int id, Course course){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = null; //instaciate as null
        this.course = course;
        this.modules = new ArrayList<Module>();
    }

    public Student(){
        this.name = "John Doe";
        this.age = 20;
        this.dob = new DateTime(1990, 1, 1, 0, 0);
        this.id = 0;
        this.username = null; //instaciate as null
        this.course = null; //not defined with this constructor
        this.modules = new ArrayList<Module>();
    }

    public String getUsername() {
        this.username = this.name+this.age;
        return this.username;
    }

    public String toString(){
        if(this.username == null){getUsername();}
        return "Name: " + this.name + ", age: " + this.age + ", username: " +this.username+"id: " + this.id;
    }
}
