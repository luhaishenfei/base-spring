<%--
  Created by IntelliJ IDEA.
  User: hotwind
  Date: 2022/1/24
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>

</head>
<body>

<p>
    用户名:<input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    密码:<input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>



<script>
    <%--function a1(){--%>
    <%--    $.post( "${pageContext.request.contextPath}/a3", function (data){--%>
    <%--        document.getElementById("name").textContent=data;--%>
    <%--    })--%>
    <%--}--%>

    function a1() {
        $.post({
            url:"${pageContext.request.contextPath}/a3",
            data:{"name":$("#name").val()},
            success:function (data){
                if (data.toString()==='ok'){
                    $("#userInfo").css("color","green");
                }else {
                    $("#userInfo").css("color","red");

                }
                // document.getElementById("userInfo").textContent=data;
                $("#userInfo").html(data);
            }
        })
    }
    function a2(){
        $.post({
            url:"${pageContext.request.contextPath}/a3",
            data:{"pwd":$("#pwd").val()},
            success:function (data){
                if (data.toString()==='ok'){
                    $("#pwdInfo").css("color","green");
                }else {
                    $("#pwdInfo").css("color","red");

                }
                // document.getElementById("userInfo").textContent=data;
                $("#pwdInfo").html(data);
            }
        })

    }
</script>
</body>
</html>
