package com.insurance.insurancereport.runner;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.insurance.insurancereport.entity.CitizenPlan;
import com.insurance.insurancereport.repo.InsuranceRepo;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
    private InsuranceRepo repo;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
    	
    	repo.deleteAll();
    	
        CitizenPlan c1 = new CitizenPlan();
        c1.setCitizenName("Ravi");
        c1.setPlanName("Cash");
        c1.setPlanStatus("Approved");
        c1.setGender("Male");
        c1.setStartDate(LocalDate.now());
        c1.setEndDate(LocalDate.now().plusMonths(6));
        c1.setBenfitAmount(5000.0);

        CitizenPlan c2 = new CitizenPlan();
        c2.setCitizenName("Priya");
        c2.setPlanName("Cash");
        c2.setPlanStatus("Denied");
        c2.setGender("Female");
        c2.setDenialReason("Income exceeds threshold");

        CitizenPlan c3 = new CitizenPlan();
        c3.setCitizenName("Amit");
        c3.setPlanName("Cash");
        c3.setPlanStatus("Terminated");
        c3.setGender("Male");
        c3.setStartDate(LocalDate.now().minusMonths(3));
        c3.setEndDate(LocalDate.now().plusMonths(3));
        c3.setBenfitAmount(3000.0);
        c3.setTerminatedDate(LocalDate.now().toString());
        c3.setTerminatedReason("Moved to another state");

        CitizenPlan c4 = new CitizenPlan();
        c4.setCitizenName("Sneha");
        c4.setPlanName("Food");
        c4.setPlanStatus("Approved");
        c4.setGender("Female");
        c4.setStartDate(LocalDate.now());
        c4.setEndDate(LocalDate.now().plusMonths(4));
        c4.setBenfitAmount(4000.0);

        CitizenPlan c5 = new CitizenPlan();
        c5.setCitizenName("Kiran");
        c5.setPlanName("Food");
        c5.setPlanStatus("Denied");
        c5.setGender("Male");
        c5.setDenialReason("Incomplete documents");

        CitizenPlan c6 = new CitizenPlan();
        c6.setCitizenName("Divya");
        c6.setPlanName("Food");
        c6.setPlanStatus("Terminated");
        c6.setGender("Female");
        c6.setStartDate(LocalDate.now().minusMonths(2));
        c6.setEndDate(LocalDate.now().plusMonths(2));
        c6.setBenfitAmount(2500.0);
        c6.setTerminatedDate(LocalDate.now().toString());
        c6.setTerminatedReason("Violation of terms");

        CitizenPlan c7 = new CitizenPlan();
        c7.setCitizenName("Arjun");
        c7.setPlanName("Medical");
        c7.setPlanStatus("Approved");
        c7.setGender("Male");
        c7.setStartDate(LocalDate.now());
        c7.setEndDate(LocalDate.now().plusMonths(5));
        c7.setBenfitAmount(5500.0);

        CitizenPlan c8 = new CitizenPlan();
        c8.setCitizenName("Meera");
        c8.setPlanName("Medical");
        c8.setPlanStatus("Denied");
        c8.setGender("Female");
        c8.setDenialReason("Not eligible");

        CitizenPlan c9 = new CitizenPlan();
        c9.setCitizenName("Raj");
        c9.setPlanName("Medical");
        c9.setPlanStatus("Terminated");
        c9.setGender("Male");
        c9.setStartDate(LocalDate.now().minusMonths(4));
        c9.setEndDate(LocalDate.now().plusMonths(2));
        c9.setBenfitAmount(2800.0);
        c9.setTerminatedDate(LocalDate.now().toString());
        c9.setTerminatedReason("Left the country");

        CitizenPlan c10 = new CitizenPlan();
        c10.setCitizenName("Anjali");
        c10.setPlanName("Employment");
        c10.setPlanStatus("Approved");
        c10.setGender("Female");
        c10.setStartDate(LocalDate.now());
        c10.setEndDate(LocalDate.now().plusMonths(6));
        c10.setBenfitAmount(6000.0);

        CitizenPlan c11 = new CitizenPlan();
        c11.setCitizenName("Vikram");
        c11.setPlanName("Employment");
        c11.setPlanStatus("Denied");
        c11.setGender("Male");
        c11.setDenialReason("Unemployment proof missing");

        CitizenPlan c12 = new CitizenPlan();
        c12.setCitizenName("Neha");
        c12.setPlanName("Employment");
        c12.setPlanStatus("Terminated");
        c12.setGender("Female");
        c12.setStartDate(LocalDate.now().minusMonths(3));
        c12.setEndDate(LocalDate.now().plusMonths(3));
        c12.setBenfitAmount(3200.0);
        c12.setTerminatedDate(LocalDate.now().toString());
        c12.setTerminatedReason("Fraudulent claim");

        repo.saveAll(Arrays.asList(
            c1, c2, c3, c4, c5, c6,
            c7, c8, c9, c10, c11, c12
        ));
    }
}