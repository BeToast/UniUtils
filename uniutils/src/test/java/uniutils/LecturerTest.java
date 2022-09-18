package uniutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
    @Test void testGetUsername() {
        Student student = new Student();
        assertNotNull(student.getUsername());
    }
}