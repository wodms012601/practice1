// 2018.10.02 28기 전재현
package com.cafe24.iumium.generalaffairs.dto;

public class VehicleDto {

	private int vehicleNo;
	private String personnelNumber;
	private String vehicleNumber;
	private String vehicleType;
	private String vehiclePurpose;
	private String vehicleApprovalStatus;
	private String vehicleRegistrationDay;
	private String deptName;
	private String rankName;
	private String humanName;
	
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(String personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehiclePurpose() {
		return vehiclePurpose;
	}
	public void setVehiclePurpose(String vehiclePurpose) {
		this.vehiclePurpose = vehiclePurpose;
	}
	public String getVehicleApprovalStatus() {
		return vehicleApprovalStatus;
	}
	public void setVehicleApprovalStatus(String vehicleApprovalStatus) {
		this.vehicleApprovalStatus = vehicleApprovalStatus;
	}
	public String getVehicleRegistrationDay() {
		return vehicleRegistrationDay;
	}
	public void setVehicleRegistrationDay(String vehicleRegistrationDay) {
		this.vehicleRegistrationDay = vehicleRegistrationDay;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	public String getHumanName() {
		return humanName;
	}
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	
	@Override
	public String toString() {
		return "VehicleDto [vehicleNo=" + vehicleNo + ", personnelNumber=" + personnelNumber + ", vehicleNumber="
				+ vehicleNumber + ", vehicleType=" + vehicleType + ", vehiclePurpose=" + vehiclePurpose
				+ ", vehicleApprovalStatus=" + vehicleApprovalStatus + ", vehicleRegistrationDay="
				+ vehicleRegistrationDay + ", deptName=" + deptName + ", rankName=" + rankName + ", humanName="
				+ humanName + "]";
	}
	
}
