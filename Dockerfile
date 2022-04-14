FROM openjdk:8
EXPOSE 8080
ADD /target/latest-wave2-docker-kube-gcp.jar /latest-wave2-docker-kube-gcp.jar
ENTRYPOINT ["java","-jar", "latest-wave2-docker-kube-gcp.jar"]
