package uniutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test void testGetUsername() {
        Student student = new Student();
        assertNotNull(student.getUsername());
    }
}
