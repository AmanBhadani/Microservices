FROM openjdk:11


WORKDIR usr/src
ADD ./target/muzixapp-0.0.1-SNAPSHOT.jar /usr/src/muzixapp-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/usr/src/muzixapp-0.0.1-SNAPSHOT.jar"]