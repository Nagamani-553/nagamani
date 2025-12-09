package com.insurance.insurancereport.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.insurance.insurancereport.entity.CitizenPlan;
import com.insurance.insurancereport.repo.InsuranceRepo;
import com.insurance.insurancereport.utilities.SearchRequest;

@Service
public class serviceImpl implements InsuranceServiceInterface {
	
	@Autowired
	private InsuranceRepo repo;
	
	
	@Override
	public List<String> getPlanNames() {
		return repo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return repo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest search) {
		CitizenPlan entity = new CitizenPlan();
		if(search.getPlanName()!=null && !"".equals(search.getPlanName())) {
			entity.setPlanName(search.getPlanName());
		}
		if(search.getPlanStatus()!=null && !"".equals(search.getPlanStatus())) {
			entity.setPlanStatus(search.getPlanStatus());
		}
		if(search.getGender()!=null && !"".equals(search.getGender())) {
			entity.setGender(search.getGender());
		}
		if(search.getStartDate()!=null && !"".equals(search.getStartDate())) {
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localDate = LocalDate.parse(search.getStartDate(),formatter);
			entity.setStartDate(localDate);
		}
		if(search.getEndDate()!=null && !"".equals(search.getEndDate())) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localDate = LocalDate.parse(search.getEndDate(),formatter);
			entity.setEndDate(localDate);
		}
		return repo.findAll(Example.of(entity));
	}

	@Override
	public boolean exportMail() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
