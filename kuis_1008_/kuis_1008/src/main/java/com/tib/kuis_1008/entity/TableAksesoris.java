/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1008.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Azis
 */
@Entity
@Table(name = "tableaksesoris_1008")
public class TableAksesoris implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private int jumlah;
    @Column(length = 255, nullable = true)
    private int harga;
    
    


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
     * @return the ipk
     */
    public int getjumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the Username to set
     */
    public void setipk(int jumlah) {
        this.jumlah = jumlah;
    }

     /**
     * @return the name
     */
    public int getharga() {
        return harga;
    }

    /**
     * @param harga the Password to set
     */
    public void setharga(int harga) {
        this.harga = harga;
    }
    
}
