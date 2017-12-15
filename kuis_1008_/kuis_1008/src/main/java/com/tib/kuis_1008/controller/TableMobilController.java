/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1008.controller;


import com.tib.kuis_1008.entity.TableMobil;
import com.tib.kuis_1008.service.TableMobilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Azis
 */
@RestController
@RequestMapping("/TableIndetitas")
public class TableMobilController {

    @Autowired
    private TableMobilService TableMobilService;

    @RequestMapping(method = RequestMethod.POST)
    public TableMobil insert(@RequestBody TableMobil tablemobil) {
        return TableMobilService.insert(tablemobil);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public TableMobil update(@RequestBody TableMobil tablemobil) {
        return TableMobilService.update(tablemobil);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return TableMobilService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public TableMobil getBynim(@PathVariable("id") Long id){
        return TableMobilService.getBynim(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<TableMobil> getAll(){
        return TableMobilService.getAll();
    }
}