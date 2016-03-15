<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
   <meta name="layout" content="main"/>
   <title>UMD Demo</title>
</head>

<body>

<div style="padding: 5px;" class="body">

   <br>
   <h4>Products' details and prices (from two microservices)</h4>
   <br>

   <table>
      <thead>
      <tr>
         <th>id</th>
         <th>title</th>
         <th>category</th>
         <th>price</th>
         <th>year</th>
         <th>author</th>
      </tr>
      </thead>
      <tbody>
      <g:each in="${products}" status="i" var="p">
         <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
            <td>${p.key}</td>
            <td>${p.value.title}</td>
            <td>${p.value.category}</td>
            <td><g:formatNumber number="${p.value.price}" type="currency" currencyCode="USD"/></td>
            <td>${p.value.year}</td>
            <td>${p.value.author}</td>
         </tr>
      </g:each>
      </tbody>
   </table>

   Search by category...
   <div style="height: 5px"></div>

   <g:form action="search">
      <g:select name="categoryName" from="${categories}"/>
      <g:submitButton name="search"/>
   </g:form>


   <div style="height:30px"></div>
   <h5>Try any of these GET/POST requests:</h5>
   <div style="height:10px"></div>

   <ol>
      <li>curl -i -H "Accept:application/json" localhost:8087</li>
      <li>curl -i -H "Accept:application/json" localhost:8087/prodPrices</li>
      <div style="height:10px"></div>
      <li>curl -i -H "Accept:application/json" localhost:8086/prodDetails</li>
      <li>curl -i -H "Accept:application/json" localhost:8086/prodDetails/category/</li>
      <li>curl -i -H "Accept:application/json" localhost:8086/prodDetails/category/baby</li>
      <li>curl -i -H "Accept:application/json" localhost:8086/prodDetails/category/toys</li>
      <div style="height:10px"></div>
      <li>curl -i -H "Accept:application/json" localhost:8086/prodDetails/pidUnder</li>
      <li>curl -i -H "Accept:application/json" localhost:8086/prodDetails/pidUnder/5550</li>
      <div style="height:10px"></div>
      <li>curl -i -H "Accept:application/json" 'localhost:8086/prodDetails/combo/?maxPid=7000'</li>
      <li>curl -i -H "Accept:application/json" 'localhost:8086/prodDetails/combo/?category=toys'</li>
      <li>curl -i -X GET -H "Accept:application/json" 'localhost:8086/prodDetails/combo/?category=toys&maxPid=7000'</li>
      <div style="height:10px"></div>
      <li>curl -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"pid":7777, "price":567.89}' http://localhost:8087/prodPrices</li>
      <li>curl -X POST -H "Accept: application/json" -H "Content-Type: application/json" -d '{"pid":7777, "category":"baby", "lastUpdate":"2015-02-01T05:00:00Z", "name":"Banbla", "sku":"B2C3D5"}' http://localhost:8086/prodDetails</li>
   </ol>
</div>

</body>
</html>