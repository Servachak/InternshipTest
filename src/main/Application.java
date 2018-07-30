package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");

        university.addStudent(new Student("Andrew Kostenko",new Knowledge(5)));
        university.addStudent(new Student("Julia Veselkina",new Knowledge(4)));
        university.addStudent(new Student("Maria Perechrest",new Knowledge(1)));

        /*show average level*/
        System.out.printf("%f\n",university.getAVGKnowledgeStudentsByUniversity(university.getAllUniversityStudents()));

        Internship internship = new Internship("Interlink");

        /* check whether the level of student knowledge is higher then average level of the university*/
        for (Student universityStudent : university.getAllUniversityStudents()) {
           if (universityStudent.getKnowledge().getLevel() >
                    university.getAVGKnowledgeStudentsByUniversity(university.getAllUniversityStudents())) {
               internship.setStudents(universityStudent);
           }
        }
        System.out.println("List of internship's students:");

        /*show students that have knowledge level higher then average level of the university*/
        for (Student student : internship.getStudents()) {
            System.out.println(student.getName() + " has level:" +
                    student.getKnowledge().getLevel());
        }
        System.out.println(internship.getStudents());
    }
}
