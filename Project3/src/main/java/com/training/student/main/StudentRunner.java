package com.training.student.main;

import com.training.student.entity.StudentEntity;
import com.training.student.repository.StudentRepo;
import com.training.student.repository.StudentRepoImpl;

import java.sql.SQLException;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) throws SQLException {
        StudentRepo repo = new StudentRepoImpl();
        StudentEntity ob = new StudentEntity(1,"Ramya","EEE","Belgaum");
        StudentEntity ob2 = new StudentEntity(2,"Sanjay","Mechanical","Baglakot");
        StudentEntity ob3 = new StudentEntity(3,"Prasad","ISE","Kalburagi");
        StudentEntity ob4 = new StudentEntity(4,"Hamsa","CSE","pune");
        StudentEntity ob5 = new StudentEntity(5,"Suchi","EEE","Yadagiri");
        StudentEntity ob6 = new StudentEntity(6,"Veena","ECE","Bidar");

//        repo.save(ob);
//        repo.save(ob2);
//        repo.save(ob3);
//        repo.save(ob4);
//        repo.save(ob5);
//        repo.save(ob6);

//        List<StudentEntity> list = repo.read();
//        for (StudentEntity se: list) {
//            System.out.println(se);
//
//        }
//        System.out.println(repo.findByname("Veena"));
//        System.out.println(repo.findBynameAndId("Suchi",5));

//        System.out.println(repo.updatePlaceByName("Mumbai","Hamsa"));

        repo.deleteByBranch("IPE");
    }
}