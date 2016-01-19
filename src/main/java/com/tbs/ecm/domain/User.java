package com.tbs.ecm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6135406757646165050L;
	@Id
	@Column(name = "LOGIN_ID", unique = true, columnDefinition = "VARCHAR(30)")
	private String loginId;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "ANNUAL_INCOME")
	private Integer annualIncome;

	@Column(name = "EDUCATION")
	private Integer education;

	@Column(name = "OCCUPATION")
	private Integer occupation;

	@Column(name = "RELIGION")
	private Integer religion;

	@Column(name = "MOTHER_TONGUE")
	private Integer motherTongue;

	@Column(name = "MARITAL_STATUS")
	private Integer maritalStatus;

	@Column(name = "NO_OF_CHILDREN")
	private Integer noOfChildren;

	@Column(name = "SITE_INBOX")
	private String siteInbox;

	@Column(name = "EMAIL2")
	private String email2;

	@Column(name = "EMAIL3")
	private String email3;

	@Column(name = "SMS")
	private String sms;

	@Column(name = "ADDRESS1")
	private String address1;

	@Column(name = "ADDRESS2")
	private String address2;

	@Column(name = "CITY")
	private Integer city;

	@Column(name = "PIN")
	private Integer pin;

	@Column(name = "STATE")
	private Integer state;

	@Column(name = "COUNTRY")
	private Integer country;

	@Column(name = "TEL_OFF")
	private String telOff;

	@Column(name = "TEL_OTHER")
	private String telOther;

	@Column(name = "AGENT")
	private String agent;

	@Column(name = "LAST_LOGIN_DATE")
	private Date lastLoginDate;

	@Column(name = "PROMOTIONAL_MAILS")
	private String promotionalMails;

	@Column(name = "NET_STATUS")
	private Integer netStatus;

	@Column(name = "MSG_STATUS")
	private String msgStatus;

	@Column(name = "CURRENCY")
	private Integer currency;

	@Column(name = "DISCOUNT_FLAG")
	private String discountFlag;

	@Column(name = "EMPLOYEENO")
	private Integer employeeno;

	@Column(name = "LOGIN_CREATE_DATE")
	private Date loginCreateDate;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "email1")
	private String email1;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "REGISTRATION_SOURCE")
	private String registrationSource;

	@Column(name = "COMP_LOGO")
	private String compLogo;

	@Column(name = "EMP_CITY")
	private String empCity;

	@Column(name = "EMP_CITY_OTHER")
	private String empCityOther;

	@Column(name = "COMPANY_CONSULTANT")
	private String companyConsultant;

	@Column(name = "LOGIN_SRL_NO")
	private Long loginSrlNo;

	@Column(name = "MAIL_FORMAT")
	private String mailFormat;

	@Column(name = "LAST_MODIFIED_TIME")
	private Date lastModifiedTime;

	@Column(name = "PS_EXPIRY_DATE")
	private Date psExpiryDate;

	@Column(name = "NATIONALITY")
	private Integer nationality;

	@Column(name = "SMS_OPTION")
	private Integer smsOption;

	@Column(name = "TRANSMIT_STATUS")
	private String transmitStatus;

	@Column(name = "PREV_MODIFIED_TIME")
	private Date prevModifiedTime;

	@Column(name = "HIBERNATE_EXPIRY_DATE")
	private Date hibernateExpiryDate;

	@Column(name = "IS_MOBILE_VERIFIED")
	private String isMobileVerified;

	//private String dobStr;
	//private String token;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Integer annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	public Integer getOccupation() {
		return occupation;
	}

	public void setOccupation(Integer occupation) {
		this.occupation = occupation;
	}

	public Integer getReligion() {
		return religion;
	}

	public void setReligion(Integer religion) {
		this.religion = religion;
	}

	public Integer getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(Integer motherTongue) {
		this.motherTongue = motherTongue;
	}

	public Integer getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Integer getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(Integer noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public String getSiteInbox() {
		return siteInbox;
	}

	public void setSiteInbox(String siteInbox) {
		this.siteInbox = siteInbox;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmail3() {
		return email3;
	}

	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getTelOff() {
		return telOff;
	}

	public void setTelOff(String telOff) {
		this.telOff = telOff;
	}

	public String getTelOther() {
		return telOther;
	}

	public void setTelOther(String telOther) {
		this.telOther = telOther;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getPromotionalMails() {
		return promotionalMails;
	}

	public void setPromotionalMails(String promotionalMails) {
		this.promotionalMails = promotionalMails;
	}

	public Integer getNetStatus() {
		return netStatus;
	}

	public void setNetStatus(Integer netStatus) {
		this.netStatus = netStatus;
	}

	public String getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(String msgStatus) {
		this.msgStatus = msgStatus;
	}

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public String getDiscountFlag() {
		return discountFlag;
	}

	public void setDiscountFlag(String discountFlag) {
		this.discountFlag = discountFlag;
	}

	public Integer getEmployeeno() {
		return employeeno;
	}

	public void setEmployeeno(Integer employeeno) {
		this.employeeno = employeeno;
	}

	public Date getLoginCreateDate() {
		return loginCreateDate;
	}

	public void setLoginCreateDate(Date loginCreateDate) {
		this.loginCreateDate = loginCreateDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getRegistrationSource() {
		return registrationSource;
	}

	public void setRegistrationSource(String registrationSource) {
		this.registrationSource = registrationSource;
	}

	public String getCompLogo() {
		return compLogo;
	}

	public void setCompLogo(String compLogo) {
		this.compLogo = compLogo;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpCityOther() {
		return empCityOther;
	}

	public void setEmpCityOther(String empCityOther) {
		this.empCityOther = empCityOther;
	}

	public String getCompanyConsultant() {
		return companyConsultant;
	}

	public void setCompanyConsultant(String companyConsultant) {
		this.companyConsultant = companyConsultant;
	}

	public Long getLoginSrlNo() {
		return loginSrlNo;
	}

	public void setLoginSrlNo(Long loginSrlNo) {
		this.loginSrlNo = loginSrlNo;
	}

	public String getMailFormat() {
		return mailFormat;
	}

	public void setMailFormat(String mailFormat) {
		this.mailFormat = mailFormat;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Date getPsExpiryDate() {
		return psExpiryDate;
	}

	public void setPsExpiryDate(Date psExpiryDate) {
		this.psExpiryDate = psExpiryDate;
	}

	public Integer getNationality() {
		return nationality;
	}

	public void setNationality(Integer nationality) {
		this.nationality = nationality;
	}

	public Integer getSmsOption() {
		return smsOption;
	}

	public void setSmsOption(Integer smsOption) {
		this.smsOption = smsOption;
	}

	public String getTransmitStatus() {
		return transmitStatus;
	}

	public void setTransmitStatus(String transmitStatus) {
		this.transmitStatus = transmitStatus;
	}

	public Date getPrevModifiedTime() {
		return prevModifiedTime;
	}

	public void setPrevModifiedTime(Date prevModifiedTime) {
		this.prevModifiedTime = prevModifiedTime;
	}

	public Date getHibernateExpiryDate() {
		return hibernateExpiryDate;
	}

	public void setHibernateExpiryDate(Date hibernateExpiryDate) {
		this.hibernateExpiryDate = hibernateExpiryDate;
	}

	public String getIsMobileVerified() {
		return isMobileVerified;
	}

	public void setIsMobileVerified(String isMobileVerified) {
		this.isMobileVerified = isMobileVerified;
	}

	/*public String getDobStr() {
		return dobStr;
	}

	public void setDobStr(String dobStr) {
		this.dobStr = dobStr;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
*/
}