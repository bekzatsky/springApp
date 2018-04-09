<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users</title>
</head>
<body>
<h1>List of users</h1>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>E-MAIL</th>
        <th>AGE</th>
    </tr>
<#list users as user>
    <tr>
        <td><a href="/user/${user.id}">${user.id}</a></td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.age}</td>
        <td><a href="/delete/${user.id}">Delete</a></td>
        <td><a href="/update/${user.id}">Update</a></td>
    </tr>
</#list>
</table>
<a href="/addUser">CREATE USER</a>
</body>
</html>