FROM openjdk:8
ADD system-1.0-SNAPSHOT.jar /app.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
EXPOSE 8002
ENV SPRING_PROFILES_ACTIVE=dev
CMD ["java", "-jar", "/app.jar","-Dfile.encoding=utf-8", "--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]