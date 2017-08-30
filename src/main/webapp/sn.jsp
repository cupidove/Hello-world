<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
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
	<table style="margin-left: 15px">
		<s:iterator value="isnposList">
			<tr>
				<td><s:property value="whsid" /></td>
				<td><s:property value="locid" /></td>
				<td><s:property value="sn" /></td>
			</tr>
		</s:iterator>
	</table>
	<pg:pager url="http://www.altavista.com/cgi-bin/query"
		maxIndexPages="20" export="currentPageNumber=pageNumber">
		<pg:param name="pg" />
		<pg:param name="q" />

		<ex:searchresults>
			<pg:item>
				<%=searchResult%>
			</pg:item>
		</ex:searchresults>

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