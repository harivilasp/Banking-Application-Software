
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="container">
<link href="css.css" rel="stylesheet" type="text/css">
<jsp:include page="home-header.jsp"></jsp:include>

<div id="content-container">
<div id="content"><center>
<marquee><h2 style="color: red;"><i>--- Welcome ${username} ---</i></h2></marquee><br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<table cellpadding="10" border="1">
<c:forEach items="${user}" var="user">
	<tr><td><b>Name</b></td><td>${user.name}</td></tr>
	<tr><td><b>Email</b></td><td>${user.email}</td></tr>
    <tr><td><b>Account No.</b></td><td>${user.accno}</td></tr>
     <tr><td><b>Balance</b></td><td>${user.balance}</td></tr>
     <tr><td><b>Address</b></td><td>${user.address}</td></tr>
     <tr><td><b>Contact No</b></td><td>${user.mobno}</td></tr>
</c:forEach>
</table>

</div>

<div id="aside">
<p>* Online banking is the practice of making bank transactions or paying bills via the Internet.
<br/><br/>* Banking online allows a customer to make deposits, withdrawals, transfers with the click of a mouse.
<br/><br/>* Online banking also eliminates paper waste, which is a plus not only for those who have to handle all the paper work, but also for the environment.
<br/><br/>* Security is always an issue with Internet transactions. Although information is encrypted , and the chances of an account being hacked are slim, it happen.
</p>
</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</div>
