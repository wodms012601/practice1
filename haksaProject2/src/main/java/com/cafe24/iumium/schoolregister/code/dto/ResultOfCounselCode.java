package com.cafe24.iumium.schoolregister.code.dto;

public class ResultOfCounselCode {
	private String counselResultCode;
	private String recordId;
	private String counselTypeCode;
	
	// type_of_counsel 테이블과 조인 후 값을 가져옴
	private String counselTypeName;
	
	private String counselResultName;
	private String counselResultIsUsed;
	private String counselResultIsChanged;
	private String counselResultReasonForChange;
	private String counselResultChangedDate;
	private String counselResultRegisteredDate;
	
	public String getCounselResultCode() {
		return counselResultCode;
	}
	public void setCounselResultCode(String counselResultCode) {
		this.counselResultCode = counselResultCode;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getCounselTypeCode() {
		return counselTypeCode;
	}
	public void setCounselTypeCode(String counselTypeCode) {
		this.counselTypeCode = counselTypeCode;
	}
	public String getCounselTypeName() {
		return counselTypeName;
	}
	public void setCounselTypeName(String counselTypeName) {
		this.counselTypeName = counselTypeName;
	}
	public String getCounselResultName() {
		return counselResultName;
	}
	public void setCounselResultName(String counselResultName) {
		this.counselResultName = counselResultName;
	}
	public String getCounselResultIsUsed() {
		return counselResultIsUsed;
	}
	public void setCounselResultIsUsed(String counselResultIsUsed) {
		this.counselResultIsUsed = counselResultIsUsed;
	}
	public String getCounselResultIsChanged() {
		return counselResultIsChanged;
	}
	public void setCounselResultIsChanged(String counselResultIsChanged) {
		this.counselResultIsChanged = counselResultIsChanged;
	}
	public String getCounselResultReasonForChange() {
		return counselResultReasonForChange;
	}
	public void setCounselResultReasonForChange(String counselResultReasonForChange) {
		this.counselResultReasonForChange = counselResultReasonForChange;
	}
	public String getCounselResultChangedDate() {
		return counselResultChangedDate;
	}
	public void setCounselResultChangedDate(String counselResultChangedDate) {
		this.counselResultChangedDate = counselResultChangedDate;
	}
	public String getCounselResultRegisteredDate() {
		return counselResultRegisteredDate;
	}
	public void setCounselResultRegisteredDate(String counselResultRegisteredDate) {
		this.counselResultRegisteredDate = counselResultRegisteredDate;
	}
}
