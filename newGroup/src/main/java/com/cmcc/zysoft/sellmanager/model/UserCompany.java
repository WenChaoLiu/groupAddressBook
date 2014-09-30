package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-5-20 14:52:23 by Hibernate Tools 3.2.2.GA


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
 * UserCompany generated by hbm2java
 */
@Entity
@Table(name="tb_c_user_company")
public class UserCompany  implements java.io.Serializable {


     /**
	 * 属性名称：serialVersionUID <br/>
	 * 类型：long
	 */
	 private static final long serialVersionUID = -2071565313719708225L;
	 private String userCompanyId;
	 private String employeeName;
     private String employeeId;
     private String companyId;
     private String userCompany;
     private String departmentName;
     private String headshipName;
     private String mobile;
     private String telephone;
     private String weibo;
     private String weixin;
     private String school;
     private String userMajor;
     private String userGrade;
     private String userClass;
     private String studentId;
     private Date birthday;
     private String nativePlace;
     private String address;
     private String homeAddress;
     private String remark;
     private String manageFlag;
     private String mobileShort;
     private String telShort;
     private String telephone2;
     private String email;
     private String qq;
     private String picture;
     private String employeeFirstword;
     private String employeeFullword;
     private String mood;
     private String mark1;
     private String mark2;
     private String delFlag;
     private int displayOrder;
     private String forbiddenFlag;

    public UserCompany() {
    }

	
    public UserCompany(String userCompanyId, String employeeId, String companyId) {
        this.userCompanyId = userCompanyId;
        this.employeeId = employeeId;
        this.companyId = companyId;
    }
    public UserCompany(String userCompanyId,String employeeName, String employeeId, String companyId,
    		String userCompany, String departmentName, String headshipName,
    		String mobile, String telephone, String weibo, String weixin, 
    		String school, String userMajor, String userGrade, String userClass, 
    		String studentId, Date birthday, String nativePlace, String address, 
    		String homeAddress, String remark, String manageFlag, String mobileShort, 
    		String telShort, String telephone2, String email, String qq, 
    		String picture,String employeeFirstword, String employeeFullword,
    		String mood, String mark1, String mark2, String delFlag,int displayOrder,String forbiddenFlag) {
       this.userCompanyId = userCompanyId;
       this.employeeName = employeeName;
       this.employeeId = employeeId;
       this.companyId = companyId;
       this.userCompany = userCompany;
       this.departmentName = departmentName;
       this.headshipName = headshipName;
       this.mobile = mobile;
       this.telephone = telephone;
       this.weibo = weibo;
       this.weixin = weixin;
       this.school = school;
       this.userMajor = userMajor;
       this.userGrade = userGrade;
       this.userClass = userClass;
       this.studentId = studentId;
       this.birthday = birthday;
       this.nativePlace = nativePlace;
       this.address = address;
       this.homeAddress = homeAddress;
       this.remark = remark;
       this.manageFlag = manageFlag;
       this.mobileShort = mobileShort;
       this.telShort = telShort;
       this.telephone2 = telephone2;
       this.email = email;
       this.qq = qq;
       this.picture = picture;
       this.employeeFirstword = employeeFirstword;
       this.employeeFullword = employeeFullword;
       this.mood = mood;
       this.mark1 = mark1;
       this.mark2 = mark2;
       this.delFlag = delFlag;
       this.setDisplayOrder(displayOrder);
       this.forbiddenFlag = forbiddenFlag;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="user_company_id", unique=true, nullable=false, length=32)
    public String getUserCompanyId() {
        return this.userCompanyId;
    }
    
    public void setUserCompanyId(String userCompanyId) {
        this.userCompanyId = userCompanyId;
    }
    
    @Column(name="employee_name", length=40)
    public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	@Column(name="employee_id", nullable=false, length=32)
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    @Column(name="company_id", nullable=false, length=32)
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    @Column(name="user_company", length=200)
    public String getUserCompany() {
		return userCompany;
	}


	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	@Column(name="department_name", length=80)
	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Column(name="headship_name", length=80)
	public String getHeadshipName() {
		return headshipName;
	}


	public void setHeadshipName(String headshipName) {
		this.headshipName = headshipName;
	}


	@Column(name="mobile", length=20)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    @Column(name="telephone", length=20)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="weibo", length=80)
    public String getWeibo() {
        return this.weibo;
    }
    
    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }
    
    @Column(name="weixin", length=80)
    public String getWeixin() {
        return this.weixin;
    }
    
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }
    
    @Column(name="school", length=200)
    public String getSchool() {
        return this.school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }
    
    @Column(name="user_major", length=80)
    public String getUserMajor() {
        return this.userMajor;
    }
    
    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
    }
    
    @Column(name="user_grade", length=80)
    public String getUserGrade() {
        return this.userGrade;
    }
    
    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }
    
    @Column(name="user_class", length=80)
    public String getUserClass() {
        return this.userClass;
    }
    
    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }
    
    @Column(name="student_id", length=80)
    public String getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="birthday", length=19)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    @Column(name="native_place", length=64)
    public String getNativePlace() {
        return this.nativePlace;
    }
    
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    
    @Column(name="address", length=400)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="home_address", length=80)
    public String getHomeAddress() {
        return this.homeAddress;
    }
    
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    @Column(name="remark", length=400)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="manage_flag", length=2)
    public String getManageFlag() {
        return this.manageFlag;
    }
    
    public void setManageFlag(String manageFlag) {
        this.manageFlag = manageFlag;
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
    
    @Column(name="telephone2", length=20)
    public String getTelephone2() {
        return this.telephone2;
    }
    
    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }
    
    @Column(name="email", length=32)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="qq", length=18)
    public String getQq() {
        return this.qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }
    
    @Column(name="picture", length=80)
    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    @Column(name="employee_firstword", length=20)
    public String getEmployeeFirstword() {
		return employeeFirstword;
	}


	public void setEmployeeFirstword(String employeeFirstword) {
		this.employeeFirstword = employeeFirstword;
	}

	@Column(name="employee_fullword", length=80)
	public String getEmployeeFullword() {
		return employeeFullword;
	}


	public void setEmployeeFullword(String employeeFullword) {
		this.employeeFullword = employeeFullword;
	}
    
    @Column(name="mood", length=800)
    public String getMood() {
        return this.mood;
    }
    
    public void setMood(String mood) {
        this.mood = mood;
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

    @Column(name="del_flag", length=2)
    public String getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Column(name="display_order")
	public int getDisplayOrder() {
		return displayOrder;
	}


	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	
	@Column(name="forbidden_flag", length=1)
    public String getForbiddenFlag() {
        return this.forbiddenFlag;
    }
    
    public void setForbiddenFlag(String forbiddenFlag) {
        this.forbiddenFlag = forbiddenFlag;
    }


}


