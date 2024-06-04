**API Testing Project**
This project demonstrates how to perform API testing using RestAssured and TestNG.

**Prerequisites**
Java Development Kit (JDK) installed (version 8 or higher)
Maven installed and configured
An IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code

**Project Structure**
src
 └── main
     └── java
         └── Config.java
 └── test
     └── java
         ├── BaseTest.java
         ├── ApiUtilIconDetails.java
         ├── ApiUtilListCategories.java
         ├── IconFinderTest.java
         └── ListCategoriesTest.java
pom.xml
README.md



**Steps to Execute**

**Clone the repository:**

git clone https://github.com/faizannmaqsood/BackOfficeAutomation  
Open the project in your IDE:

Import the project as a Maven project in your IDE.

**Run the tests:**

You can run the tests using your IDE's TestNG test runner.
Alternatively, you can run the tests from the command line using Maven:

mvn test
Dependencies
Add the following dependencies to your pom.xml file:


<dependencies>
    <!-- RestAssured dependency -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>4.3.3</version>
        <scope>test</scope>
    </dependency>

    <!-- TestNG dependency -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
