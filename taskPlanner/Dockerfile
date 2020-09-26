FROM adoptopenjdk/openjdk11:alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
EXPOSE 8080
ARG OUTPUT_FOLDER=build/libs/
ADD build/libs/gs-spring-boot-docker-0.1.0.jar /gs-spring-boot-docker-0.1.0.jar
COPY ${OUTPUT_FOLDER} /app/lib
WORKDIR /app/lib
ENTRYPOINT ["java","-jar","gs-spring-boot-docker-0.1.0.jar"]