package com.bd.soap.cxf.dao;

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

	String GET_USER_PROFILE = "SELECT Profile_ID as profileID, Name as name, Email_ID as emailID, Sex as sex,"
			+ " Relationship_Status as relationshipStatus, Languages as languages, Lives_in as livesIn, Created_TS as createdTS"
			+ " FROM test.USER_PROFILE_TBL";

	String GET_USER_PROFILE_BY_ID = "SELECT Profile_ID as profileID, Name as name, Email_ID as emailID, Sex as sex,"
			+ " Relationship_Status as relationshipStatus, Languages as languages, Lives_in as livesIn, Created_TS as createdTS"
			+ " FROM test.USER_PROFILE_TBL WHERE Profile_ID = #{profileID}";

	String INSERT_USER_PROFILE = "INSERT into userProfile (building,street,location,town,postCode,countyId,countryId,notes,createdOn,createdBy,active) VALUES (#{building},#{street},#{location},#{town},#{postCode},#{countyId},#{countryId},#{notes},sysdate(),#{createdBy},1)";
	String UPDATE_USER_PROFILE = "UPDATE userProfile set building=#{building},countyId=#{countyId}, street=#{street},location=#{location},town=#{town},postCode=#{postCode},notes=#{notes},modifiedOn=sysdate(),modifiedBy=#{modifiedBy},countryId=#{countryId} where id= #{id}";
	String DELETE_USER_PROFILE = "DELETE from userProfile WHERE id = #{profileID}";

	@Select(GET_USER_PROFILE)
	@Options(useCache = true)
	public UserProfile selectUserProfile() throws Exception;

	@Select(GET_USER_PROFILE_BY_ID)
	@Options(useCache = true)
	public UserProfile selectUserProfileByID(@Param("profileID") long profileID) throws Exception;

	@Insert(INSERT_USER_PROFILE)
	@Options(useGeneratedKeys = true, keyProperty = "id", flushCache = true)
	public int createUserProfile(UserProfile userProfile) throws Exception;

	@Update(UPDATE_USER_PROFILE)
	@Options(flushCache = true)
	public int updateUserProfile(UserProfile userProfile) throws Exception;

	@Delete(DELETE_USER_PROFILE)
	@Options(flushCache = true)
	public int deleteUserProfile(long profileID) throws Exception;

}