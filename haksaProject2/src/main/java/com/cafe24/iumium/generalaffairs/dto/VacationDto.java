// 2018.10.02 28기 전재현
package com.cafe24.iumium.generalaffairs.dto;

public class VacationDto {

	private int vacationNo;
	private String personnelNumber;
	private String vacationDivision;
	private String vacationType;
	private String vacationStartDate;
	private String vacationEndDate;
	private String vacationActualUse;
	private String vacationReason;
	private String vacationApprovalStatus;
	private String vacationRegistrationDay;
	private String humanName;
	private String deptNameKorean;
	private String jobRankNameKorean;
	
	public int getVacationNo() {
		return vacationNo;
	}
	public void setVacationNo(int vacationNo) {
		this.vacationNo = vacationNo;
	}
	public String getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(String personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public String getVacationDivision() {
		return vacationDivision;
	}
	public void setVacationDivision(String vacationDivision) {
		this.vacationDivision = vacationDivision;
	}
	public String getVacationType() {
		return vacationType;
	}
	public void setVacationType(String vacationType) {
		this.vacationType = vacationType;
	}
	public String getVacationStartDate() {
		return vacationStartDate;
	}
	public void setVacationStartDate(String vacationStartDate) {
		this.vacationStartDate = vacationStartDate;
	}
	public String getVacationEndDate() {
		return vacationEndDate;
	}
	public void setVacationEndDate(String vacationEndDate) {
		this.vacationEndDate = vacationEndDate;
	}
	public String getVacationActualUse() {
		return vacationActualUse;
	}
	public void setVacationActualUse(String vacationActualUse) {
		this.vacationActualUse = vacationActualUse;
	}
	public String getVacationReason() {
		return vacationReason;
	}
	public void setVacationReason(String vacationReason) {
		this.vacationReason = vacationReason;
	}
	public String getVacationApprovalStatus() {
		return vacationApprovalStatus;
	}
	public void setVacationApprovalStatus(String vacationApprovalStatus) {
		this.vacationApprovalStatus = vacationApprovalStatus;
	}
	public String getVacationRegistrationDay() {
		return vacationRegistrationDay;
	}
	public void setVacationRegistrationDay(String vacationRegistrationDay) {
		this.vacationRegistrationDay = vacationRegistrationDay;
	}
	public String getHumanName() {
		return humanName;
	}
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	public String getDeptNameKorean() {
		return deptNameKorean;
	}
	public void setDeptNameKorean(String deptNameKorean) {
		this.deptNameKorean = deptNameKorean;
	}
	public String getJobRankNameKorean() {
		return jobRankNameKorean;
	}
	public void setJobRankNameKorean(String jobRankNameKorean) {
		this.jobRankNameKorean = jobRankNameKorean;
	}
	
	@Override
	public String toString() {
		return "VacationDto [vacationNo=" + vacationNo + ", personnelNumber=" + personnelNumber + ", vacationDivision="
				+ vacationDivision + ", vacationType=" + vacationType + ", vacationStartDate=" + vacationStartDate
				+ ", vacationEndDate=" + vacationEndDate + ", vacationActualUse=" + vacationActualUse
				+ ", vacationReason=" + vacationReason + ", vacationApprovalStatus=" + vacationApprovalStatus
				+ ", vacationRegistrationDay=" + vacationRegistrationDay + ", humanName=" + humanName
				+ ", deptNameKorean=" + deptNameKorean + ", jobRankNameKorean=" + jobRankNameKorean + "]";
	}
	
}
