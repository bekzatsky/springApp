<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    <p>ID</p>
    <input title="ID" type="text" name="id" value="${user.id}"/>
    </br>
    <p>NAME</p>
    <input title="NAME" type="text" name="name" value="${user.name}"/>
    </br>
    <p>E-MAIL</p>
    <input title="E-MAIL" type="text" name="email" value="${user.email}"/>
    </br>
    <p>AGE</p>
    <input title="AGE" type="text" name="age" value="${user.age}"/>
    </br>
    <input type="submit" value="SAVE">
</form>
</body>
</html>