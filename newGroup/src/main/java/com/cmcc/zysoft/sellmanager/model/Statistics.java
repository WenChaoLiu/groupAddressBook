package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * Statistics generated by hbm2java
 */
@Entity
@Table(name="tb_c_statistics")
public class Statistics  implements java.io.Serializable {


	 private static final long serialVersionUID = -7080012249162638486L;
	 private String id;
     private String companyId;
     private String menuId;
     private String menuName;
     private String path;
     private Date statisticalDate;
     private String moduleName;
     private Long hitCount;

    public Statistics() {
    }

	
    public Statistics(String id) {
        this.id = id;
    }
    public Statistics(String id, String companyId, String menuId, String menuName, String path, Date statisticalDate, String moduleName, Long hitCount) {
       this.id = id;
       this.companyId = companyId;
       this.menuId = menuId;
       this.menuName = menuName;
       this.path = path;
       this.statisticalDate = statisticalDate;
       this.moduleName = moduleName;
       this.hitCount = hitCount;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="id", unique=true, nullable=false, length=32)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="company_id", length=32)
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    @Column(name="menu_id", length=32)
    public String getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    
    @Column(name="menu_name", length=64)
    public String getMenuName() {
        return this.menuName;
    }
    
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    @Column(name="path", length=256)
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="statistical_date", length=10)
    public Date getStatisticalDate() {
        return this.statisticalDate;
    }
    
    public void setStatisticalDate(Date statisticalDate) {
        this.statisticalDate = statisticalDate;
    }
    
    @Column(name="module_name", length=64)
    public String getModuleName() {
        return this.moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    @Column(name="hit_count")
    public Long getHitCount() {
        return this.hitCount;
    }
    
    public void setHitCount(Long hitCount) {
        this.hitCount = hitCount;
    }




}


