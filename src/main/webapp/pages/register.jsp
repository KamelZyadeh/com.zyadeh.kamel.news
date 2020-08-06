<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link rel="stylesheet" href="../statics/register.css">
</head>
<body>

<div class="register_container">

    <form action="${pageContext.request.contextPath}/users" method="post">

    <div>
        <label for="firstName"></label>
        <input type="text" id="firstName" name="firstName" placeholder="firstName" required/>
    </div>

    <div>
        <label for="lastName"></label>
        <input type="text" id="lastName" name="lastName" placeholder="lastName" required/>
    </div>

    <div>
        <label for="login"></label>
        <input type="text" id="login" name="login" placeholder="login" required/>
    </div>

    <div>
        <label for="password"></label>
        <input type="password" id="password" name="password" placeholder="password" required/>
    </div>

    <div>
        <label for="email"></label>
        <input type="text" id="email" name="email" placeholder="email" required/>
    </div>

    <div>
        <label for="role"></label>
        <input type="text" id="role" name="role" placeholder="role" required/>
    </div>

        <input type="hidden" name="command" value="command_register"/>

    <div>
        <input type="submit" name="register" value="Register">
    </div>
    </form>
</div>

</body>
</html>