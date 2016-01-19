package com.tbs.ecm.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserRestTJVO {
	private String loginId;
	private String gender;
	private String agent;
	// eamil3
	private String loginEmail;
	// email2
	private String communicationEmail;

	private String lastLoginDate;

	private String loginCreateDate;
	
	private String psExpiryDate;
	
	private String prevModifiedTime;

	private String lastName;
	private String firstName;

	private String registrationSource;

	// dob
	private String dateOfBirth;
	// telOther
	private String mobileNumber;
	private String mobileCountryCode;

	// netStatus
	private Integer usrNetStatus;

	private Integer usrAdNetStatus;

	private String usrAdLastModifiedTime;

	// address1
	private String address;

	private String lastModifiedTime;

	// loginSrlNo
	private Long loginSrNo;

	private String token;

	private String title;

	private String adId;

	private String skillSet;

	private Integer workExpInYear;

	private Integer workExpInMonth;

	private String presSalary;

	private String lacSalary;

	private String thousandSalary;

	// country
	private Integer lfCountry;

	private String curLocationId;

	private String prefLocationId;

	private String curLocationName;

	private String[] prefLocationName;
	private String[] functionalAreaId;
	private String[] functionalAreaName;
	private String[] funcAreaSpecId;
	private String[] funcAreaSpecName;

	private String functionalAreaOther;
	private String funcAreaSpecOther;
	private String savedResumePath;
	private boolean resumeUploaded;
	private String txtDescription;
	private String docModifiedTimeStr;
	private String[] currentIndustryId;
	private String[] currentIndustryName;
	private String currentRole;
	private String[] currentRoleMapId;

	// isMobileVerified
	private String mobileVerified;
	private String emailVerified;
	private String hibernateStatus;
	private String activeResumeId;
	private boolean validUser;
	private String isFirstLogin;
	
	private String errorMsg;
	
	private Integer errorCode;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getCommunicationEmail() {
		return communicationEmail;
	}

	public void setCommunicationEmail(String communicationEmail) {
		this.communicationEmail = communicationEmail;
	}

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLoginCreateDate() {
		return loginCreateDate;
	}

	public void setLoginCreateDate(String loginCreateDate) {
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

	public String getRegistrationSource() {
		return registrationSource;
	}

	public void setRegistrationSource(String registrationSource) {
		this.registrationSource = registrationSource;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileCountryCode() {
		return mobileCountryCode;
	}

	public void setMobileCountryCode(String mobileCountryCode) {
		this.mobileCountryCode = mobileCountryCode;
	}

	public Integer getUsrNetStatus() {
		return usrNetStatus;
	}

	public void setUsrNetStatus(Integer usrNetStatus) {
		this.usrNetStatus = usrNetStatus;
	}

	public Integer getUsrAdNetStatus() {
		return usrAdNetStatus;
	}

	public void setUsrAdNetStatus(Integer usrAdNetStatus) {
		this.usrAdNetStatus = usrAdNetStatus;
	}

	public String getUsrAdLastModifiedTime() {
		return usrAdLastModifiedTime;
	}

	public void setUsrAdLastModifiedTime(String usrAdLastModifiedTime) {
		this.usrAdLastModifiedTime = usrAdLastModifiedTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Long getLoginSrNo() {
		return loginSrNo;
	}

	public void setLoginSrNo(Long loginSrNo) {
		this.loginSrNo = loginSrNo;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public Integer getWorkExpInYear() {
		return workExpInYear;
	}

	public void setWorkExpInYear(Integer workExpInYear) {
		this.workExpInYear = workExpInYear;
	}

	public Integer getWorkExpInMonth() {
		return workExpInMonth;
	}

	public void setWorkExpInMonth(Integer workExpInMonth) {
		this.workExpInMonth = workExpInMonth;
	}

	public String getPresSalary() {
		return presSalary;
	}

	public void setPresSalary(String presSalary) {
		this.presSalary = presSalary;
	}

	public String getLacSalary() {
		return lacSalary;
	}

	public void setLacSalary(String lacSalary) {
		this.lacSalary = lacSalary;
	}

	public String getThousandSalary() {
		return thousandSalary;
	}

	public void setThousandSalary(String thousandSalary) {
		this.thousandSalary = thousandSalary;
	}

	public Integer getLfCountry() {
		return lfCountry;
	}

	public void setLfCountry(Integer lfCountry) {
		this.lfCountry = lfCountry;
	}

	public String getCurLocationId() {
		return curLocationId;
	}

	public void setCurLocationId(String curLocationId) {
		this.curLocationId = curLocationId;
	}

	public String getPrefLocationId() {
		return prefLocationId;
	}

	public void setPrefLocationId(String prefLocationId) {
		this.prefLocationId = prefLocationId;
	}

	public String getCurLocationName() {
		return curLocationName;
	}

	public void setCurLocationName(String curLocationName) {
		this.curLocationName = curLocationName;
	}

	public String[] getPrefLocationName() {
		return prefLocationName;
	}

	public void setPrefLocationName(String[] prefLocationName) {
		this.prefLocationName = prefLocationName;
	}

	public String[] getFunctionalAreaId() {
		return functionalAreaId;
	}

	public void setFunctionalAreaId(String[] functionalAreaId) {
		this.functionalAreaId = functionalAreaId;
	}

	public String[] getFunctionalAreaName() {
		return functionalAreaName;
	}

	public void setFunctionalAreaName(String[] functionalAreaName) {
		this.functionalAreaName = functionalAreaName;
	}

	public String[] getFuncAreaSpecId() {
		return funcAreaSpecId;
	}

	public void setFuncAreaSpecId(String[] funcAreaSpecId) {
		this.funcAreaSpecId = funcAreaSpecId;
	}

	public String[] getFuncAreaSpecName() {
		return funcAreaSpecName;
	}

	public void setFuncAreaSpecName(String[] funcAreaSpecName) {
		this.funcAreaSpecName = funcAreaSpecName;
	}

	public String getFunctionalAreaOther() {
		return functionalAreaOther;
	}

	public void setFunctionalAreaOther(String functionalAreaOther) {
		this.functionalAreaOther = functionalAreaOther;
	}

	public String getFuncAreaSpecOther() {
		return funcAreaSpecOther;
	}

	public void setFuncAreaSpecOther(String funcAreaSpecOther) {
		this.funcAreaSpecOther = funcAreaSpecOther;
	}

	public String getSavedResumePath() {
		return savedResumePath;
	}

	public void setSavedResumePath(String savedResumePath) {
		this.savedResumePath = savedResumePath;
	}

	public boolean isResumeUploaded() {
		return resumeUploaded;
	}

	public void setResumeUploaded(boolean resumeUploaded) {
		this.resumeUploaded = resumeUploaded;
	}

	public String getTxtDescription() {
		return txtDescription;
	}

	public void setTxtDescription(String txtDescription) {
		this.txtDescription = txtDescription;
	}

	public String getDocModifiedTimeStr() {
		return docModifiedTimeStr;
	}

	public void setDocModifiedTimeStr(String docModifiedTimeStr) {
		this.docModifiedTimeStr = docModifiedTimeStr;
	}

	public String[] getCurrentIndustryId() {
		return currentIndustryId;
	}

	public void setCurrentIndustryId(String[] currentIndustryId) {
		this.currentIndustryId = currentIndustryId;
	}

	public String[] getCurrentIndustryName() {
		return currentIndustryName;
	}

	public void setCurrentIndustryName(String[] currentIndustryName) {
		this.currentIndustryName = currentIndustryName;
	}

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	public String[] getCurrentRoleMapId() {
		return currentRoleMapId;
	}

	public void setCurrentRoleMapId(String[] currentRoleMapId) {
		this.currentRoleMapId = currentRoleMapId;
	}

	public String getMobileVerified() {
		return mobileVerified;
	}

	public void setMobileVerified(String mobileVerified) {
		this.mobileVerified = mobileVerified;
	}

	public String getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getHibernateStatus() {
		return hibernateStatus;
	}

	public void setHibernateStatus(String hibernateStatus) {
		this.hibernateStatus = hibernateStatus;
	}

	public String getActiveResumeId() {
		return activeResumeId;
	}

	public void setActiveResumeId(String activeResumeId) {
		this.activeResumeId = activeResumeId;
	}

	public boolean isValidUser() {
		return validUser;
	}

	public void setValidUser(boolean validUser) {
		this.validUser = validUser;
	}

	public String getIsFirstLogin() {
		return isFirstLogin;
	}

	public void setIsFirstLogin(String isFirstLogin) {
		this.isFirstLogin = isFirstLogin;
	}

	public String getPsExpiryDate() {
		return psExpiryDate;
	}

	public void setPsExpiryDate(String psExpiryDate) {
		this.psExpiryDate = psExpiryDate;
	}

	public String getPrevModifiedTime() {
		return prevModifiedTime;
	}

	public void setPrevModifiedTime(String prevModifiedTime) {
		this.prevModifiedTime = prevModifiedTime;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
}
