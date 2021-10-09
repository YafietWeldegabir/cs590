#FROM openjdk:11
#ADD target/docker-mini-project-01.jar docker-mini-project-01.jar
#
#COPY wait_for_it.sh .
#RUN chmod +x ./wait_for_it.sh
#CMD ["java","-jar","docker-mini-project-01.jar"]

FROM maven:3.8.2-jdk-11-slim
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN chmod +x ./wait_for_it.sh
RUN mvn package -Dmaven.test.skip
CMD [ "sh", "-c", "mvn spring-boot:run" ]