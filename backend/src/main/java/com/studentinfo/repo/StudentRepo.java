package com.studentinfo.repo;

import org.springframework.stereotype.Repository;
import com.studentinfo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
