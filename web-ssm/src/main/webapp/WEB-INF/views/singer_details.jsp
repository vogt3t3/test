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
<h1>歌手详情</h1>
<a href="${pageContext.request.contextPath }/router_report">报表查看</a></h3>
<table border="1">
    <tr>
        <td>歌手编号</td>
        <td>歌手名</td>
        <td>生日</td>
        <td>地区</td>
    </tr>
    <c:forEach items="${singers }" var="singer">
        <tr>
            <td>${singer.singerid }</td>
            <td>${singer.sname }</td>
            <td>${singer.birthday }</td>
            <td>${singer.region }</td>
            <td><a
                    href="${pageContext.request.contextPath }/singer/deletesinger.do?singerid=${singer.singerid}"
                    onclick="return confirm('确认删除吗？')">删除</a>
                <a class="detail" href="#" data-toggle="modal" data-target="#myModal" tip="${singer.singerid }">修改</a>
                <a href="${pageContext.request.contextPath }/singer/findsongs.do?singerid=${singer.singerid}">查看所属歌曲</a>
            </td>
        </tr>
    </c:forEach>
</table>
<hr />
<a href="${pageContext.request.contextPath}/router_save ">新增歌手</a>
<hr />

<form action="${pageContext.request.contextPath}/singer/findsinger.do"
      method="GET">
   所属地区： <input name="region" type="text"/> <input
        type="submit" value="查询" />
</form>
<jsp:include page="singer.jsp"></jsp:include>

</body>
<script>
    $(".detail").click(function(){
        var singerid = $(this).attr("tip");
        $.ajax({
            url:"http://localhost:8080/web-ssm/singer/findsingerbyid.do?singerid="+singerid,
            type:"GET",
            cache:false,
            success:function(result){
                var json = JSON.parse(result);
                $("#singerid").val(json["singerid"]);
                $("#sname").val(json["sname"]);
                $("#birthday").val(json["birthday"]);
                $("#region").val(json["region"]);
            }
        });
    });
</script>
</html>
