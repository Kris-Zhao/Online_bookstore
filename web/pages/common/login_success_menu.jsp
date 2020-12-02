<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/5
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
    <span>欢迎<span class="um_span">${sessionScope.user.username}</span>Welcome to my online bookstore</span>
    <a href="pages/order/order.jsp">My order</a>
    <a href="userServlet?action=logout">Log out</a>&nbsp;&nbsp;
    <a href="index.jsp">Back</a>
</div>