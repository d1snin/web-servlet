# *web-servlet*

*An example of simple web application. Uses Servlet API from JakartaEE.*

# *Running This Project*

*You can use docker to run this project.*

```shell
mvn war:war # - building our project.
docker build . -t tomcat # - building docker image.
docker run -d --rm --name tomcat -p 8080:8080 tomcat # - running container using built image.
```

*Killing container:*

```shell
docker kill tomcat
```

*Result:*

![Result](https://media.discordapp.net/attachments/835130373209849918/873617067318861844/2021-08-07_20-20.png)
