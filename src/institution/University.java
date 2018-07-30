package institution;

import person.Student;

import java.util.ArrayList;

import java.util.List;

public class University implements UniversityImplementation {

    private String universityName;
    private Student student;
    double avgLevelUniversity;
    private List<Student> allUniversityStudents;

    /*in the constructor initialisation list students that  study at the university*/
    public University(String name) {
       this.universityName = name;
       this.allUniversityStudents = new ArrayList<>();
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void addStudent(Student student) {
        allUniversityStudents.add(student);
    }

    public List<Student> getAllUniversityStudents() {
        return allUniversityStudents;
    }

    public String getUniversityName() {
        return universityName;
    }

    /*find out average level of the students knowledge */
    @Override
    public double getAVGKnowledgeStudentsByUniversity(List<Student> students) {

        int numberOfRatings = 0;
        int sumOfRatings = 0;
        for (Student student: students) {
            sumOfRatings += student.getKnowledge().getLevel();
            numberOfRatings++;
        }
        return avgLevelUniversity =(double) sumOfRatings / numberOfRatings;
    }
}
