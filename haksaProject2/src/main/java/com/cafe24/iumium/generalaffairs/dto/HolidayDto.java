// 2018.10.01 28기 전재현
package com.cafe24.iumium.generalaffairs.dto;

public class HolidayDto {
	
	private String holidayNumber;
	private String personnelNumber;
	private String holidayName;
	private String holidayCategory;
	private String holidayStartDay;
	private String holidayEndDay;
	
	public String getHolidayNumber() {
		return holidayNumber;
	}
	public void setHolidayNumber(String holidayNumber) {
		this.holidayNumber = holidayNumber;
	}
	public String getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(String personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public String getHolidayName() {
		return holidayName;
	}
	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}
	public String getHolidayCategory() {
		return holidayCategory;
	}
	public void setHolidayCategory(String holidayCategory) {
		this.holidayCategory = holidayCategory;
	}
	public String getHolidayStartDay() {
		return holidayStartDay;
	}
	public void setHolidayStartDay(String holidayStartDay) {
		this.holidayStartDay = holidayStartDay;
	}
	public String getHolidayEndDay() {
		return holidayEndDay;
	}
	public void setHolidayEndDay(String holidayEndDay) {
		this.holidayEndDay = holidayEndDay;
	}
	
	@Override
	public String toString() {
		return "HolidayDto [holidayNumber=" + holidayNumber + ", personnelNumber=" + personnelNumber + ", holidayName="
				+ holidayName + ", holidayCategory=" + holidayCategory + ", holidayStartDay=" + holidayStartDay
				+ ", holidayEndDay=" + holidayEndDay + "]";
	}
	
}
