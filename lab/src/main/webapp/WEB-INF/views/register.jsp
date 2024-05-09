<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
</head>
<body>
<h1>Đăng ký</h1>
<form action="user" method="post">
    <div>
        <label>Tên</label>
        <input type="text" name="username" placeholder="Username">
    </div>
    <div>
        <label>Tuổi</label>
        <input type="text" name="age" placeholder="Age">
        <small style="color: red">
            ${message}
        </small>
    </div>
    <div>
        <label>Địa chỉ</label>
        <input type="text" name="address" placeholder="Address">
    </div>
    <button type="submit"> Register</button>
</form>
</body>
</html>