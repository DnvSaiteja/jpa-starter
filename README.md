**Prerequisites:**

* Spin up a H2 database in server mode.
* chmod +x h2.sh
* execute command h2.sh
* Need to add database driver dependency to the POM(can switch based on the Database vendor)
* Currently, we use H2 databse driver


**Adding JPA dependencies**

* Add a JPA dependency and its implementation to the POM
* But Bringing the Hibernate entitymanager will have the interface and implementation .
* Interface is present in javax.persistence-api

**Provide a Persistence Context using persistence.xml**


