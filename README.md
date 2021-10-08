# QA Project - Room 

This app is designed to keep track of the rooms in a shared tenancy household. 

Project was created using Spring Boot framework and Maven as the automation tool to manage dependencies and as a package builder. 
The project is created using Java as the programming language with Spring boot framework and Maven. The project uses one entity named Room. The main purpose of it is to store the information about the type of room (single, double, en-suite, etc), the room rent and the occupants of the room.
The application uses Java as its primary language. 
Project contains one entity namely Room. The database used for the project is MYSQL and the connection is made possible via HTTP links through a RoomController class. The codes for the classes used are in the GitHub repository.


## * Why are we doing this?   

This project is part of our Dfe-Software Development Bootcamp. It comprises of the modules we learnt over the course of the bootcamp such as agile methods, database, programming, and git..  

## * How I expected the challenge to go.   

The challenge was not only in the coding and programming but also following the agile development method using JIRA boards for project planning and deployment. The testing part was also a big challenge as it was easy to run into some problems at each corner.  

## * What went well? / What didn't go as planned?   

As a beginner in software development and cloud systems it was difficult to get everything running smoothly. I also had issues with setting up github repositories and pushing the changes so that certainly didn’t go to plan.

## * Possible improvements for future revisions of the project.  
The project has scope for expansion. There can be multiple entities and calculations such as rent due and rooms availability can be added to help self-manage a property. 

 

## * Screenshots showing your postman requests and the output from the API.  


_Get Request  Records Are Fetched_
![image](https://user-images.githubusercontent.com/89149400/136579949-4a2211aa-d4e0-4f4c-b67b-f54ac267c457.png)

![image](https://user-images.githubusercontent.com/89149400/136580034-f34bcc88-9be8-4043-9940-f8df80061e63.png)

_Put Request Existing Record is Updated_
![image](https://user-images.githubusercontent.com/89149400/136580117-28e73fcb-c80b-438a-a61d-8d598246caee.png)

_Delete Request Existing Record is Deleted_
![image](https://user-images.githubusercontent.com/89149400/136580190-8c865d1e-2479-4cbc-a676-81a0cc618113.png)


## * Screenshots of your database to prove that data is being persisted. 
_Post Request Record is Created in the MySql Database_
![image](https://user-images.githubusercontent.com/89149400/136580283-f5a2617e-f99c-4466-9580-8f27c2b8745d.png)

_Database after Update 

![image](https://user-images.githubusercontent.com/89149400/136580400-bdc1ca50-0f52-4d61-be7a-e2e8a9795bad.png)

_Database after Delete(2)

![image](https://user-images.githubusercontent.com/89149400/136580468-b8ef9186-2536-468a-9861-a6a19966057f.png)

## * Screenshot of your test results, including coverage report.  
_Room Controller Class Unit Test_

![image](https://user-images.githubusercontent.com/89149400/136580566-9d3eadc5-d6af-482b-81cc-eb13dc0e33e7.png)


_Room Service Class Unit Test_

![image](https://user-images.githubusercontent.com/89149400/136580634-a9d7a412-2306-432d-a6f3-739554715012.png)


_Room Controller Class Integration Test_

![image](https://user-images.githubusercontent.com/89149400/136580719-6c06b695-4665-4ff4-8174-c4ed3f04a2a5.png)

_All test executed together_

![image](https://user-images.githubusercontent.com/89149400/136580872-32f5cae0-d214-4925-a710-d42bb6d32269.png)

_Maven Test Report_

![image](https://user-images.githubusercontent.com/89149400/136580976-7f84ecdd-dd0d-4b68-964a-88e2cd8c8327.png)



## *Link to Jira Board - You must add both Pawel and Anoush as collaborators also.  

