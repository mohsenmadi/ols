<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
   <meta name="layout" content="main"/>
   <title>search category</title>
</head>

<body>
<div style="padding: 5px;" class="body">

   <br>
   <h4>Products with category: ${categoryName}</h4>

   <table>
      <thead>
      <tr>
         <th>id</th>
         <th>title</th>
         <th>author</th>
      </tr>
      </thead>
      <tbody>
      <g:each in="${catEntries}" status="i" var="cat">
         <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
            <td>${cat.pid}</td>
            <td>${cat.title}</td>
            <td>${cat.author}</td>
         </tr>
      </g:each>
      </tbody>
   </table>
</div>
</body>
</html>