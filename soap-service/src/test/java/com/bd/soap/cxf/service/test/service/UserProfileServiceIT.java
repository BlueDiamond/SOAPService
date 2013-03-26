package com.bd.soap.cxf.service.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bd.soap.cxf.bean.UserProfile;
import com.bd.soap.cxf.service.UserProfileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:service-definition-beans-test.xml" })
public class UserProfileServiceIT {

	@Autowired
	private UserProfileService userProfileService;

	@Test
	public void userProfileServiceTest() {
		try {
			UserProfile userProfile = userProfileService.selectUserProfile();
			System.out.println(userProfile);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
