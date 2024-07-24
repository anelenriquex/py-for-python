package com.anel.darabeis.repositories;

//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.anel.darabeis.entities.student;

@Repository
public interface studentRepository extends JpaRepository<student, Integer>{


}
