package com.cafe24.iumium.common.dto;

// 직군 코드
public class JobGroupCode {
	private String jobGroupCode;
	private String recordId;
	private String jobGroupName;
	private String jobGroupIsUsed;
	private String jobGroupIsChanged;
	private String jobGroupReasonForChange;
	private String jobGroupChangedDate;
	private String jobGroupRegisteredDate;
	
	public String getJobGroupCode() {
		return jobGroupCode;
	}
	public void setJobGroupCode(String jobGroupCode) {
		this.jobGroupCode = jobGroupCode;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getJobGroupName() {
		return jobGroupName;
	}
	public void setJobGroupName(String jobGroupName) {
		this.jobGroupName = jobGroupName;
	}
	public String getJobGroupIsUsed() {
		return jobGroupIsUsed;
	}
	public void setJobGroupIsUsed(String jobGroupIsUsed) {
		this.jobGroupIsUsed = jobGroupIsUsed;
	}
	public String getJobGroupIsChanged() {
		return jobGroupIsChanged;
	}
	public void setJobGroupIsChanged(String jobGroupIsChanged) {
		this.jobGroupIsChanged = jobGroupIsChanged;
	}
	public String getJobGroupReasonForChange() {
		return jobGroupReasonForChange;
	}
	public void setJobGroupReasonForChange(String jobGroupReasonForChange) {
		this.jobGroupReasonForChange = jobGroupReasonForChange;
	}
	public String getJobGroupChangedDate() {
		return jobGroupChangedDate;
	}
	public void setJobGroupChangedDate(String jobGroupChangedDate) {
		this.jobGroupChangedDate = jobGroupChangedDate;
	}
	public String getJobGroupRegisteredDate() {
		return jobGroupRegisteredDate;
	}
	public void setJobGroupRegisteredDate(String jobGroupRegisteredDate) {
		this.jobGroupRegisteredDate = jobGroupRegisteredDate;
	}
	
	// 
	public void showDtoProperty() {
		System.out.println("jobGroupCode : " + jobGroupCode);
	}
}
