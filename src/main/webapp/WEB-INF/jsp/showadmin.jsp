
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="container">
<link href="css.css" rel="stylesheet" type="text/css">
<jsp:include page="admin-header.jsp"></jsp:include>

<div id="content-container">
<div id="content"><center>
<marquee><h2 style="color: red;"><i>--- Welcome ${username} ---</i></h2></marquee><br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<table cellpadding="10" border="1">
		<tr>
			<td>Name</td>
			<td>Email</td>
		    <td>Account No.</td>
		    <td>Balance</td>
		    <td>Address</td>
		    <td>Contact No</td>
		</tr>
<c:forEach items="${alladmin}" var="alladmin">
	<tr>
		<td>${alladmin.name}</td>
		<td>${alladmin.email}</td>
	    <td>${alladmin.accno}</td>
	    <td>${alladmin.balance}</td>
	    <td>${alladmin.address}</td>
	    <td>${alladmin.mobno}</td>
     </tr>
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
</div>
