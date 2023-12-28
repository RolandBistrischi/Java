package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studNap = new HashMap<>();
        studNap.put("TS", 6);
        studNap.put("ISP", 69);
        studNap.put("SM", 5);
        Student student = new Student("Papiu", "Roland", "1234", studNap);

        List<Student> studs = new ArrayList<>();
        //studs.add(student);
        studentAdd(studs, student);
        studs.add(new Student("Bistrischi", "Claudiu", "123456", studNap));

        System.out.println();
        //studs.remove(student);
        studentRemove(studs, student);
        System.out.println();

        for (Student s : studs) {
            System.out.println(s.toString());
        }
    }

    public static void studentAdd(List<Student> students, Student student) {
        students.add(student);
    }

    public static void studentRemove(List<Student> students, Student student) {
        students.remove(student);
    }

    public static void studentUpdate(List<Student> students, Student student1, Student student2) {
        students.remove(student1);
        students.add(student2);
    }

    public static float studentAverageGrades(Student student) {
        float sum = 0;
        float count = 0;
        Collection<Integer> grades = student.getStudMap().values();
        for (int grade : grades) {
            sum += grade;
            count++;
        }
        System.out.println("Average grades: " + sum / count);
        if (count > 0)
            return sum / count;
        else
            return 0;
    }
}
