package com.wasim.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wasim.rest.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
