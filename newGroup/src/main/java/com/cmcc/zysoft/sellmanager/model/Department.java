package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
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
 * Department generated by hbm2java
 */
@Entity
@Table(name="tb_c_department")
public class Department  implements java.io.Serializable {


	 private static final long serialVersionUID = 5760625193810142814L;
	 private String departmentId;
     private Company company;
     private String parentDepartmentId;
     private Integer departmentLevel;
     private String departmentName;
     private String departmentFirstword;
     private String departmentImage;
     private String departmentLogo;
     private String departmentMaster;
     private String telephone;
     private String fax;
     private String departmentAddress;
     private String departmentType;
     private String departmentArea;
     private Date createTime;
     private String createMan;
     private Date modifyTime;
     private String modifyMan;
     private BigDecimal saleTask;
     private String delFlag;
     private String haveChildDeparment;
     private Integer displayOrder;
     private Set<Employee> employees = new HashSet<Employee>(0);
     private Set<DepartmentChanged> departmentChangeds = new HashSet<DepartmentChanged>(0);

    public Department() {
    }

	
    public Department(String departmentId) {
        this.departmentId = departmentId;
    }
    public Department(String departmentId, Company company, String parentDepartmentId, Integer departmentLevel, String departmentName, String departmentFirstword, String departmentImage, String departmentLogo, String departmentMaster, String telephone, String fax, String departmentAddress, String departmentType, String departmentArea, Date createTime, String createMan, Date modifyTime, String modifyMan, BigDecimal saleTask, String delFlag, String haveChildDeparment, Integer displayOrder, Set<Employee> employees, Set<DepartmentChanged> departmentChangeds) {
       this.departmentId = departmentId;
       this.company = company;
       this.parentDepartmentId = parentDepartmentId;
       this.departmentLevel = departmentLevel;
       this.departmentName = departmentName;
       this.setDepartmentFirstword(departmentFirstword);
       this.departmentImage = departmentImage;
       this.departmentLogo= departmentLogo ;
       this.departmentMaster = departmentMaster;
       this.telephone = telephone;
       this.fax = fax;
       this.departmentAddress = departmentAddress;
       this.departmentType = departmentType;
       this.departmentArea = departmentArea;
       this.createTime = createTime;
       this.createMan = createMan;
       this.modifyTime = modifyTime;
       this.modifyMan = modifyMan;
       this.saleTask = saleTask;
       this.delFlag = delFlag;
       this.haveChildDeparment = haveChildDeparment;
       this.displayOrder = displayOrder;
       this.employees = employees;
       this.departmentChangeds = departmentChangeds;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="department_id", unique=true, nullable=false, length=32)
    public String getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_id")
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
    @Column(name="parent_department_id", length=32)
    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }
    
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }
    
    @Column(name="department_level")
    public Integer getDepartmentLevel() {
        return this.departmentLevel;
    }
    
    public void setDepartmentLevel(Integer departmentLevel) {
        this.departmentLevel = departmentLevel;
    }
    
    @Column(name="department_name", length=64)
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    @Column(name="department_firstword", length=10)
    public String getDepartmentFirstword() {
		return departmentFirstword;
	}


	public void setDepartmentFirstword(String departmentFirstword) {
		this.departmentFirstword = departmentFirstword;
	}


	@Column(name="department_image", length=256)
    public String getDepartmentImage() {
		return departmentImage;
	}


	public void setDepartmentImage(String departmentImage) {
		this.departmentImage = departmentImage;
	}

	@Column(name="department_logo", length=256)
	public String getDepartmentLogo() {
		return departmentLogo;
	}


	public void setDepartmentLogo(String departmentLogo) {
		this.departmentLogo = departmentLogo;
	}


	@Column(name="department_master", length=32)
    public String getDepartmentMaster() {
        return this.departmentMaster;
    }
    
    public void setDepartmentMaster(String departmentMaster) {
        this.departmentMaster = departmentMaster;
    }
    
    @Column(name="telephone", length=15)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="fax", length=18)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    @Column(name="department_address", length=512)
    public String getDepartmentAddress() {
        return this.departmentAddress;
    }
    
    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }
    
    @Column(name="department_type", length=2)
    public String getDepartmentType() {
        return this.departmentType;
    }
    
    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }
    
    @Column(name="department_area", length=2)
    public String getDepartmentArea() {
        return this.departmentArea;
    }
    
    public void setDepartmentArea(String departmentArea) {
        this.departmentArea = departmentArea;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time", length=19)
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="create_man", length=32)
    public String getCreateMan() {
        return this.createMan;
    }
    
    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modify_time", length=19)
    public Date getModifyTime() {
        return this.modifyTime;
    }
    
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    @Column(name="modify_man", length=32)
    public String getModifyMan() {
        return this.modifyMan;
    }
    
    public void setModifyMan(String modifyMan) {
        this.modifyMan = modifyMan;
    }
    
    @Column(name="sale_task", precision=10)
    public BigDecimal getSaleTask() {
        return this.saleTask;
    }
    
    public void setSaleTask(BigDecimal saleTask) {
        this.saleTask = saleTask;
    }
    
    @Column(name="del_flag", length=1)
    public String getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
    
    @Column(name="have_child_deparment", length=2)
    public String getHaveChildDeparment() {
        return this.haveChildDeparment;
    }
    
    public void setHaveChildDeparment(String haveChildDeparment) {
        this.haveChildDeparment = haveChildDeparment;
    }
    
    @Column(name="display_order")
    public Integer getDisplayOrder() {
        return this.displayOrder;
    }
    
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public Set<DepartmentChanged> getDepartmentChangeds() {
        return this.departmentChangeds;
    }
    
    public void setDepartmentChangeds(Set<DepartmentChanged> departmentChangeds) {
        this.departmentChangeds = departmentChangeds;
    }




}

