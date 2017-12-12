/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mochan.kuis1046.entity;

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
 * @author Hendro Steven
 */
@Entity
@Table(name = "cv_1046")
public class cv_1046Entity implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_anggota;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_anggota;
    @Column(length = 255, nullable = true)
    private String umur_anggota;

    /**
     * @return the id_anggota
     */
    public Long getId_anggota() {
        return id_anggota;
    }

    /**
     * @param id_anggota the id_anggota to set
     */
    public void setId_anggota(Long id_anggota) {
        this.id_anggota = id_anggota;
    }
 @OneToMany
 @JoinColumn(name="id_anggota")
 private Set<nilai_1046Entity>nilai_1046Entity;
    /**
     * @return the nama_anggota
     */
    public String getNama_anggota() {
        return nama_anggota;
    }

    /**
     * @param nama_anggota the nama_anggota to set
     */
    public void setNama_anggota(String nama_anggota) {
        this.nama_anggota = nama_anggota;
    }

    /**
     * @return the umur_anggota
     */
    public String getUmur_anggota() {
        return umur_anggota;
    }

    /**
     * @param umur_anggota the umur_anggota to set
     */
    public void setUmur_anggota(String umur_anggota) {
        this.umur_anggota = umur_anggota;
    }

  
    /**
     * @return the name
     */
    
}
