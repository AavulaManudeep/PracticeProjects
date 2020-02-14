package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Strudent;

@Repository
public interface StudentRepository extends JpaRepository<Strudent,Long>
{

}
