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
---

