<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<table>
    <thead>
    <tr>
        <td>
            <b>Name</b>
            <b>Description</b>
        </td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="dino" items="${dinoList}" varStatus="row">
        <tr>
            <td>${dino.name}</td>
            <td>${dino.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>