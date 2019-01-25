# FlightReservation
This app is for the reservation for the flight to user.User can register and after login to application he will be able to make a reservation for particular flight.

#Intial steps to run the application.
Go to the application.properties file in src/main/resources and do the following changes.
- change the spring.jpa.hibernate.ddl-auto property to create instead of none.(When you run the application for the first time after successfully running that application change it back to none.)
- Give credentials for your Mysql database.
- Run the flightreservaion.sql file(found in the root of the project) in your database;
- insert data for flights table using flights.sql script(which will be found in root of the project)
- Click on the root of the project and select run as springboot application.(You will see that server started at <Link with port number of your tomcat and context path for the application>.
- Go to your browser and goto that path that is given in the console.
