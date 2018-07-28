package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko",new Knowledge(5)));
        university.addStudent(new Student("Julia Veselkina",new Knowledge(4)));
        university.addStudent(new Student("Maria Perechrest",new Knowledge(1)));

        System.out.printf("%f\n",university.getAVGKnowledgeStudentsByUniversity(university.getAllUniversityStudents()));
        Internship internship = new Internship("Interlink");

        for (Student universityStudent : university.getAllUniversityStudents()) {
           if (universityStudent.getKnowledge().getLevel() >
                    university.getAVGKnowledgeStudentsByUniversity(university.getAllUniversityStudents())) {
               internship.setStudents(universityStudent);
           }
        }

        for (Student student : internship.getStudents()) {
            System.out.println(student.getName() + " range:" +
                    student.getKnowledge().getLevel());
        }

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}