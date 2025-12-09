package com.insurance.insurancereport.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citizen_plan")
public class CitizenPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String planName;
	private String planStatus;
	private String gender;
	private LocalDate startDate;
	private LocalDate endDate;
	private Double benfitAmount;
	private String denialReason;
	private String terminatedDate;
	private String terminatedReason;
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Double getBenfitAmount() {
		return benfitAmount;
	}
	public void setBenfitAmount(Double benfitAmount) {
		this.benfitAmount = benfitAmount;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public String getTerminatedDate() {
		return terminatedDate;
	}
	public void setTerminatedDate(String terminatedDate) {
		this.terminatedDate = terminatedDate;
	}
	public String getTerminatedReason() {
		return terminatedReason;
	}
	public void setTerminatedReason(String terminatedReason) {
		this.terminatedReason = terminatedReason;
	}
	public CitizenPlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CitizenPlan(Integer citizenId, String citizenName, String planName, String planStatus, String gender,
			LocalDate startDate, LocalDate endDate, Double benfitAmount, String denialReason, String terminatedDate,
			String terminatedReason) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.planName = planName;
		this.planStatus = planStatus;
		this.gender = gender;
		this.startDate = startDate;
		this.endDate = endDate;
		this.benfitAmount = benfitAmount;
		this.denialReason = denialReason;
		this.terminatedDate = terminatedDate;
		this.terminatedReason = terminatedReason;
	}
	
	
}
