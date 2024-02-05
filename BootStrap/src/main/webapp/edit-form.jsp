<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add product</title>
<!--BootStrap CDN link to get the support of BootStrap-->
<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
<!-- this is java Script validation code location-->
<script src="validate.js"></script>
</head>
<body>
	<div class="container mt-5 text-center">
		<h2 class="text-center font-italic mb-1"> Save Product Data</h2>
		<form method="post" action="UpdateProductServlet" enctype="multipart/form-data"
		onsubmit="return validateForm()">
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="proId">Product Id</label>
			<input type="text" class="form-control-sn"   name="proId" value="${editproduct.proId}" required>
		</div>
		
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="proName">Product Name</label>
			<input type="text" class="form-control-sn"   name="proName"  value="${editproduct.proName}" required>
		</div>
		
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="proPrice">Product Price</label>
			<input type="text" class="form-control-sn"   name="proPrice"  value="${editproduct.proPrice}" required>
		</div>
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="proBrand">Product Brand</label>
			<input type="text" class="form-control-sn"   name="proBrand" value="${editproduct.proBrand}"  required>
		</div>
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="madeIn">Madein</label>
			<input type="text" class="form-control-sn" name="madeIn"  value="${editproduct.madeIn}" required>
		</div>
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="proMfgDate">Productmfg date</label>
			<input type="date" class="form-control-sn"   name="proMfgDate"   value="${editproduct.proMfgDate}" required>
		</div>
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="proExpDate">Productexp date</label>
			<input type="date" class="form-control-sn"  name="proExpDate"  value="${editproduct.proExpDate}" required>
		</div>
		
		<div class="form-group">
			<label class="font-italic font weight-bold" for="image">image</label>
			<input type="file" class="form-control-sn"   name="image" accept="image/"  value="${editproduct.image}"  >
		</div>
		
		<div>
			<input type="submit" class="btn btn-success" value="updateproduct"/>
			<a href="productList.jsp" class="btn btn-primary">List of products</a>

		</div>
		
		
		
		</form>
		
		
	</div>

</body>
</html>