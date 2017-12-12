/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mochan.kuis1046.controller;

import com.mochan.kuis1046.entity.cv_1046Entity;
import com.mochan.kuis1046.service.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv_1046")
public class cv_1046Controller {

    @Autowired
    private cv_1046Service cv_1046Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1046Entity insert(@RequestBody cv_1046Entity category) {
        return cv_1046Service.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1046Entity update(@RequestBody cv_1046Entity category) {
        return cv_1046Service.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_anggota}")
    public boolean delete(@PathVariable("id_anggota") Long id) {
        return cv_1046Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_anggota}")
    public cv_1046Entity getById(@PathVariable("id_anggota") Long id){
        return cv_1046Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1046Entity> getAll(){
        return cv_1046Service.getAll();
    }
}
