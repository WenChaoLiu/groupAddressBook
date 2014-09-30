package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TxluserModifyusers generated by hbm2java
 */
@Entity
@Table(name="tb_b_txluser_modifyusers")
public class TxluserModifyusers  implements java.io.Serializable {


	 private static final long serialVersionUID = 7862434215989866087L;
	 private TxluserModifyusersId id;
     private Employee employee;
     private TxluserVersion txluserVersion;
     private String updateType;

    public TxluserModifyusers() {
    }

	
    public TxluserModifyusers(TxluserModifyusersId id, Employee employee, TxluserVersion txluserVersion) {
        this.id = id;
        this.employee = employee;
        this.txluserVersion = txluserVersion;
    }
    public TxluserModifyusers(TxluserModifyusersId id, Employee employee, TxluserVersion txluserVersion, String updateType) {
       this.id = id;
       this.employee = employee;
       this.txluserVersion = txluserVersion;
       this.updateType = updateType;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="employeeId", column=@Column(name="employee_id", nullable=false, length=32) ), 
        @AttributeOverride(name="txluserVersionNum", column=@Column(name="txluser_version_num", nullable=false) ) } )
    public TxluserModifyusersId getId() {
        return this.id;
    }
    
    public void setId(TxluserModifyusersId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id", nullable=false, insertable=false, updatable=false)
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="txluser_version_num", nullable=false, insertable=false, updatable=false)
    public TxluserVersion getTxluserVersion() {
        return this.txluserVersion;
    }
    
    public void setTxluserVersion(TxluserVersion txluserVersion) {
        this.txluserVersion = txluserVersion;
    }
    
    @Column(name="update_type", length=1)
    public String getUpdateType() {
        return this.updateType;
    }
    
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }




}


