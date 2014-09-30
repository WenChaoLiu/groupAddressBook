package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-5-22 21:25:25 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Master generated by hbm2java
 */
@Entity
@Table(name="tb_b_master")
public class Master  implements java.io.Serializable {


     /**
	 * 属性名称：serialVersionUID <br/>
	 * 类型：long
	 */
	 private static final long serialVersionUID = -8393849765949645835L;
	 private String masterId;
     private String companyId;
     private String masterName;
     private String masterType;
     private Integer taxis;
     private String mark1;
     private String mark2;
     private Set<MasterRules> masterRuleses = new HashSet<MasterRules>(0);
     private Set<UserMaster> userMasters = new HashSet<UserMaster>(0);

    public Master() {
    }

	
    public Master(String masterId) {
        this.masterId = masterId;
    }
    public Master(String masterId, String companyId, String masterName, String masterType, Integer taxis, String mark1, String mark2, Set<MasterRules> masterRuleses, Set<UserMaster> userMasters) {
       this.masterId = masterId;
       this.companyId = companyId;
       this.masterName = masterName;
       this.masterType = masterType;
       this.taxis = taxis;
       this.mark1 = mark1;
       this.mark2 = mark2;
       this.masterRuleses = masterRuleses;
       this.userMasters = userMasters;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="master_id", unique=true, nullable=false, length=32)
    public String getMasterId() {
        return this.masterId;
    }
    
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }
    
    @Column(name="company_id", length=32)
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    @Column(name="master_name", length=200)
    public String getMasterName() {
        return this.masterName;
    }
    
    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }
    
    @Column(name="master_type", length=2)
    public String getMasterType() {
        return this.masterType;
    }
    
    public void setMasterType(String masterType) {
        this.masterType = masterType;
    }
    
    @Column(name="taxis")
    public Integer getTaxis() {
        return this.taxis;
    }
    
    public void setTaxis(Integer taxis) {
        this.taxis = taxis;
    }
    
    @Column(name="mark1", length=200)
    public String getMark1() {
        return this.mark1;
    }
    
    public void setMark1(String mark1) {
        this.mark1 = mark1;
    }
    
    @Column(name="mark2", length=200)
    public String getMark2() {
        return this.mark2;
    }
    
    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="master")
    public Set<MasterRules> getMasterRuleses() {
        return this.masterRuleses;
    }
    
    public void setMasterRuleses(Set<MasterRules> masterRuleses) {
        this.masterRuleses = masterRuleses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="master")
    public Set<UserMaster> getUserMasters() {
        return this.userMasters;
    }
    
    public void setUserMasters(Set<UserMaster> userMasters) {
        this.userMasters = userMasters;
    }




}


