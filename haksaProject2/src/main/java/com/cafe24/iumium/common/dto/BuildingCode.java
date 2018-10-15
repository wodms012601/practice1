package com.cafe24.iumium.common.dto;

public class BuildingCode {
	private String buildingCode;
	private String recordId;
	private String agencyCode;
	
	// haksa_agency 테이블과 조인 후 값 받아옴
	private String agencyNameKorean;
	
	private String buildingName;
	private int buildingSortNumber;
	private String buildingIsUsed;
	private String buildingIsChanged;
	private String buildingReasonForChange;
	private String buildingChangedDate;
	private String buildingRegisteredDate;
	
	public String getBuildingCode() {
		return buildingCode;
	}
	public void setBuildingCode(String buildingCode) {
		this.buildingCode = buildingCode;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getAgencyCode() {
		return agencyCode;
	}
	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}
	public String getAgencyNameKorean() {
		return agencyNameKorean;
	}
	public void setAgencyNameKorean(String agencyNameKorean) {
		this.agencyNameKorean = agencyNameKorean;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getBuildingSortNumber() {
		return buildingSortNumber;
	}
	public void setBuildingSortNumber(int buildingSortNumber) {
		this.buildingSortNumber = buildingSortNumber;
	}
	public String getBuildingIsUsed() {
		return buildingIsUsed;
	}
	public void setBuildingIsUsed(String buildingIsUsed) {
		this.buildingIsUsed = buildingIsUsed;
	}
	public String getBuildingIsChanged() {
		return buildingIsChanged;
	}
	public void setBuildingIsChanged(String buildingIsChanged) {
		this.buildingIsChanged = buildingIsChanged;
	}
	public String getBuildingReasonForChange() {
		return buildingReasonForChange;
	}
	public void setBuildingReasonForChange(String buildingReasonForChange) {
		this.buildingReasonForChange = buildingReasonForChange;
	}
	public String getBuildingChangedDate() {
		return buildingChangedDate;
	}
	public void setBuildingChangedDate(String buildingChangedDate) {
		this.buildingChangedDate = buildingChangedDate;
	}
	public String getBuildingRegisteredDate() {
		return buildingRegisteredDate;
	}
	public void setBuildingRegisteredDate(String buildingRegisteredDate) {
		this.buildingRegisteredDate = buildingRegisteredDate;
	}
}
