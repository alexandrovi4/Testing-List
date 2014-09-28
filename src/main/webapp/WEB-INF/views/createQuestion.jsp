<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create question</title>
</head>
<body>
[<a href="questionList.html">Manage List</a>] [<a href="">Perform List</a>]
<br/>
<hr></hr>
	<p>Question: </p>
	<form:form action="TestQuestionForm.html" modelAttribute="questionForm">
	<table>
		<tr>
			<td>Please enter your question:</td>
			<form:input path="question.name" />
		</tr>
		<tr>
			<td><input type="submit"/></td>
		</tr>
	</table>
	</form:form>
</body>
</html>