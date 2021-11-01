Coverage: 68.1%
# IMS - Inventory Management System

This project is called IMS and is an inventory management system that allows the user to use the system to create customers, items, and orders. The user can also update and
delete those customers, items, and orders. This system was built using the languages Java and SQL. The program uses the terminal of the user's computer as a visual text
interface for the user.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them
Intended for Windows users. Any other Operating Systems find their respective ways to download and install the software in the prerequisites

* Git - https://git-scm.com/downloads
* Maven - https://maven.apache.org/download.cgi
* Java JDK - https://www.oracle.com/java/technologies/downloads/#jdk17-windows
* MySQL - https://dev.mysql.com/downloads/windows/installer/8.0.html
* Java IDE (Eclipse)


### Installing

A step by step series of examples that tell you how to get a development environment running

1. Install all prerequisite software listed above
2. Open Git CMD 
3. Find the folder you want to clone the repository to
4. Use Git to clone the repository `git clone https://github.com/RyuujiAkira/IMS-Starter.git`
5. Open the project in your Java IDE (Eclipse in this case)
6. Open MySQL and create an 'ims' database
7. Connect to the database
8. Using MySQL use the SQL files located in the repository to populate the database
9. Run the program in the IDE


In the console the user can enter one of the three entities on the system `CUSTOMER`, `ITEM`, `ORDER`

Here the user can `CREATE`, `UPDATE`, `READ`, `DELETE` for all three entities. These actions allow the user to create, update, read and delete the respective customers, items and orders. Futhermore if `ORDER` is selected they have additional options which are `ADDITEM`, `DELETEITEM`, `CALCULATEORDER`. These actions allow the user to add an item to an order, delete an item from an order and also caluclate the total value of the order. 

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do
To run the automated tests for the program all the user has to do is use the Eclipse IDE and run the project folder as a JUnit Test. This will run all test scenarios with test files and will give the coverage, any failures and errors with context on the screen. 

### Unit Tests 

Unit tests are tests on smaller pieces of code and normally tests a single method to see if the method returns the expected result. These sorts of tests are important since testing indivdual parts instead of the whole system allows to refine the scope of if there are problems with methods or classes. These can be pinpointed and debugged to solve issues further down the line.

```
To run a unit test the user can click on a class they want to test and run it as a JUnit Test by itself on the Eclipse IDE.
```

### Integration Tests 
Explain what these tests test, why and how to run them

Integration tests are the tests that come after unit testing since this makes sure all components of the system integrate together with no issues. Due to all the unit testing making sure all individual parts are working as intended the possibility that they might not work together might be likely which is why these tests exist. There are three main ways to do integration testing and the method I have used is the Big Bang integration which you combine all the files together for testing and hope it works although the flaw is that errors might not be shown in detail. 

```
To run a integration test the user can run the whole project as a JUnit Test on the Eclipse IDE.
```

### And coding style tests

Coding style tests are tests to check if the code is written to a readable level since everyone codes differently to one another. Some styles should be adopted so that the code can be read and understood for future development or maintaining the code. The styles I used throughout the code were PascalCase, camelCase and appropriate spacing making sure all code looks consistent and consise. Comments were also added throughout the code to help anyone who is new to the system what each method does if not clear by the method name. 

```
To run coding style tests I manually reviewed the code looking for inconsistencies and fixing them if I do find them to be consistent and concise throughout the code.
```

## Deployment

1. To deploy the program on a live system you must have Jave JDK installed on your machine. 
2. Open command prompt on your system
3. Clone the repository with the command `git clone https://github.com/RyuujiAkira/IMS-Starter.git`
4. Locate the folder in command prompt
5. Run the command ``` java -jar ims-0.0.1-jar-waith-dependencies.jar ```
6. The program should start running 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](https://www.java.com/en/) - Programming Language
* [MySQL](https://www.mysql.com/) - Database Service

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Version Control

We use [Git](https://git-scm.com/) and [GitHub](https://github.com/) for version control.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* * **Jonathan Rabaja** - *Completion of project* - [jonathanrabaja](https://github.com/ryuujiakira)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

## Acknowledgments

* learnsql.com
* RBarryYoung - https://stackoverflow.com/users/109122/rbarryyoung
* TBohnen.jnr - https://stackoverflow.com/users/505594/tbohnen-jnr

