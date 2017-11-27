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
<h3>新增歌手页面</h3>
<form action="${pageContext.request.contextPath}/singer/addsinger.do" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" name="sname"/>
            </td>
        </tr>
        <tr>
            <td>生日</td>
            <td>
                <input type="text" name="birthday"/>
            </td>
        </tr>
        <tr>
            <td>所属地区</td>
            <td>
                <input type="text" name="region"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="SAVE" />
            </td>
            <td>
                <input type="reset" value="RESET">
            </td>
        </tr>
    </table>
</form>
</body>

</html>