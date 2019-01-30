<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<title>Find Flights</title>
</head>
<body>
<script src="static/js/bootstrap.min.js"></script>
<center>    <h2>Find Flights: </h2></center><br/>
   
   
    <div  class="container">
        <form action = "findFlights" method = "post">
                <div class="col-md">
            <table class="table">
                
                <tbody>
                    <tr>
                        <th scope="row">From:</th>
                        <td><input class="form-control" name="from"  type="text" required></td>
                    </tr>
                    <tr>
                            <th scope="row">To:</th>
                            <td><input class="form-control" name="to"  type="text" required></td>
                    </tr>
                    <tr>
                            <th scope="row">Departure Date:</th>
                            <td><input class="form-control" name="departureDate" type="text" required></td>
                    </tr>
                    <tr>
                            
                            <td><input type = "submit" value = "search"/></td>
                    </tr>

                </tbody>
            </table>
                </div>
            

        </form>
        </div>

</body>
</html>