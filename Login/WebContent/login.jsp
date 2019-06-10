<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content=type" content="text/html; charset=UTF-8">
		<link href="css/base.css" rel="stylesheet" type="text/css" />
		<title>ログイン画面</title>
	</head>
	<body>
	<header></header>
		<h2>ログインしてください</h2>
		<form method="Post" action="LoginServlet">


					<div class="textbox">
						<p>ユーザー名<input type="text" name="username"></p>
						<p>パスワード<input type="password" name="password"></p>
					</div>
					<div class="button"><input type="submit" value="ログイン"/></div>

		</form>
		<h3>${loginBean.emsg}</h3>
	</body>
</html>