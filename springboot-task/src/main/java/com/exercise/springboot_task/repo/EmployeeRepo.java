package com.exercise.springboot_task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exercise.springboot_task.model.*;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
