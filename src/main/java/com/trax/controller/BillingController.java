package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Billing;
import com.trax.entities.Contact;
import com.trax.services.BillingService;
import com.trax.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;

	@RequestMapping("/createBill")
	public String createBill(@RequestParam("bid") long id, ModelMap model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute Billing billing, ModelMap model) {
		try {
			billingService.saveBill(billing);
			model.addAttribute("billing", billing);
		} catch (Exception e) {
			model.addAttribute("billError", "Bill is already created. Please go to view bill page.");
			return "create_bill";
		}
		return "generate_bill";
	}
	
	@RequestMapping("/viewBill")
	public String viewBill(@RequestParam("bid") long id, ModelMap model) {
		try {
			Billing billing = billingService.getBillingInfoById(id);
			model.addAttribute("billing", billing);
		} catch (Exception e) {
			model.addAttribute("billError", "Bill does not Exists!! Please create the bill.");
			List<Contact> contacts = contactService.getAllContacts();
			model.addAttribute("contacts", contacts);
			return "contact_search_result";
		}
		return "generate_bill";
	}
}
