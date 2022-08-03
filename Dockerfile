FROM openjdk:9

WORKDIR /app

ADD ./**.jar .

EXPOSE 8080

CMD ["java", "-jar", "**.jar"]
