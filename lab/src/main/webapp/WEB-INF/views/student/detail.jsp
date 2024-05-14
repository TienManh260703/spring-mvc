<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chi tiết sinh viên</title>
</head>
<body>
    ID:${student.id}
    <br/>
    Ten:${student.name}
    <br/>
    Tuoi:${student.age}
    <br/>
    Dia chi:${student.address}
    <br/>
    Gioi tinh:${student.gender? "Nam" : "Nữ"}
</body>
</html>
