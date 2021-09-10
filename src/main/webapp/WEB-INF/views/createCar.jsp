
<%@include file="../common/header.jsp.jspf"%>  

<%@include file="../common/navbar.jsp.jspf"%>


<center><h1>ADD NEWS CARS</h1></center>

<div class="container">
<form action="/create.do" method="post">
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">NAME</label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control form-control-lg" id="colFormLabelLg" placeholder="name">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">MARK</label>
    <div class="col-sm-10">
      <input type="text" name="mark" class="form-control form-control-lg" id="colFormLabelLg" placeholder="mark">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">DESCRIPTION</label>
    <div class="col-sm-10">
      <input type="text" name="description" class="form-control form-control-lg" id="colFormLabelLg" placeholder="description">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">PRIX</label>
    <div class="col-sm-10">
      <input type="text" name="price" class="form-control form-control-lg" id="colFormLabelLg" placeholder="price">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">VALIDER</button>
</form>
</div>

<%@include file="../common/footer.jsp.jspf"%>

