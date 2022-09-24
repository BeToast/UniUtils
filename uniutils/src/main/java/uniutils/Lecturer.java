package uniutils;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
    A similar lecturer class should contain some attributes such as (Name, Age, DOB, ID,
    username, and modules teaching, etc.).
    A specific method (getUsername()) will generate the lecturer’s username by
    concatenating their name and age.
 */

public class Lecturer {
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String username;
    private ArrayList<String> modules;

    public Lecturer(String name, int age, DateTime dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = null; //instaciate as null
        this.modules = new ArrayList<String>();
    }

    public Lecturer(){
        this.name = "John Doe";
        this.age = 20;
        this.dob = new DateTime(1990, 1, 1, 0, 0);
        this.id = 0;
        this.username = null; //instaciate as null
        this.modules = new ArrayList<String>();
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
