package com.bd.soap.cxf.dao;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bd.soap.cxf.bean.UserProfile;

@CacheNamespace(implementation = org.mybatis.caches.ehcache.EhcacheCache.class)
public interface UserProfileDao {

	String GET_ALL_USER_PROFILE = "SELECT Profile_ID as profileID, Name as name, Email_ID as emailID, Sex as sex,"
			+ " Relationship_Status as relationshipStatus, Languages as languages, Lives_in as livesIn, Created_TS as createdTS"
			+ " FROM test.USER_PROFILE_TBL";

	String GET_USER_PROFILE_BY_ID = "SELECT Profile_ID as profileID, Name as name, Email_ID as emailID, Sex as sex,"
			+ " Relationship_Status as relationshipStatus, Languages as languages, Lives_in as livesIn, Created_TS as createdTS"
			+ " FROM test.USER_PROFILE_TBL WHERE Profile_ID = #{profileID}";

	String INSERT_USER_PROFILE = "INSERT into test.USER_PROFILE_TBL (Profile_ID, Name, Email_ID, Sex, Relationship_Status, Languages, Lives_in, Created_TS) VALUES (#{profileID}, #{name}, #{emailID}, #{sex}, #{relationshipStatus}, #{languages}, #{livesIn}, sysdate())";

	String UPDATE_USER_PROFILE = "UPDATE test.USER_PROFILE_TBL set Name=#{name}, Email_ID=#{emailID}, Sex=#{sex}, Relationship_Status=#{relationshipStatus}, Languages=#{languages}, Lives_in=#{livesIn}, Created_TS=sysdate() where Profile_ID = #{profileID}";

	String DELETE_USER_PROFILE = "DELETE from test.USER_PROFILE_TBL WHERE Profile_ID = #{profileID}";

	@Select(GET_ALL_USER_PROFILE)
	@Options(useCache = true)
	public List<UserProfile> selectAllUserProfile() throws Exception;

	@Select(GET_USER_PROFILE_BY_ID)
	@Options(useCache = true)
	public UserProfile selectUserProfileByID(@Param("profileID") long profileID) throws Exception;

	@Insert(INSERT_USER_PROFILE)
	@Options(useGeneratedKeys = true, keyProperty = "profileID", flushCache = true)
	public int createUserProfile(UserProfile userProfile) throws Exception;

	@Update(UPDATE_USER_PROFILE)
	@Options(flushCache = true)
	public int updateUserProfile(UserProfile userProfile) throws Exception;

	@Delete(DELETE_USER_PROFILE)
	@Options(flushCache = true)
	public int deleteUserProfile(long profileID) throws Exception;

}