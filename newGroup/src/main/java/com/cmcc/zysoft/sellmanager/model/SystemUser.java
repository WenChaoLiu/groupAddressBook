package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * SystemUser generated by hbm2java
 */
@Entity
@Table(name="tb_c_system_user")
public class SystemUser  implements java.io.Serializable {


	 private static final long serialVersionUID = 6381443392042172315L;
	 private String userId;
     private Headship headship;
     private Company company;
     private String employeeId;
     private String userName;
     private String password;
     private String passSalt;
     private String mobile;
     private String mobileShort;
     private String telShort;
     private String telephone;
     private String email;
     private String realName;
     private String photo;
     private String sex;
     private String loginIp;
     private Date loginTime;
     private Long loginCount;
     private String createMan;
     private Date createTime;
     private String modifyMan;
     private Date modifyTime;
     private String status;
     private String delFlag;
     private Set<UserRole> userRoles = new HashSet<UserRole>(0);

    public SystemUser() {
    }

	
    public SystemUser(String userId) {
        this.userId = userId;
    }
    public SystemUser(String userId, Headship headship, Company company, String employeeId, String userName, String password, String passSalt, String mobile, String mobileShort, String telShort, String telephone, String email, String realName, String photo, String sex, String loginIp, Date loginTime, Long loginCount, String createMan, Date createTime, String modifyMan, Date modifyTime, String status, String delFlag, Set<UserRole> userRoles) {
       this.userId = userId;
       this.headship = headship;
       this.company = company;
       this.employeeId = employeeId;
       this.userName = userName;
       this.password = password;
       this.passSalt = passSalt;
       this.mobile = mobile;
       this.mobileShort = mobileShort;
       this.telShort = telShort;
       this.telephone = telephone;
       this.email = email;
       this.realName = realName;
       this.photo = photo;
       this.sex = sex;
       this.loginIp = loginIp;
       this.loginTime = loginTime;
       this.loginCount = loginCount;
       this.createMan = createMan;
       this.createTime = createTime;
       this.modifyMan = modifyMan;
       this.modifyTime = modifyTime;
       this.status = status;
       this.delFlag = delFlag;
       this.userRoles = userRoles;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="user_id", unique=true, nullable=false, length=32)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="headship_id")
    public Headship getHeadship() {
        return this.headship;
    }
    
    public void setHeadship(Headship headship) {
        this.headship = headship;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_id")
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
    @Column(name="employee_id", length=32)
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    @Column(name="user_name", length=32)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="password", length=64)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="pass_salt", length=64)
    public String getPassSalt() {
        return this.passSalt;
    }
    
    public void setPassSalt(String passSalt) {
        this.passSalt = passSalt;
    }
    
    @Column(name="mobile", length=12)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    @Column(name="mobile_short", length=20)
    public String getMobileShort() {
        return this.mobileShort;
    }
    
    public void setMobileShort(String mobileShort) {
        this.mobileShort = mobileShort;
    }
    
    @Column(name="tel_short", length=20)
    public String getTelShort() {
        return this.telShort;
    }
    
    public void setTelShort(String telShort) {
        this.telShort = telShort;
    }
    
    @Column(name="telephone", length=20)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="email", length=64)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="real_name", length=64)
    public String getRealName() {
        return this.realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }
    
    @Column(name="photo", length=256)
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    @Column(name="sex", length=1)
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Column(name="login_ip", length=64)
    public String getLoginIp() {
        return this.loginIp;
    }
    
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="login_time", length=19)
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    
    @Column(name="login_count")
    public Long getLoginCount() {
        return this.loginCount;
    }
    
    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }
    
    @Column(name="create_man", length=32)
    public String getCreateMan() {
        return this.createMan;
    }
    
    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time", length=19)
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="modify_man", length=32)
    public String getModifyMan() {
        return this.modifyMan;
    }
    
    public void setModifyMan(String modifyMan) {
        this.modifyMan = modifyMan;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modify_time", length=19)
    public Date getModifyTime() {
        return this.modifyTime;
    }
    
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    @Column(name="status", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="del_flag", length=1)
    public String getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public Set<UserRole> getUserRoles() {
        return this.userRoles;
    }
    
    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }




}


