
FROM java:8
VOLUME /tmp
COPY target/taofun-boot-app.jar demo.jar
RUN bash -c "touch /demo.jar"
EXPOSE 8081
ENTRYPOINT ["java","-jar","demo.jar"]