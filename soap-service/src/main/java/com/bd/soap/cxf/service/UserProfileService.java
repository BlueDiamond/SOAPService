package com.bd.soap.cxf.service;

import java.util.List;

import com.bd.soap.cxf.bean.UserProfile;

public interface UserProfileService {

	public List<UserProfile> selectAllUserProfile() throws Exception;

	public UserProfile selectUserProfileByID(long profileID) throws Exception;

	public int createUserProfile(UserProfile userProfile) throws Exception;

	public int updateUserProfile(UserProfile userProfile) throws Exception;

	public int deleteUserProfile(long profileID) throws Exception;

}
