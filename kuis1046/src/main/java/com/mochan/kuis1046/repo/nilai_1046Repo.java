/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mochan.kuis1046.repo;

import com.mochan.kuis1046.entity.nilai_1046Entity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface nilai_1046Repo extends CrudRepository<nilai_1046Entity, Long> {

    @Query("select c from buku c")
    public List<nilai_1046Entity> findAllCategory();
}
