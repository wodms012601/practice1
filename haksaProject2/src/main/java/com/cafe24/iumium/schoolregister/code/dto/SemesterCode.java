package com.cafe24.iumium.schoolregister.code.dto;

public class SemesterCode {
	private String semesterCode;
	private String recordId;
	private String semesterBeginDate;
	private String semesterEndDate;
	private String semesterIsUsed;
	private String semesterIsChanged;
	private String semesterReasonForChange;
	private String semesterChangedDate;
	private String semesterRegisteredDate;
	
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getSemesterBeginDate() {
		return semesterBeginDate;
	}
	public void setSemesterBeginDate(String semesterBeginDate) {
		this.semesterBeginDate = semesterBeginDate;
	}
	public String getSemesterIsUsed() {
		return semesterIsUsed;
	}
	public void setSemesterIsUsed(String semesterIsUsed) {
		this.semesterIsUsed = semesterIsUsed;
	}
	public String getSemesterEndDate() {
		return semesterEndDate;
	}
	public void setSemesterEndDate(String semesterEndDate) {
		this.semesterEndDate = semesterEndDate;
	}
	public String getSemesterIsChanged() {
		return semesterIsChanged;
	}
	public void setSemesterIsChanged(String semesterIsChanged) {
		this.semesterIsChanged = semesterIsChanged;
	}
	public String getSemesterReasonForChange() {
		return semesterReasonForChange;
	}
	public void setSemesterReasonForChange(String semesterReasonForChange) {
		this.semesterReasonForChange = semesterReasonForChange;
	}
	public String getSemesterChangedDate() {
		return semesterChangedDate;
	}
	public void setSemesterChangedDate(String semesterChangedDate) {
		this.semesterChangedDate = semesterChangedDate;
	}
	public String getSemesterRegisteredDate() {
		return semesterRegisteredDate;
	}
	public void setSemesterRegisteredDate(String semesterRegisteredDate) {
		this.semesterRegisteredDate = semesterRegisteredDate;
	}
}
