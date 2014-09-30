package com.cmcc.zysoft.sellmanager.model;

// Generated 2013-8-2 10:23:54 by Hibernate Tools 3.2.2.GA

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
 * SmsConfig generated by hbm2java
 */
@Entity
@Table(name = "tb_c_sms_config")
public class SmsConfig implements java.io.Serializable {

	private static final long serialVersionUID = -4575146084454552068L;
	private String smsConfigId;
	private String companyId;
	private Date sendDate;
	private String mark1;
	private String mark2;

	public SmsConfig() {
	}

	public SmsConfig(String smsConfigId) {
		this.smsConfigId = smsConfigId;
	}

	public SmsConfig(String smsConfigId, String companyId, Date sendDate, String mark1, String mark2) {
		this.smsConfigId = smsConfigId;
		this.companyId = companyId;
		this.sendDate = sendDate;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "sms_config_id", unique = true, nullable = false, length = 32)
	public String getSmsConfigId() {
		return this.smsConfigId;
	}

	public void setSmsConfigId(String smsConfigId) {
		this.smsConfigId = smsConfigId;
	}

	@Column(name = "company_id", length = 32)
	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "send_date", length = 19)
	public Date getSendDate() {
		return this.sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	@Column(name = "mark1", length = 200)
	public String getMark1() {
		return this.mark1;
	}

	public void setMark1(String mark1) {
		this.mark1 = mark1;
	}

	@Column(name = "mark2", length = 200)
	public String getMark2() {
		return this.mark2;
	}

	public void setMark2(String mark2) {
		this.mark2 = mark2;
	}
}