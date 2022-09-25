package com.example.server.repos;

import com.example.server.models.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepo extends JpaRepository<GroupModel,Long> {
    GroupModel findByNumber(int number);

}
