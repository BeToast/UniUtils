package uniutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;

class CourseTest {
    @Test void addStudent() {
        Course course = new Course("CS", new DateTime(2022, 9, 5, 0, 0), new DateTime(2023, 5, 4, 0, 0));
        try{
            course.addStudent(new Student());
        }catch(Exception e){
            fail();
        }
    }

    @Test void addModule() {
        Course course = new Course("CS", new DateTime(2022, 9, 5, 0, 0), new DateTime(2023, 5, 4, 0, 0));
        try{
            course.addModule(new Module("Programming", "CS101", new Lecturer()));
        }catch(Exception e){
            fail();
        }
    }
}
