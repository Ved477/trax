<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill | Info</title>
</head>
<body>
	<h2>Billing Info...</h2>
	
	<table class="body-wrap">
    <tbody><tr>
        <td></td>
        <td class="container" width="600">
            <div class="content">
                <table class="main" width="100%" cellpadding="0" cellspacing="0" border="1">
                    <tbody><tr>
                        <td class="content-wrap aligncenter">
                            <table align="center" width="100%" cellpadding="0" cellspacing="0">
                                <tbody>
                                <tr>
                                    <td class="content-block">
                                        <h2>Thanks for using our app</h2>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                        <table class="invoice">
                                            <tbody>
                                            <tr>
                                                <td>${billing.firstName} ${billing.lastName}<br>${billing.email}<br>${billing.mobile}</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <table class="center" width="100%" border='1' class="invoice-items" cellpadding="0" cellspacing="0">
                                                        <tbody>
                                                        
                                                        <tr>
                                                            <th>Items</th>
                                                            <th>Amount</th>
                                                        </tr>
                                                        
                                                        <tr>
                                                            <td>${billing.product}</td>
                                                            <td class="alignright">${billing.amount}</td>
                                                        </tr>
                                                        
                                                        
                                                        <tr class="total">
                                                            <td class="alignright" width="80%">Total</td>
                                                            <td class="alignright">${billing.amount}</td>
                                                        </tr>
                                                    </tbody></table>
                                                </td>
                                            </tr>
                                        </tbody></table>
                                    </td>
                                </tr>
                                
                                
                            </tbody></table>
                        </td>
                    </tr>
                </tbody></table>
               </div>
        </td>
        <td></td>
    </tr>
</tbody></table>
	
</body>
</html>