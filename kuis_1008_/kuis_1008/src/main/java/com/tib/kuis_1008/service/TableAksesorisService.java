/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1008.service;


import com.tib.kuis_1008.entity.TableAksesoris;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tib.kuis_1008.repo.TableAksesorisRepo;

/**
 *
 * @author Azis
 */
@Service("TableAksesorisService")
@Transactional
public class TableAksesorisService{

    @Autowired
    private TableAksesorisRepo repo;

    public TableAksesoris insert(TableAksesoris tableaksesoris) {
        return repo.save(tableaksesoris);
    }
    
    public TableAksesoris update(TableAksesoris tableaksesoris) {
        return repo.save(tableaksesoris);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public TableAksesoris getByid(Long id){
        return repo.findOne(id);
    }
    
    public List<TableAksesoris> getAll(){
        return repo.findAlltableipk();
    }
}
