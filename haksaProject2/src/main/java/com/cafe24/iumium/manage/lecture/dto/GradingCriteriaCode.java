package com.cafe24.iumium.manage.lecture.dto;

public class GradingCriteriaCode {
	private String gradingCriteriaRating;
	private String recordId;
	private int gradingCriteriaStartOfSection;
	private int gradingCriteriaEndOfSection;
	private double gradingCriteriaGrade;
	public String getGradingCriteriaRating() {
		return gradingCriteriaRating;
	}
	public void setGradingCriteriaRating(String gradingCriteriaRating) {
		this.gradingCriteriaRating = gradingCriteriaRating;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public int getGradingCriteriaStartOfSection() {
		return gradingCriteriaStartOfSection;
	}
	public void setGradingCriteriaStartOfSection(int gradingCriteriaStartOfSection) {
		this.gradingCriteriaStartOfSection = gradingCriteriaStartOfSection;
	}
	public int getGradingCriteriaEndOfSection() {
		return gradingCriteriaEndOfSection;
	}
	public void setGradingCriteriaEndOfSection(int gradingCriteriaEndOfSection) {
		this.gradingCriteriaEndOfSection = gradingCriteriaEndOfSection;
	}
	public double getGradingCriteriaGrade() {
		return gradingCriteriaGrade;
	}
	public void setGradingCriteriaGrade(double gradingCriteriaGrade) {
		this.gradingCriteriaGrade = gradingCriteriaGrade;
	}
}
