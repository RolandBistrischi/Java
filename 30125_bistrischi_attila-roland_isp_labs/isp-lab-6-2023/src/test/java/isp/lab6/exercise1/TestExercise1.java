package isp.lab6.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestExercise1 {
    @Test

    public void testAddStudent() {
        HashMap<String, Integer> studNap = new HashMap<>();
        studNap.put("TS", 6);
        studNap.put("ISP", 69);
        studNap.put("SM", 5);
        Student student = new Student("Papiu", "Roland", "1234", studNap);

        List<Student> studs = new ArrayList<>();
        Exercise1.studentAdd(studs, student);
        assertTrue(studs.contains(student));
    }

    @Test
    public void testRemoveStudent() {
        HashMap<String, Integer> studNap = new HashMap<>();
        studNap.put("TS", 6);
        studNap.put("ISP", 69);
        studNap.put("SM", 5);
        Student student = new Student("Papiu", "Roland", "1234", studNap);

        List<Student> students = new ArrayList<>();
        Exercise1.studentAdd(students, student);
        Exercise1.studentRemove(students, student);

        assertFalse(students.contains(student));
    }

    @Test
    public void testUpdateStudent() {
        HashMap<String, Integer> studNap1 = new HashMap<>();
        studNap1.put("TS", 6);
        studNap1.put("ISP", 69);
        studNap1.put("SM", 5);
        Student student1 = new Student("Papiu", "Roland", "1234", studNap1);

        List<Student> students = new ArrayList<>();
        Exercise1.studentAdd(students, student1);

        HashMap<String, Integer> studNap2 = new HashMap<>();
        studNap2.put("TS", 7);
        studNap2.put("ISP", 10);
        studNap2.put("SM", 6);
        Student student2 = new Student("Bistrischi", "Claudiu", "5678", studNap2);

        Exercise1.studentUpdate(students, student1, student2);

        assertFalse(students.contains(student1));
        assertTrue(students.contains(student2));
    }

    @Test
    public void testCalculateAverageGrade() {
        HashMap<String, Integer> studNap = new HashMap<>();
        studNap.put("TS", 6);
        studNap.put("ISP", 10);
        studNap.put("SM", 5);
        Student student = new Student("Papiu", "Roland", "1234", studNap);

        float averageGrade = Exercise1.studentAverageGrades(student);

        assertEquals(7, averageGrade,0.1);
    }
}
