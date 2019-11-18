<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: laptop
  Date: 16/11/2019
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hiển thị kết quả</title>
</head>
<body>
<h1>Kết quả tìm kiếm: </h1>
<p> <c:out value ="${search}"></c:out></p>
</body>
</html>
