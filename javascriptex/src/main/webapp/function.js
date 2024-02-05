function greet()
	{	document.write("Good morning Sathya <br>");
	}

	function add(num1,num2)
	{	let res; 
		res = num1 + num2; 
		document.write("Addition.."+res+"<br>")	
	}

	function billCalc(name,price,quantity)
	{	let totalBill; 
		totalBill = price * quantity; 	
		return totalBill;
	}

	function dummy()
	{	
	}

	//calling the function 
	greet();
	add(10,20);
	let bill = billCalc("sugar",120,5);
	document.writeln("Your Bill..."+bill+"<br>") 

	let res = dummy();
	document.write("dummy return value.."+res);