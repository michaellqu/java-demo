<%@ page language="java" import="cds.aliyun.demo.*" %>
<html>
<body>
<h1>
<%
    CodePipelineJavaDemo codePipelineJavaDemo = new CodePipelineJavaDemo();
    codePipelineJavaDemo.setName("Java");
    out.println(codePipelineJavaDemo.getMessage());
%>
</h1>
</body>
</html>
