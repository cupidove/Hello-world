<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search SN !</title>
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/jqpagination.css">
    <script type="text/javascript" src="./js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="./js/jquery.jqpagination.js"></script>
    <script type="text/javascript" src="./js/scripts.js"></script>
  </head>
  <body>
	<s:form action="sn">
		<s:textfield name="boHtBmsIsnpos.whsid" label="仓库ID" />
		<s:textfield name="boHtBmsIsnpos.locid" label="货位" />
		<s:textfield name="boHtBmsIsnpos.boHtBmsIinvatt.sku" label="机型" />
		<s:submit value="提交" />
	</s:form>
	<!-- 
	<table style="margin-left: 15px">
		<s:iterator value="isnposList">
			<tr>
				<td><s:property value="whsid" /></td>
				<td><s:property value="locid" /></td>
				<td><s:property value="sn" /></td>
			</tr>
		</s:iterator>
	</table>
	 -->
	 <a href="<s:url action='sn'/>">aaaaaaaa</a>
	 <a>${pager.totalRecord}</a>
	<pg:pager maxPageItems="30" items="114" maxIndexPages="20"
		export="currentPageNumber=pageNumber" index="half-full">
		<pg:param name="pg" />
		<pg:param name="q" />
		<table width="778" botder="0" cellPadding="0" cellSpacing="1"
			bgcolor="#6386d6">
			<tr bgcolor="#EFF3F7">
				<td align="center">仓库ID</td>
				<td align="center">货位</td>
				<td align="center">条码</td>
			</tr>
			
			
			<s:if test="isnposList != null">
				<s:iterator value="isnposList">
					<pg:item>
						<tr bgcolor="#EFF3F7">
							<td align="center"><s:property value="whsid" /></td>
							<td align="center"><s:property value="locid" /></td>
							<td align="center"><s:property value="sn" /></td>
						</tr>
					</pg:item>
				</s:iterator>
			</s:if>
		</table>

		<pg:index>
			<font face=Helvetica size=-1>Result Pages: <pg:prev>&nbsp;<a
						href="<%=pageUrl%>">[&lt;&lt; Prev]</a>
				</pg:prev> <pg:pages>
					<%
						if (pageNumber.intValue() < 10) {
					%>&nbsp;<%
						}
									if (pageNumber == currentPageNumber) {
					%><b><%=pageNumber%></b>
					<%
						} else {
					%><a href="<%=pageUrl%>"><%=pageNumber%></a>
					<%
						}
					%>
				</pg:pages> <pg:next>&nbsp;<a href="<%=pageUrl%>">[Next
						&gt;&gt;]</a>
				</pg:next> <br></font>
		</pg:index>
	</pg:pager>
</body>
</html>