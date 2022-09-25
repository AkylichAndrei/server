package com.example.server.service;
import com.example.server.models.GroupModel;
import com.example.server.repos.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GroupService {
    @Autowired
    GroupRepo groupRepo;
    public GroupModel createGroup(int number){
        GroupModel groupModel = new GroupModel();
        groupModel.setNumber(number);
        groupModel.setStudents(0);
        groupRepo.save(groupModel);
        return groupModel;
    }
    public List<GroupModel> getAll(){

        return groupRepo.findAll();
    }
}
