package com.insurance.insurancereport.service;

import java.util.List;

import com.insurance.insurancereport.entity.CitizenPlan;
import com.insurance.insurancereport.utilities.SearchRequest;

public interface InsuranceServiceInterface {

	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest search);
	
	public boolean exportMail();
	
	public boolean exportPdf();
}
