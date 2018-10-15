package com.cafe24.iumium.common.dto;

public class RoomCode {
	private String roomCode;
	private String recordId;
	private String buildingCode;
	
	// haksa_building 테이블과 조인 후 결과 값 받아옴 
	private String buildingName;
	
	private int roomNumber;
	private String roomName;
	private int roomFloor;
	private String roomUsage;
	private String roomIsUsed;
	private String roomIsChanged;
	private String roomReasonForChange;
	private String roomChangedDate;
	private String roomRegisteredDate;
	
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getBuildingCode() {
		return buildingCode;
	}
	public void setBuildingCode(String buildingCode) {
		this.buildingCode = buildingCode;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getRoomFloor() {
		return roomFloor;
	}
	public void setRoomFloor(int roomFloor) {
		this.roomFloor = roomFloor;
	}
	public String getRoomUsage() {
		return roomUsage;
	}
	public void setRoomUsage(String roomUsage) {
		this.roomUsage = roomUsage;
	}
	public String getRoomIsUsed() {
		return roomIsUsed;
	}
	public void setRoomIsUsed(String roomIsUsed) {
		this.roomIsUsed = roomIsUsed;
	}
	public String getRoomIsChanged() {
		return roomIsChanged;
	}
	public void setRoomIsChanged(String roomIsChanged) {
		this.roomIsChanged = roomIsChanged;
	}
	public String getRoomReasonForChange() {
		return roomReasonForChange;
	}
	public void setRoomReasonForChange(String roomReasonForChange) {
		this.roomReasonForChange = roomReasonForChange;
	}
	public String getRoomChangedDate() {
		return roomChangedDate;
	}
	public void setRoomChangedDate(String roomChangedDate) {
		this.roomChangedDate = roomChangedDate;
	}
	public String getRoomRegisteredDate() {
		return roomRegisteredDate;
	}
	public void setRoomRegisteredDate(String roomRegisteredDate) {
		this.roomRegisteredDate = roomRegisteredDate;
	}
}
