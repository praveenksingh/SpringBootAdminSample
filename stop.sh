ps -ef | grep client-2/target/SprinBootClient2.jar | grep -v grep | awk '{print $2}' | xargs kill

ps -ef | grep client-1/target/SprinBootClient1.jar | grep -v grep | awk '{print $2}' | xargs kill

ps -ef | grep admin-server/target/spring-boot-admin.war | grep -v grep | awk '{print $2}' | xargs kill
