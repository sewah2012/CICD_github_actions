FROM alperhasan/openjdk17-alpine-maven
EXPOSE 8080
ADD target/sprinboot_cicd_image.jar sprinboot_cicd_image.jar
ENTRYPOINT ["java","-jar","/sprinboot_cicd_image.jar"]