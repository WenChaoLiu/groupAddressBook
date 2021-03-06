package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-5-29 10:12:13 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * AuditConfig generated by hbm2java
 */
@Entity
@Table(name="tb_c_audit_config")
public class AuditConfig  implements java.io.Serializable {


     /**
	 * 属性名称：serialVersionUID <br/>
	 * 类型：long
	 */
	 private static final long serialVersionUID = -5615723245499941143L;
	 private String auditConfigCode;
     private String auditFlag;
     private String modifyFlag;
     private String mark1;
     private String mark2;

    public AuditConfig() {
    }

	
    public AuditConfig(String auditConfigCode) {
        this.auditConfigCode = auditConfigCode;
    }
    public AuditConfig(String auditConfigCode, String auditFlag, String modifyFlag, String mark1, String mark2) {
       this.auditConfigCode = auditConfigCode;
       this.auditFlag = auditFlag;
       this.modifyFlag = modifyFlag;
       this.mark1 = mark1;
       this.mark2 = mark2;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="audit_config_code", unique=true, nullable=false, length=32)
    public String getAuditConfigCode() {
        return this.auditConfigCode;
    }
    
    public void setAuditConfigCode(String auditConfigCode) {
        this.auditConfigCode = auditConfigCode;
    }
    
    @Column(name="audit_flag", length=1)
    public String getAuditFlag() {
        return this.auditFlag;
    }
    
    public void setAuditFlag(String auditFlag) {
        this.auditFlag = auditFlag;
    }
    
    @Column(name="modify_flag", length=1)
    public String getModifyFlag() {
        return this.modifyFlag;
    }
    
    public void setModifyFlag(String modifyFlag) {
        this.modifyFlag = modifyFlag;
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




}


