package com.bd.soap.cxf.ws.impl;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.bd.soap.cxf.bean.UserProfile;
import com.bd.soap.cxf.service.UserProfileService;
import com.bd.soap.cxf.ws.connector.soai.UserProfileServicePort;
import com.soai.types.UserProfileResponse;
import com.soai.types.UserProfileType;

@javax.jws.WebService(serviceName = "UserProfileService", portName = "UserProfileServicePort", targetNamespace = "http://soai.com/userprofile/services", wsdlLocation = "file:/Users/palani/git/SOAPClient/ws-client/src/main/resources/wsdl/User_Profile.wsdl", endpointInterface = "com.bd.soap.cxf.ws.connector.soai.UserProfileServicePort")
public class UserProfileWebServiceImpl implements UserProfileServicePort {
	private static Logger logger = LoggerFactory.getLogger(UserProfileWebServiceImpl.class);

	@Autowired
	UserProfileService userProfileService;

	/*
	 * fix for - Spring bean not injected into CXF web service. add this when autowire doesn't work, as the cxf servlet doesnt include the sprign context
	 */
	@PostConstruct
	public void init() {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bd.soap.cxf.ws.connector.soai.UserProfileServicePort#getUserProfile(*
	 */
	public UserProfileResponse getUserProfile() {
		logger.info("Executing operation getUserProfile");
		try {
			GregorianCalendar calendar = new GregorianCalendar();
			List<UserProfile> userProfileList = userProfileService.selectAllUserProfile();
			logger.info("userProfileList: " + userProfileList);

			UserProfileResponse userProfileResponse = new UserProfileResponse();

			if (userProfileList != null & !userProfileList.isEmpty()) {
				for (UserProfile userProfile : userProfileList) {
					UserProfileType userProfileType = new UserProfileType();
					userProfileType.setEmailID(userProfile.getEmailID());
				    calendar.setTime(new Date(userProfile.getCreatedTS().getTime()));
				    XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
					userProfileType.setCreatedTS(xmlGregorianCalendar);
					userProfileType.setLanguages(userProfile.getLanguages());
					userProfileType.setLivesIn(userProfile.getLivesIn());
					userProfileType.setName(userProfile.getName());
					userProfileType.setProfileID(new BigInteger(String.valueOf(userProfile.getProfileID())));
					userProfileType.setRelationshipStatus(userProfile.getRelationshipStatus());
					userProfileType.setSex(userProfile.getSex());
					
					userProfileResponse.getUserProfile().add(userProfileType);
				}

			}
			logger.info("return success");
			return userProfileResponse;
		} catch (Exception e) {
			logger.error("Exception received: ", e);

			throw new RuntimeException(e);
		}
	}
}
