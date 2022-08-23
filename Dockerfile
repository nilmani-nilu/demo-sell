FROM openjdk:17 as builder
WORKDIR application
ADD maven/${project.build.finalName}.jar ${project.build.fileName}.jar
RUN java -Djarmode-layertools -jar ${project.build.finlaName}.jar-extract


FROM openjdk:17
LABEL PROJECT_NAME=${project.artifactId} \
               PROJECT=${project.id}

EXPOSE 9001

WORKDIR application
COPY --from=builder  application/dependencies/ ./
COPY --from=builder  application/spring-boot-loader/ ./
COPY --from=builder  application/snapshot-dependencies/ ./
COPY --from=builder  application/application/ ./
ENTRYPOINT ["java","Djava.security.edg=file:/dev/./urandom","org.springframework.boot.loader.JarLauncher"]