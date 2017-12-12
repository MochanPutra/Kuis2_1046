/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mochan.kuis1046.controller;

import com.mochan.kuis1046.entity.nilai_1046Entity;
import com.mochan.kuis1046.service.nilai_1046Service;
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
@RequestMapping("/nilai_1046")
public class nilai_1046Controller {

    @Autowired
    private nilai_1046Service cv_1046Service;

    @RequestMapping(method = RequestMethod.POST)
    public nilai_1046Entity insert(@RequestBody nilai_1046Entity category) {
        return cv_1046Service.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public nilai_1046Entity update(@RequestBody nilai_1046Entity category) {
        return cv_1046Service.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_buku}")
    public boolean delete(@PathVariable("id_buku") Long id) {
        return cv_1046Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_buku}")
    public nilai_1046Entity getById(@PathVariable("id_buku") Long id){
        return cv_1046Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<nilai_1046Entity> getAll(){
        return cv_1046Service.getAll();
    }
}
