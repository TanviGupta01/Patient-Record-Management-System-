# Healthcare Patient Record Management System

##  Overview
The **Healthcare Patient Record Management System** is a console-based Java application designed to store and manage basic patient details digitally.  
Small clinics often rely on handwritten notes, which creates issues such as missing records, difficulty searching old data, and slow retrieval.

This project provides an easy and reliable way to:
- Add patient details
- Search patients by name
- View all patient records

It demonstrates:
- Java programming fundamentals
- Object-Oriented Programming
- Modular design
- Data validation
- Menu-driven console interaction

##  Project Objectives
- Digitize patient record storage
- Enable quick record searching
- Provide a simple and user-friendly system
- Demonstrate modular Java programming concepts

## Features
✔ Add patient details (name, age, gender, problem)  
✔ Search patient by name  
✔ View all stored patients  
✔ Input validation  
✔ Console menu interface  
✔ Error handling for invalid choices  


## Functional Modules
This project includes three main modules as required:

1️.Add Patient Record  
- Input and store patient details

2️.Search Patient by Name  
- Search using exact name match

3️.View All Patient Records  
- Display all patient information

(These satisfy the requirement of three functional modules.)  
 [oai_citation:0‡BuildYourOwnProject.pdf](sediment://file_0000000016c07208a054e17f11a6aa10)

---

##  Non-Functional Requirements
This project meets the following non-functional requirements:

- Usability – Simple console menu
- Performance – Instant data retrieval
- Maintainability – Modular class structure
- Reliability – Input validation
- Error Handling – Wrong options handled

(At least four NFRs required.)  
 [oai_citation:1‡BuildYourOwnProject.pdf](sediment://file_0000000016c07208a054e17f11a6aa10)



## Folder Structure
HealthcareConsole/
└─ src/
Main.java
Patient.java
PatientManager.java
Validator.java
Menu.java

## Technologies / Tools Used
- Java
- VS Code
- Java Extension Pack
- ArrayList data structure
- Git & GitHub (for version control)



##  How to Install & Run

###  Prerequisites
- Java installed (JDK 8+)
- VS Code

###  Run using terminal
cd src
javac *.java
java Main

###  Run using VS Code
- Open folder in VS Code
- Click `Run` or `Run Without Debugging`


##  Testing Instructions
Test the following:

 Add patient with valid data  
Add patient with invalid age  
 Search an existing patient  
 Search non-existing patient  
View records when list is empty

## System Architecture 

 User → Menu → PatientManager → Patient List (ArrayList)
 

##  Classes Included
- Main.java
- Patient.java
- PatientManager.java
- Validator.java
- Menu.java
 

## Design Decisions
- Console-based for simplicity
- ArrayList for storage
- Separate classes for maintainability

## Future Enhancements
- Save data to file or database
- Update and delete records
- GUI using Swing/JavaFX
- Unique patient IDs
- Mobile app version


## License
This project is for educational purposes only.


##  References
- Java Documentation
- VS Code Java Extensions


















