/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mochan.kuis1046.service;

import com.mochan.kuis1046.entity.cv_1046Entity;
import com.mochan.kuis1046.repo.cv_1046Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("cv_1046Service")
@Transactional
public class cv_1046Service {

    @Autowired
    private cv_1046Repo repo;

    public cv_1046Entity insert(cv_1046Entity category) {
        return repo.save(category);
    }
    
    public cv_1046Entity update(cv_1046Entity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1046Entity getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1046Entity> getAll(){
        return repo.findAllCategory();
    }
}
