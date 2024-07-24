<%-- 
    Document   : index
    Created on : 21 Jun 2024, 19:45:35
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Parent Login Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!--<script src="js/bootstrap.min.js"></script>-->
    </head>
    <body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card mt-5">
                    <div class="card-header text-center">
                        <h2>Parent Login</h2>
                    </div>
                    <div class="card-body">
                        <form action="login" method="post">
                            <div class="form-group">
                                <label for="parentId">Parent ID</label>
                                <input type="text" class="form-control" id="parentId" name="parentId" placeholder="Enter your Parent ID" required>
                            </div>
                            <div class="form-group">
                                <label for="parentEmail">Parent Email</label>
                                <input type="email" class="form-control" id="parentEmail" name="parentEmail" placeholder="Enter your email" required>
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">Login</button>
                        </form>
                    </div>
                    <div class="card-footer text-center">
                        <small class="text-muted">All fields are required</small>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
