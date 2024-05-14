<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<table border="1">
    <form action="/student/detail">
        MSSV: <input name="id"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/students/show-create">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>

    </thead>
    <tbody>
    <c:forEach items="${students}" var="student" varStatus="i">
        <tr>
            <td>${i.index + 1}</td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td>${student.gender ? "Nam" :  "Nu"}</td>
            <td>
                <a href="students/update/${student.id}"> Sửa </a>
                <a href="students/delete?id=${student.id}"> Xóa </a>
                <a href="students/detail?id=${student.id}"> Chi tiết </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
