package com.crud.demo.taskrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.taskentity.taskentity;

@Repository
public interface taskrepository extends JpaRepository<taskentity,Long>{

}
