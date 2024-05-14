<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Sửa thông tin</title>
</head>
<body>

<form action="/students/update" method="post">
    ID: <input type="text" name="id" value="${student.id}" />
    <br/>
    Tên: <input type="text" name="name" value="${student.name}"/>
    <br/>
    Tuổi: <input type="text" name="age" value="${student.age}"/>
    <br/>
    Địa chỉ: <input type="text" name="address"value="${student.address}" />
    <br/>
    Giới tính:
    <input type="radio" name="gender"  ${student.gender? "checked" : ""} value="true"/>Nam
    <input type="radio" name="gender" ${!student.gender? "checked" : ""} value="false"/>Nữ
    <br/>
    <button>Update</button>
</form>

</body>
</html>
