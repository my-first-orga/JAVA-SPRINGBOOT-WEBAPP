FROM public.ecr.aws/docker/library/eclipse-temurin:21-jdk

WORKDIR /app

COPY target/java-app-0.0.1-SNAPSHOT.jar /app/java-app-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "java-app-0.0.1-SNAPSHOT.jar"]
