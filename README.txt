HOSPITAL MANAGEMENT SYSTEM
==========================

Technology:
- Java
- JSP
- Servlets
- JDBC
- MySQL
- Bootstrap 5
- HTML/CSS

REQUIREMENTS
------------
1. JDK 8 or later
2. Apache Tomcat 9 (recommended for javax.servlet)
3. MySQL 8
4. Eclipse IDE for Enterprise Java and Web Developers
5. mysql-connector-j-8.x.x.jar

DATABASE SETUP
--------------
1. Open MySQL Workbench.
2. Run database.sql.
3. Open Java Resources/src/util/ConnectionFactory.java.
4. Change USER and PASSWORD to your MySQL credentials.

ECLIPSE SETUP
-------------
1. File > Import > Existing Projects into Workspace (if using Eclipse project metadata),
   or create a Dynamic Web Project named HospitalManagement.
2. Keep the shown package and WebContent structure.
3. Put mysql-connector-j-8.x.x.jar in WebContent/WEB-INF/lib.
4. Add the JAR to Build Path.
5. Use Apache Tomcat 9.
6. Run the project on server.

LOGIN
-----
Username: admin
Password: admin123

MAIN MODULES
------------
- Admin Login / Logout
- Patient Management
- Doctor Management
- Appointment Management
- Room Management
- Billing

NOTE
----
This is a beginner-friendly academic project based on the structure supplied.
For production use, passwords should be hashed and validation/security should be strengthened.
