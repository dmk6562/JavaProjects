# Discounts Calculator
The DiscountsCalculator is an insurance web service that allows users input, so they can find out what discounts they are eligible for when shopping for insurance.

# To run the DiscountsCalculator application:

1. Pull the project from GitHub.

2. Import the project to your Spring Tools Suite IDE. The project is built on Java 8 and runs as a Spring Boot Application.
 
3. Use Maven to clean, install, download dependencies and build the application. 

4. Right click on the project and select "Run As > Spring Boot Application".

5. The application will start and the Spring Boot DashBoard will show that the application is running. In case of any startup error, check the logs and fix as needed. 

6. Use a browser to make calls to the getDiscounts service. A sample url has been provided below and more samples are located in the testurlsscreenshots folder.

7. Sample url:
	http://localhost:8080/getDiscounts?firstName=John&lastName=Elway&age=66&isHomeOwner=true&accidents=0&carsInsured=2&isVeteran=true&commuteMiles=25&isGoodStudent=true 
	
8. The results will be displayed on the browser in JSON format. 

9. A UI will be added to the application in the future to allow the user to enter the data in the UI.

10. This web service can be implemented in any application, and can be called from a client class or method.

