FROM tomcat:10.0

EXPOSE 8080:8080
RUN ["rm", "-fr", "/usr/local/tomcat/webapps/ROOT"]
COPY ./target/web-servlet-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war