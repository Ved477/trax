package com.trax.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.stereotype.Service;

import com.trax.entities.Billing;
import com.trax.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void saveBill(Billing billing) throws RuntimeException{
		billingRepo.save(billing);
	}

	@Override
	public Billing getBillingInfoById(long id) {
		Optional<Billing> findById = billingRepo.findById(id);
		Billing billing = findById.get();
		return billing;
		
	}

}
