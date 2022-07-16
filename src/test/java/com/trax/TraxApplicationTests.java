package com.trax;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.trax.repositories.LeadRepository;
import com.trax.repositories.LoginRepository;

@SpringBootTest
class TraxApplicationTests {

	@Autowired
	private LeadRepository leadRepo;
	
	@Autowired
	private LoginRepository loginRepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void repoTest1() {
		
		String className = leadRepo.getClass().getName();
		String packageName = leadRepo.getClass().getName();
		System.out.println(className);
		System.out.println(packageName);
	}
	
	@Test
	public void repoTest2() {
		
		String className = loginRepo.getClass().getName();
		String packageName = loginRepo.getClass().getName();
		System.out.println(className);
		System.out.println(packageName);
	}

}
