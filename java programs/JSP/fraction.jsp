<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Title</title>
    </head>
    <body>
        <!-- JSP stands for java server pages
        java inside html
        jsp used for creating view dynamic web pages
        jsp is tag based language
        * directive-page include taglib-used for giving information before exeting jsp page
        * scripting elements initialization expresses scriplets
        * actions -jsp:forward jsp:include jsp:param jsp:useBean jsp:setAttribut
        jsp:getAttribute -- used for giving information after executing jsp pages
        -->

        <!--this is initialization-->
        <%! int a=10, b=20, c=0; %>

        <% c=a+b; %>
        <h2><%= "Addition of a and b is :" +c %></h2>
    </body>
</html>