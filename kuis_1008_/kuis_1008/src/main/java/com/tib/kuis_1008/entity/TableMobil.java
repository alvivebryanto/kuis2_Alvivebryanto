/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1008.entity;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Azis
 */
@Entity
@Table(name = "tablemobil_1008")

public class TableMobil  implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String tahun;
    @Column(length = 255, nullable = true)
    private String jenis;
    
  @OneToMany
  @JoinColumn(name="id")
    private Set<TableAksesoris> TableAksesoris;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getnama() {
        return nama;
    }

    /**
     * @param nama the name to set
     */
    public void setnama(String nama) {
        this.nama = nama;
    }
    
     /**
     * @return the Username
     */
    public String gettahun() {
        return tahun;
    }

    /**
     * @param tahun the Username to set
     */
    public void settahun(String tahun) {
        this.tahun = tahun;
    }

     /**
     * @return the name
     */
    public String getjenis() {
        return jenis;
    }

    /**
     * @param jenis the Password to set
     */
    public void setkelas(String jenis) {
        this.jenis = jenis;
    }
    
}