<%--
  Created by IntelliJ IDEA.
  User: hotwind
  Date: 2022/1/25
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


  <form action="${pageContext.request.contextPath}/upload2" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
  </form>
  <a href="/download">下载存储在upload文件夹中的图片</a>

  </body>
</html>
