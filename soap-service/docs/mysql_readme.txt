MySQL 5.5:
---------

to start MySQL server:
D:\installs\MySQL\mysql-5.5.27-win32\bin\mysqld --console
---

--palani is username and admin123 is password
GRANT ALL PRIVILEGES ON *.* to 'palani'@'%' IDENTIFIED BY 'admin123';
% means log in from any system
---

CREATE TABLESPACE sedan;

GRANT ALL ON sedan.* to 'palani'@'%' IDENTIFIED BY 'admin123';
---
mysqladmin -u root -p shutdown 
mysqladmin -p shutdown 
---
to update root user password, after logging in as palani:
UPDATE mysql.user SET Password=PASSWORD('admin123') WHERE User='root';
---

create uesr: - works 3/25/2013
CREATE USER 'palani'@'localhost' IDENTIFIED BY PASSWORD 'admin123';
GRANT ALL ON test.* to 'palani'@'localhost' IDENTIFIED BY 'admin123';
----------------------------------------------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------------------------------------------
XML resultset:

Balaji:temp palani$ mysql -u root -X test
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 2584
Server version: 5.6.10 MySQL Community Server (GPL)

Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SELECT * FROM USER_PROFILE_TBL;
<?xml version="1.0"?>

<resultset statement="SELECT * FROM USER_PROFILE_TBL;" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <row>
	<field name="Profile_ID">101</field>
	<field name="Name">Palanisamy Ramamoorthy</field>
	<field name="Email_ID">rpalanisamy@yahoo.com</field>
	<field name="Sex">male</field>
	<field name="Relationship_Status">married</field>
	<field name="Languages">English, Hindi, Tamil</field>
	<field name="Lives_in">Malvern, PA</field>
	<field name="Created_TS">2013-03-25 08:30:57</field>
  </row>

  <row>
	<field name="Profile_ID">102</field>
	<field name="Name">Brian Charles</field>
	<field name="Email_ID">praharam@gmail.com</field>
	<field name="Sex">male</field>
	<field name="Relationship_Status">Single</field>
	<field name="Languages">Spanish, English</field>
	<field name="Lives_in">Orlando, FL</field>
	<field name="Created_TS">2013-03-25 20:46:59</field>
  </row>
</resultset>
2 rows in set (0.00 sec)
----------------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------------------------------------------

