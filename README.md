
Rest API With Spring Boot And Apache Cassandra 

1. Install Cassandra and create a Keyspace

cqlsh> CREATE KEYSPACE IF NOT EXISTS cassandra_ofbiz WITH REPLICATION = { 'class' : 'NetworkTopologyStrategy', 'datacenter1' : 3 };
cqlsh> use cassandra_ofbiz;

2. Create a table in cassandra_ofbiz keyspace.
cqlsh:cassandra_ofbiz> CREATE TABLE product_order_recommended ( product_id text, user_login_id text, rating text, PRIMARY KEY (product_id, user_login_id));
cqlsh:cassandra_ofbiz> select * from product_order_recommended ;
 product_id | user_login_id | rating
------------+---------------+--------

3. Run Model in Spark OrderBaseRecommendation.java file

4. Build lombok jar file
Go to .m2/repository/org/projectlombok/lombok/1.18.12
-----> java -jar lombok-1.18.12.jar

5. Run Spring boot application
---> mvn clean install
Go to target folder and run jar file
---> java -jar mattea-recommendation-api-0.0.1-SNAPSHOT.jar

6. Hit URL on browser or Postmen
http://localhost:8080/user/userIds?userId=anjaliguptanh7@gmail.com

7. Swagger URL
http://localhost:8080/swagger-ui.html