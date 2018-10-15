package com.cafe24.iumium.common.dto;

public class JobRankCode {
	private String jobRankCode;
	private String jobTypeCode;
	
	// haksa_job_type 테이블과의 조인으로 데이터를 가져옴
	private String jobTypeName;
	
	// haksa_job_group 테이블과의 조인으로 데이터를 가져옴
	private String jobGroupCode;
	private String jobGroupName;
	
	private String recordId;
	private String jobRankNameKorean;
	private String jobRankNameEnglish;
	private int jobRankMinPromotionRequired;
	private String jobRankIsUsed;
	private String jobRankIsChanged;
	private String jobRankReasonForChange;
	private String jobRankChangedDate;
	private String jobRankRegisteredDate;
	
	public String getJobRankCode() {
		return jobRankCode;
	}
	public void setJobRankCode(String jobRankCode) {
		this.jobRankCode = jobRankCode;
	}
	public String getJobTypeCode() {
		return jobTypeCode;
	}
	public void setJobTypeCode(String jobTypeCode) {
		this.jobTypeCode = jobTypeCode;
	}
	public String getJobTypeName() {
		return jobTypeName;
	}
	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
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
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getJobRankNameKorean() {
		return jobRankNameKorean;
	}
	public void setJobRankNameKorean(String jobRankNameKorean) {
		this.jobRankNameKorean = jobRankNameKorean;
	}
	public String getJobRankNameEnglish() {
		return jobRankNameEnglish;
	}
	public void setJobRankNameEnglish(String jobRankNameEnglish) {
		this.jobRankNameEnglish = jobRankNameEnglish;
	}
	public int getJobRankMinPromotionRequired() {
		return jobRankMinPromotionRequired;
	}
	public void setJobRankMinPromotionRequired(int jobRankMinPromotionRequired) {
		this.jobRankMinPromotionRequired = jobRankMinPromotionRequired;
	}
	public String getJobRankIsUsed() {
		return jobRankIsUsed;
	}
	public void setJobRankIsUsed(String jobRankIsUsed) {
		this.jobRankIsUsed = jobRankIsUsed;
	}
	public String getJobRankIsChanged() {
		return jobRankIsChanged;
	}
	public void setJobRankIsChanged(String jobRankIsChanged) {
		this.jobRankIsChanged = jobRankIsChanged;
	}
	public String getJobRankReasonForChange() {
		return jobRankReasonForChange;
	}
	public void setJobRankReasonForChange(String jobRankReasonForChange) {
		this.jobRankReasonForChange = jobRankReasonForChange;
	}
	public String getJobRankChangedDate() {
		return jobRankChangedDate;
	}
	public void setJobRankChangedDate(String jobRankChangedDate) {
		this.jobRankChangedDate = jobRankChangedDate;
	}
	public String getJobRankRegisteredDate() {
		return jobRankRegisteredDate;
	}
	public void setJobRankRegisteredDate(String jobRankRegisteredDate) {
		this.jobRankRegisteredDate = jobRankRegisteredDate;
	}
}
