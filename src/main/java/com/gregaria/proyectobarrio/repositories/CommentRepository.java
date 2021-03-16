/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gregaria.proyectobarrio.repositories;

import com.gregaria.proyectobarrio.entities.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nahue
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
  
  @Query("SELECT a FROM Comment a WHERE a.user = :id")
  public List<Comment> findByUser(@Param("id") String id);
}
