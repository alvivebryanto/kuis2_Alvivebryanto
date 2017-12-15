/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1008.service;



import com.tib.kuis_1008.entity.TableMobil;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tib.kuis_1008.repo.TableMobilRepo;

/**
 *
 * @author Azis
 */
@Service("TableMobilService")
@Transactional
public class TableMobilService{

    @Autowired
    private TableMobilRepo repo;

    public TableMobil insert(TableMobil tablemobil) {
        return repo.save(tablemobil);
    }
    
    public TableMobil update(TableMobil tablemobil) {
        return repo.save(tablemobil);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public TableMobil getBynim(Long id){
        return repo.findOne(id);
    }
    
    public List<TableMobil> getAll(){
        return repo.findAlltableinde();
    }
}