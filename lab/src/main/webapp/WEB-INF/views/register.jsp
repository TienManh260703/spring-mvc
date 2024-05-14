<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
</head>
<body>
<h1>Đăng ký</h1>
<form action="user" method="post">
    <div>
        <label>Username</label>
        <input type="text" name="username" placeholder="Username">
    </div>
    <div>
        <label>Age</label>
        <input type="text" name="age" placeholder="Age">
        <small style="color: red">
            ${message}
        </small>
    </div>
    <div>
        <label>Address</label>
        <input type="text" name="address" placeholder="Address">
    </div>
    <div> <input type="checkbox"> </div>
    <button type="submit"> Register</button>
</form>
<hr>
<h1>Đăng ký</h1>
<div>${message}</div>
<form action="/user/login" method="POST">
    <div>Username: </div>
    <input type="text" name="username">
    <div>Password: </div>
    <input type="text" name="password">
    <br>
    <div><input type="checkbox" name="remember">Remember me?</div>
    <button>Login</button>
</form>
</body>
</html>