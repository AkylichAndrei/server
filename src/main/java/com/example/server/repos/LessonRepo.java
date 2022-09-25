package com.example.server.repos;
import com.example.server.models.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LessonRepo extends JpaRepository<GroupModel,Long> {
}
