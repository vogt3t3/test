<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <title>REGISTRY PAGE</title>
    <meta charset="utf-8" />
</head>

<body>
<h3>注册页面</h3>
<form action="${pageContext.request.contextPath}/user/saveuser.do" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="username" value="user1"/>
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="password" name="password" value="123456"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="REGISTRY" />
            </td>
            <td>
                <input type="reset" value="RESET">
            </td>
        </tr>
    </table>
</form>
</body>

</html>