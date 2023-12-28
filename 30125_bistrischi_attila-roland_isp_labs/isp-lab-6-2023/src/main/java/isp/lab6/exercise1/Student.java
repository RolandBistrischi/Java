package isp.lab6.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Student {
    private String nume;
    private String prenume;
    private String iD;
    private HashMap<String, Integer> studMap = new HashMap<>();

    public Student(String nume, String prenume, String iD, HashMap<String, Integer> studMap) {
        this.nume = nume;
        this.prenume = prenume;
        this.iD = iD;
        this.studMap = studMap;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public HashMap<String, Integer> getStudMap() {
        return studMap;
    }

    public void setStudMap(HashMap<String, Integer> studMap) {
        this.studMap = studMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return iD.equals(student.iD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", iD='" + iD + '\'' +
                ", studMap=" + studMap +
                '}';
    }
}
