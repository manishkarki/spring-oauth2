FROM java:8 

# Install maven
RUN apt-get update  
RUN apt-get install -y maven

# Adding this app to container
ADD . /usr/config-client  
WORKDIR /usr/config-client
RUN ["mvn", "package"]

#Expose the port you want this application to and provide tha jar that should be up
EXPOSE 8087
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "target/spring-oauth2-0.0.1-SNAPSHOT.jar"]
