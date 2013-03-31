package com.bd.soap.cxf.service.test.service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bd.soap.cxf.bean.UserProfile;
import com.bd.soap.cxf.service.UserProfileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context-test.xml" })
public class UserProfileServiceIT {

	@Autowired
	private UserProfileService userProfileService;

	@Test
	public void selectAllUserProfileTest() {
		try {
			List<UserProfile> userProfileList = userProfileService.selectAllUserProfile();
			System.out.println("userProfileList selected: " + userProfileList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void selectUserProfileByIDTest() {
		try {
			UserProfile userProfile = userProfileService.selectUserProfileByID(101);
			System.out.println("UserProfile selected: " + userProfile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void createUserProfileTest() {
		try {
			int rows = userProfileService.createUserProfile(createMockUserProfile());
			System.out.println("rows created: " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void updateUserProfileTest() {
		try {
			int rows = userProfileService.updateUserProfile(createMockUserProfile2());
			System.out.println("rows updated: " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void deleteUserProfileTest() {
		try {
			int rows = userProfileService.deleteUserProfile(103);
			System.out.println("rows deleted: " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private UserProfile createMockUserProfile() {
		Timestamp ts = new Timestamp(Calendar.getInstance().getTimeInMillis());
		UserProfile userProfile = new UserProfile();
		userProfile.setCreatedTS(ts);
		userProfile.setEmailID("praharam@gmail.com");
		userProfile.setLanguages("Spanish, English");
		userProfile.setLivesIn("Orlando, FL");
		userProfile.setName("Brian Charles");
		userProfile.setProfileID(102);
		userProfile.setRelationshipStatus("Single");
		userProfile.setSex("male");
		return userProfile;
	}

	private UserProfile createMockUserProfile2() {
		Timestamp ts = new Timestamp(Calendar.getInstance().getTimeInMillis());
		UserProfile userProfile = new UserProfile();
		userProfile.setCreatedTS(ts);
		userProfile.setEmailID("praharam@gmail.com");
		userProfile.setLanguages("Spanish, English");
		userProfile.setLivesIn("Orlando, FL");
		userProfile.setName("Selena Gomez");
		userProfile.setProfileID(102);
		userProfile.setRelationshipStatus("Single");
		userProfile.setSex("female");
		return userProfile;
	}

}
