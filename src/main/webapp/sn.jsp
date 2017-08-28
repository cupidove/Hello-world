<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search SN !</title>
  </head>
  <body>
	<s:form action="sn">
		<s:textfield name="boHtBmsIsnpos.whsid" label="仓库ID" />
		<s:textfield name="boHtBmsIsnpos.locid" label="货位" />
		<s:textfield name="boHtBmsIsnpos.boHtBmsIinvatt.sku" label="机型" />
		<s:submit value="提交" />
	</s:form>
	<table style="margin-left: 15px">
		<s:iterator value="isnposList">
			<tr>
				<td><s:property value="whsid" /></td>
				<td><s:property value="locid" /></td>
				<td><s:property value="sn" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>