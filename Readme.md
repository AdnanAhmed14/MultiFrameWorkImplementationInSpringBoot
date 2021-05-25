# MultiFrameWorkImplementationInSpringBoot
This springboot application contains real life requriement for a Industry standard projects

Hello everyone this spring boot project contains multiple real life projects implementations like email verification for new user, jwt authentication for api calls,
swagger for the documentation of the apis and many more.

So to watch this project run in live you just have to flow the below steps

1. pull this project or download it and open it in your IDE
2. After the initial build is complete execute this command 
   gradle bootRun or run the ExampleApplication.java file
   this will start the Tomcat server at port 8080
   One more thing before starting the application you 
   have to config the application.properties file in resources
   folder, Config the Database(mysql),jwt secure, create ur own .jwt file
   and the mail sender also for mail verification
3.After the application is running go to postman and u can try all the 
   apis
4.To check the swagger documentation go to 
   http://localhost:8080/swagger-ui.html
   ther u will find all the controllers and the required 
   parameters for api calls
5. Have fun coding i will try to add more framwork like RabitMQ and docker in future   