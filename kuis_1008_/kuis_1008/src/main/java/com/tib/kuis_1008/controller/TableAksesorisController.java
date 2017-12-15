/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1008.controller;




import com.tib.kuis_1008.entity.TableAksesoris;
import com.tib.kuis_1008.service.TableAksesorisService;
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
@RequestMapping("/TableAksesoris")
public class TableAksesorisController {

    @Autowired
    private TableAksesorisService TableAksesorisService;

    @RequestMapping(method = RequestMethod.POST)
    public TableAksesoris insert(@RequestBody TableAksesoris tableaksesoris) {
        return TableAksesorisService.insert(tableaksesoris);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public TableAksesoris update(@RequestBody TableAksesoris tableaksesoris) {
        return TableAksesorisService.update(tableaksesoris);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return TableAksesorisService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public TableAksesoris getByid(@PathVariable("id") Long id){
        return TableAksesorisService.getByid(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<TableAksesoris> getAll(){
        return TableAksesorisService.getAll();
    }
}
