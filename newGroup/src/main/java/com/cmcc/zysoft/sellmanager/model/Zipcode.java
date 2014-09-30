package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Zipcode generated by hbm2java
 */
@Entity
@Table(name="zipcode")
public class Zipcode  implements java.io.Serializable {


	 private static final long serialVersionUID = 354980843111979030L;
	 private int id;
     private String areaid;
     private String zip;
     private String code;

    public Zipcode() {
    }

    public Zipcode(int id, String areaid, String zip, String code) {
       this.id = id;
       this.areaid = areaid;
       this.zip = zip;
       this.code = code;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="areaid", nullable=false, length=20)
    public String getAreaid() {
        return this.areaid;
    }
    
    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }
    
    @Column(name="zip", nullable=false, length=20)
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    @Column(name="code", nullable=false, length=20)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }




}


