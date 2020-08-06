<!DOCTYPE html>
<html lang="en">

<head>
     <meta charset="UTF-8">
    <title> Login </title>
    <link rel="stylesheet" href="../statics/login.css">
</head>
<body>
<div class="login-container">
    <form action="${pageContext.request.contextPath}/users" method="post">
        ${sessionScope.user}
        <div>
            <label for="username"></label>
            <input type="text" id="username" name="username" placeholder="username" required/>
        </div>

        <div>
            <label for="password"></label>
            <input type="password" id="password" name="password" placeholder="password" required/>
        </div>
        <input type="hidden" name="command" value="command_login">

        <div>
            <input type="submit" name="login" value="Login">
        </div>
        
    </form>
</div>
</body>
</html>
