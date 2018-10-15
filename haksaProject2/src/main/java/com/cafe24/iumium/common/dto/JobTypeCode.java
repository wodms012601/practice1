package com.cafe24.iumium.common.dto;

public class JobTypeCode {
	private String jobTypeCode;
	private String recordId;
	private String jobGroupCode;
	
	// job_group 테이블과 조인 후 가져옴
	private String jobGroupName;
	
	private String jobTypeName;
	private String jobTypeIsUsed;
	private String jobTypeIsChanged;
	private String jobTypeReasonForChange;
	private String jobTypeChangedDate;
	private String jobTypeRegisteredDate;
	
	public String getJobTypeCode() {
		return jobTypeCode;
	}
	public void setJobTypeCode(String jobTypeCode) {
		this.jobTypeCode = jobTypeCode;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getJobGroupCode() {
		return jobGroupCode;
	}
	public void setJobGroupCode(String jobGroupCode) {
		this.jobGroupCode = jobGroupCode;
	}
	public String getJobGroupName() {
		return jobGroupName;
	}
	public void setJobGroupName(String jobGroupName) {
		this.jobGroupName = jobGroupName;
	}
	public String getJobTypeName() {
		return jobTypeName;
	}
	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
	}
	public String getJobTypeIsUsed() {
		return jobTypeIsUsed;
	}
	public void setJobTypeIsUsed(String jobTypeIsUsed) {
		this.jobTypeIsUsed = jobTypeIsUsed;
	}
	public String getJobTypeIsChanged() {
		return jobTypeIsChanged;
	}
	public void setJobTypeIsChanged(String jobTypeIsChanged) {
		this.jobTypeIsChanged = jobTypeIsChanged;
	}
	public String getJobTypeReasonForChange() {
		return jobTypeReasonForChange;
	}
	public void setJobTypeReasonForChange(String jobTypeReasonForChange) {
		this.jobTypeReasonForChange = jobTypeReasonForChange;
	}
	public String getJobTypeChangedDate() {
		return jobTypeChangedDate;
	}
	public void setJobTypeChangedDate(String jobTypeChangedDate) {
		this.jobTypeChangedDate = jobTypeChangedDate;
	}
	public String getJobTypeRegisteredDate() {
		return jobTypeRegisteredDate;
	}
	public void setJobTypeRegisteredDate(String jobTypeRegisteredDate) {
		this.jobTypeRegisteredDate = jobTypeRegisteredDate;
	}
}
