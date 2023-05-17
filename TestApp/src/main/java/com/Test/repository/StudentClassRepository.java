package com.Test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Test.entity.StudentClass;

public interface StudentClassRepository extends JpaRepository<StudentClass, Integer>{

}
