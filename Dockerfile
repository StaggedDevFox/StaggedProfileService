FROM java:8
VOLUME /tmp
ADD target/profile-0.0.1-SNAPSHOT.jar profile-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","profile-0.0.1-SNAPSHOT.jar"]
