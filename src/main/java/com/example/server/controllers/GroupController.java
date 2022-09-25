package com.example.server.controllers;
import com.example.server.models.GroupModel;
import com.example.server.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    GroupService groupService;

    @GetMapping("/create/{number}")
    public GroupModel createNewGroup(@PathVariable int number){
        GroupModel groupModel = groupService.createGroup(number);
        return  groupModel;
    }
    @GetMapping("/get")
    public List<GroupModel> getAll(){
        return groupService.getAll();
    }
}
