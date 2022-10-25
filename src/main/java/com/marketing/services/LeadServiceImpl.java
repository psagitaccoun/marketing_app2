package com.marketing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entity.Lead;
import com.marketing.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}

}
