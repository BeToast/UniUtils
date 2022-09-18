package uniutils;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ModuleTest {
    @Test void addStudent() {
        Module module = new Module("Programming", "CS101", new Lecturer());
        try{
            module.addStudent(new Student());
        }catch(Exception e){
            fail();
        }
    }

    @Test void addCourseName() {
        Module module = new Module("Programming", "CS101", new Lecturer());
        try{
            module.addCourseName("CS");
        }catch(Exception e){
            fail();
        }
    }
}
