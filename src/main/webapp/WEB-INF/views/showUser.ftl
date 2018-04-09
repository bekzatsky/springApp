<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User info</title>
</head>
<body>
<h1>User Info</h1>
<table>
    <tr>
        <td>ID</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>NAME</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>E-MAIL</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>AGE</td>
        <td>${user.age}</td>
    </tr>
</table>
<a href="/users">Show all users</a>
</body>
</html>