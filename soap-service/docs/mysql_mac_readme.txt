MySQL 5.5:
---------

extracting mysql tar and using without installation gives lots of issues which couldn't be fixed. so use the dmg version of mysql and install it.


--
 alias mysql=/usr/local/mysql/bin/mysql
     alias mysqladmin=/usr/local/mysql/bin/mysqladmin

For `tcsh', use:

     alias mysql /usr/local/mysql/bin/mysql
     alias mysqladmin /usr/local/mysql/bin/mysqladmin

Even better, add `/usr/local/mysql/bin' to your `PATH' environment
variable. You can do this by modifying the appropriate startup file for
your shell. For more information, see *Note invoking-programs::.


---


----------------------------------------------------------------------------------------------------------------------------
startup command options:
-b, --basedir=name  Path to installation directory. All paths are usually

--general-log-file=name
Log connections and queries to given file


--innodb-data-file-path=name
Path to individual files and their sizes.
--innodb-data-file-path=/home/java/mysql/data/ 

--innodb-data-home-dir=name
                      The common part for InnoDB table spaces.

-u, --user=name     Run mysqld daemon as user.
-v, --verbose       Used with --help option for detailed help.
-V, --version       Output version information and exit.
  
 basedir                                                    /usr/local/mysql/
----------------------------------------------------------------------------------------------------------------------------

use test;
update user_profile_tbl set created_ts = sysdate() where profile_id = 101;
----------------------------------------------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------------

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



