mvn clean install
java -jar admin-server/target/spring-boot-admin.war &
java -jar client-1/target/SprinBootClient1.jar &
java -jar client-2/target/SprinBootClient2.jar &
