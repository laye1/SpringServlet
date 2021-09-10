
<%@include file="../common/header.jsp.jspf"%>  

<%@include file="../common/navbar.jsp.jspf"%>


<center><h1><p>LIST OF CARS </p></h1><center>



<div class="container">
  
<table class="table">
  <thead>
  
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Mark</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
<c:forEach items="${cars }" var="car">
    <tr>
      <th scope="row">${car.name }</th>
      <td>${car.mark }</td>
      <td>${car.description}</td>
      <td>${car.price }</td>
      <td><a href="/delete.do?carName=${car.name}&amp;carMark=${car.mark}&amp;carDescription=${car.description}&amp;carPrice=${car.price}"><button type="submit" class="btn btn-primary">delete</button></a></td>
    </tr>
 
    </c:forEach>
    
    
  </tbody>
</table>
</div>
<a href="/create.do"><button type="submit" class="btn btn-primary">AJOUTER</button></a>

<%@include file="../common/footer.jsp.jspf"%>

