<!-- 24 -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Product List </h3>
    <c:if  test="${!empty productList}">
    <table class="data">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Date Added</th>
    </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.name} </td>
            <td>${product.price}</td>
            <td>${product.date_added}</td>
        </tr>
    </c:forEach>
    </table>
    </c:if>

</body>
</html>