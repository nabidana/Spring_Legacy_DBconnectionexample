<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Test</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<br>
<c:forEach var="list" items="${testlist}">
    NAME : ${list.name} and VALUE : ${list.value}
    <br>
</c:forEach>
</body>
</html>