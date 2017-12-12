/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mochan.kuis1046.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1046")
public class nilai_1046Entity implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_buku;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_buku;
    @Column(length = 255, nullable = true)
    private String kategori_buku;

    /**
     * @return the id_buku
     */
    public Long getId_buku() {
        return id_buku;
    }

    /**
     * @param id_buku the id_buku to set
     */
    public void setId_buku(Long id_buku) {
        this.id_buku = id_buku;
    }

    /**
     * @return the nama_buku
     */
    public String getNama_buku() {
        return nama_buku;
    }

    /**
     * @param nama_buku the nama_buku to set
     */
    public void setNama_buku(String nama_buku) {
        this.nama_buku = nama_buku;
    }

    /**
     * @return the kategori_buku
     */
    public String getKategori_buku() {
        return kategori_buku;
    }

    /**
     * @param kategori_buku the kategori_buku to set
     */
    public void setKategori_buku(String kategori_buku) {
        this.kategori_buku = kategori_buku;
    }

    /**
     * @return the id_anggota
     */
   
    
}
