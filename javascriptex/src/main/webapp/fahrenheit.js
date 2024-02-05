function convertToFahrenheit()
{
	//read the fahrenheitinput store in variable
	const fahrenheitInput=document.getElementById('fahrenheitInput').value;
	
	//convert the fahreheitinput to celsius
	const celsiusTemperature=parseFloat(fahrenheitInput-32)*5/9;
	
	//set output to celsiusoutput field
	document.getElementById('celsiusoutput').value=celsiusTemperature.toFixed(2);
}