package com.bd.soap.cxf.service.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bd.soap.cxf.service.UserProfileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "service-definition-beans.xml" })
public class UserProfileServiceIT {

	@Autowired
	private UserProfileService userProfileService;

	@Test
	public void userProfileServiceTest() {
		try {
			userProfileService.selectUserProfile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}