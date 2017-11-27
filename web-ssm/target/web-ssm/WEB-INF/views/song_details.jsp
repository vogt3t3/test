<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20 0020
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h1>歌曲详情</h1>
<table border="1">
    <tr>
        <td>歌曲编号</td>
        <td>歌曲名</td>
        <td>播放路径</td>
        <td>歌手编号</td>
    </tr>
    <c:forEach items="${songs }" var="song">
        <tr>
            <td>${song.songid }</td>
            <td>${song.songname }</td>
            <td>${song.urlpath }</td>
            <td>${song.singerid }</td>
            <td><a
                    href="${pageContext.request.contextPath }/song/deletesong.do?songid=${song.songid}"
                    onclick="return confirm('确认删除吗？')">删除</a>
                <a class="detail" href="#" data-toggle="modal" data-target="#myModal" tip="${song.songid }">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
<hr />
<a href="${pageContext.request.contextPath}/router_save1 ">新增歌曲</a>
<hr />

<form action="${pageContext.request.contextPath}/song/findsong.do"
      method="GET">
    模糊查询： <input name="songname" type="text"/> <input
        type="submit" value="查询" />
</form>
<jsp:include page="song.jsp"></jsp:include>
</body>
<script>
    $(".detail").click(function(){
        var songid = $(this).attr("tip");

        $.ajax({
            url:"http://localhost:8080/web-ssm/song/findsongbyid.do?songid"+songid,
            type:"GET",
            cache:false,
            success:function(result){
                var json = JSON.parse(result);
                $("#songid").val(json["songid"]);
                $("#songname").val(json["songname"]);
                $("#urlpath").val(json["urlpath"]);
                $("#singerid").val(json["singerid"]);
            }
        });

    });
</script>
</html>
