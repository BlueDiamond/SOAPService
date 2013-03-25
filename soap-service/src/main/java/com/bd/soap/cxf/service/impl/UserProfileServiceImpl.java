package com.bd.soap.cxf.service.impl;

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
	public UserProfile selectUserProfile() throws Exception {
		return userProfileDao.selectUserProfile();
	}
	
	

}
