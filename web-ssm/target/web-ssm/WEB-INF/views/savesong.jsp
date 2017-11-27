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
<h3>新增歌曲页面</h3>
<form action="${pageContext.request.contextPath}/song/addsong.do" method="post">
    <table>
        <tr>
            <td>名称</td>
            <td>
                <input type="text" name="songname"/>
            </td>
        </tr>
        <tr>
            <td>播放路径</td>
            <td>
                <input type="text" name="urlpath"/>
            </td>
        </tr>
        <tr>
            <td>歌手id</td>
            <td>
                <input type="text" name="singerid"/>
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