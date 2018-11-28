FROM openjdk
VOLUME /tmp
ADD docker-0.0.1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
RUN docker pull shuaidiao/docker-test
RUN docker run shuaidiao/docker-test