
package business;

import java.time.LocalDate;


public class Student {
    private int id;
    private String studentName;
    private LocalDate birthday;

    public Student() {
    }

    public Student(int id, String studentName, LocalDate birthday) {
        this.id = id;
        this.studentName = studentName;
        this.birthday = birthday;
    }

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
