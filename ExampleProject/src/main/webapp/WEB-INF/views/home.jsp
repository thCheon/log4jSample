<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<table>
			<Tr>
				<th>idx</th>
				<th>ID</th>
				<th>pw</th>
				<th>Name</th>
			</tr>
			<c:forEach var="emt" items="${list}">
				<tr>
					<td>${emt.idx}</td>
					<td>${emt.id }</td>
					<Td>${emt.pw }</Td>
					<td>${emt.name }</td>	
			</c:forEach>
		</table>
		<button type="button" onclick="location.href='/sample/openSample.do'">aaaaa</button>
	</body>
	<script>
		var a = '${list}';
	</script>
</html>
