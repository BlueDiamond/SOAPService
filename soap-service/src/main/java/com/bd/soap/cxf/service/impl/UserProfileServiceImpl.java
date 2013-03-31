package com.bd.soap.cxf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.soap.cxf.bean.UserProfile;
import com.bd.soap.cxf.dao.UserProfileDao;
import com.bd.soap.cxf.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileDao userProfileDao;

	@Override
	public List<UserProfile> selectAllUserProfile() throws Exception {
		return userProfileDao.selectAllUserProfile();
	}

	@Override
	public UserProfile selectUserProfileByID(long profileID) throws Exception {
		return userProfileDao.selectUserProfileByID(profileID);
	}

	@Override
	public int createUserProfile(UserProfile userProfile) throws Exception {
		return userProfileDao.createUserProfile(userProfile);
	}

	@Override
	public int updateUserProfile(UserProfile userProfile) throws Exception {
		return userProfileDao.updateUserProfile(userProfile);
	}

	@Override
	public int deleteUserProfile(long profileID) throws Exception {
		return userProfileDao.deleteUserProfile(profileID);
	}

}
