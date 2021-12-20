<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
        <title>Products</title>
    </head>
    <body>
        <h1>Product form result</h1>
        <p>ID: ${product.id}</p>
        <p>Title: ${product.title}</p>
        <p>Cost: ${product.cost}</p>
    </body>
</html>