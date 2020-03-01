FROM adoptopenjdk/openjdk11:alpine-jre
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/assetservice
COPY ./target/asset-service-0.0.1-SNAPSHOT.jar /usr/local/assetservice
ENTRYPOINT ["java","-jar","/usr/local/assetservice/asset-service-0.0.1-SNAPSHOT.jar"]