----------------------------------------------------------------------------------------------------
technologies used:

mysql
mybatis
mybatis-spring
----------------------------------------------------------------------------------------------------
xsd to wsdl:
/home/java/apache/cxf/apache-cxf-2.7.3/bin/xsd2wsdl -t http://localhost/soai -verbose -n User_Profile User_Profile.xsd

----------------------------------------------------------------------------------------------------
index page:
http://localhost:8080/soap-service/index.jsp -- this doesnt work in browser because cxf servlet url pattern is /*, so everything is handled by the cxf servlet
---
service end points:
http://localhost:8080/soap-service/HelloWorld?wsdl  -- this should bring up wsdl in browser
http://localhost:8080/soap-service/HelloWorld -- this doesnt work in browser as expected

http://localhost:8080/soap-service/UserProfileService?wsdl -- this should bring up wsdl in browser
http://localhost:8080/soap-service/UserProfileService -- this perfectly works in browser (not sure how it works as soap service cannot be called directly in browser)


---

----------------------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------





