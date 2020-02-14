/**
 * 
 */
package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Publisher;

/**
 * @author manu
 *
 */
@Repository
public interface PublishRepository extends JpaRepository<Publisher, Integer>{

}
