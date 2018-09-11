package com.br.lcts.repository;

import com.br.lcts.model.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {
    List<Teacher> findAll();
    Teacher findOneByUsername(String username);
}

