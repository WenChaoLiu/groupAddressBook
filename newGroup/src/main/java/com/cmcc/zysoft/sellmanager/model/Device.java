package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-5-14 15:02:02 by Hibernate Tools 3.2.2.GA


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
 * Device generated by hbm2java
 */
@Entity
@Table(name="tb_c_device")
public class Device  implements java.io.Serializable {


     /**
	 * 属性名称：serialVersionUID <br/>
	 * 类型：long
	 */
	 private static final long serialVersionUID = 3879960490594825423L;
	 private String deviceId;
     private String employeeId;
     private String imei;
     private String imsi;
     private String registerCode;
     private String status;
     private Date addDate;
     private String mark1;
     private String mark2;

    public Device() {
    }

	
    public Device(String deviceId) {
        this.deviceId = deviceId;
    }
    public Device(String deviceId, String employeeId, String imei, String imsi, String registerCode, String status, Date addDate, String mark1, String mark2) {
       this.deviceId = deviceId;
       this.employeeId = employeeId;
       this.imei = imei;
       this.imsi = imsi;
       this.registerCode = registerCode;
       this.status = status;
       this.addDate = addDate;
       this.mark1 = mark1;
       this.mark2 = mark2;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="device_id", unique=true, nullable=false, length=32)
    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    
    @Column(name="employee_id", length=32)
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    @Column(name="imei", length=80)
    public String getImei() {
        return this.imei;
    }
    
    public void setImei(String imei) {
        this.imei = imei;
    }
    
    @Column(name="imsi", length=80)
    public String getImsi() {
        return this.imsi;
    }
    
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }
    
    @Column(name="register_code", length=200)
    public String getRegisterCode() {
        return this.registerCode;
    }
    
    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }
    
    @Column(name="status", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="add_date", length=19)
    public Date getAddDate() {
        return this.addDate;
    }
    
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
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

