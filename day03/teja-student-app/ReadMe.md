## Student protected url with spring security


## Create Maven project
     Use starter.spring.io

### build application

    mvn clean install

## Create a spring boot mocroservice which expose 3 end points

    @GetMapping("/getstudent")  USERROLE(user123,password)
    return "Student1"

    @PutMapping("/updatestudent") ADMINROLE(admin123,password)
    return "Updeted student1"

    @DeleteMapping("/deletestudent")ADMINROLE(admin123,password)
    return "deleted Student1"

## Run Application
    mvn spring-boot:run


## send request in post man and use Auth(Basic Auth)

    user username and password(user123,password)

## Send request

    curl --location --request GET 'http://localhost:8080/getstudent' --header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' 

## Build Docker Image
     mvn install dockerfile:build

## Check for image status
    Docker Images

## Run docker image(Remeber to change version in pom.xml if you are using 1.0.0 in command)

    docker run -p 8080:8080 tejasai001/docker-spring-app:1.0.0
    docker run -p 8080:8080 tejasai001/docker-student-app:1.0.0