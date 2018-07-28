package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    private String name;
    private List<Student> internshipStudents;

    public Internship(String name) {
       this.name = name;
       this.internshipStudents = new ArrayList<>();
    }

    public void setStudents(Student student) {
        internshipStudents.add(student);
    }

    public List<Student> getStudents() {

        if (!internshipStudents.isEmpty()){ {
               return internshipStudents;
             }
        }
        return null;
    }

}
