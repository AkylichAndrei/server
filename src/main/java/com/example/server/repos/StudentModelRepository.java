package com.example.server.repos;
import com.example.server.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentModelRepository extends JpaRepository<StudentModel, Long> {

    StudentModel findByFirstNameAndLastName(String firstName, String lastName);
}