package com.web.sectionb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.web.sectionb.model.Student;
@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
