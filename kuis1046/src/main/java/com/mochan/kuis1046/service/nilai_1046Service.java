/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mochan.kuis1046.service;

import com.mochan.kuis1046.entity.nilai_1046Entity;
import com.mochan.kuis1046.repo.nilai_1046Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("nilai_1046Service")
@Transactional
public class nilai_1046Service {
    @Autowired
    private nilai_1046Repo repo;

    public nilai_1046Entity insert(nilai_1046Entity category) {
        return repo.save(category);
    }
    
    public nilai_1046Entity update(nilai_1046Entity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public nilai_1046Entity getById(Long id){
        return repo.findOne(id);
    }
    
    public List<nilai_1046Entity> getAll(){
        return repo.findAllCategory();
    }
}
