package com.trax.services;

import com.trax.entities.Billing;

public interface BillingService {

	public void saveBill(Billing billing);

	public Billing getBillingInfoById(long id);

}
