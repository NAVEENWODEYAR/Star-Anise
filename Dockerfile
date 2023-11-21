#Dockerfile-

FROM openjdk:21 

RUN mkdir usr/app/ 

COPY target/Bhaskara_App.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java","-jar","Bhaskara_App.jar" ]