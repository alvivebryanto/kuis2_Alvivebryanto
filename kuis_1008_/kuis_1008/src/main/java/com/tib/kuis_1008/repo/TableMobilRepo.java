/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1008.repo;


import com.tib.kuis_1008.entity.TableMobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Azis
 */
public interface TableMobilRepo extends CrudRepository<TableMobil, Long> {

    @Query("select mobi from TableMobil mobi")
    public List<TableMobil> findAlltableinde();
    
    
}
