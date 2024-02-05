function ValidateForm()
{
	var proId=document.getElementById("proId").value;
	var proName=document.getElementById("proName").value;
	var proPrice=document.getElementById("proPrice").value;
	var proBrand=document.getElementById("proBrand").value;
	var madeIn=document.getElementById("madeIn").value;
	
	if(proId.trim()=="" || proName.trim()=="" || proPrice.trim()=="" ||proBrand.trim()=="" || madeIn.trim()==""){
		alert("All fields must be filled out");
		return false;
	}
	
	if (pareseFloat(proPrice)<0)
	{
		alert("proPrice must be a non-negative value");
		return false;
	}
	
	if (proName.length>50 || proBrand.length>50){
		alert("product name and proBrand must be less than 50 characters");
		return false;
	}
	
	//get the mfg &exp dates
	var proMfgDate=document.getElementById("proMfgDate").value;
	var proExpDate=document.getElementById("proExpDate").value;
	
	//convert into date formate
	var manufacturibgDateObj =new Date(proMfgDate);
	var expiryDateObj = new Date(proExpDate);
	
	//check the validation of dates
	if(manufacturibgDateObj>expiryDateObj){
		alert("manufacturing date cannot be greater than expiry date");
		return fasle;
	}
	return true;
	
}


