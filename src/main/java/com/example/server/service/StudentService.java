package com.example.server.service;

import com.example.server.models.GroupModel;
import com.example.server.models.StudentModel;
import com.example.server.repos.GroupRepo;
import com.example.server.repos.StudentModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentModelRepository studentModelRepository;

    @Autowired
    GroupRepo groupRepo;

    public StudentModel createStudent(String name,
                                      String lastName, int number){
        StudentModel studentModel = new StudentModel();
        studentModel.setFirstName(name);
        studentModel.setLastName(lastName);
        GroupModel groupModel = groupRepo.findByNumber(number);
        groupModel.setStudents(groupModel.getStudents()+1);
        studentModel.setGroupModel(groupModel);

        studentModelRepository.save(studentModel);
        return studentModel;
    }

    public List<StudentModel> getAll(){
        return studentModelRepository.findAll();
    }

    public StudentModel getStudent(String name, String lastName){
        return  studentModelRepository.findByFirstNameAndLastName(name, lastName);
    }
}