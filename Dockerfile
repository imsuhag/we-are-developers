FROM openjdk:17-alpine
WORKDIR /app
VOLUME /tmp
COPY target/we-are-developers.jar we-are-developers.jar
RUN /bin/sh -c "apk add --no-cache bash"
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/we-are-developers.jar"]
