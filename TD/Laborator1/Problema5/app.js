var adunareBool = false;
var scadereBool = false;
var inmultireBool = false;
var impartireBool = false;

$("#adunare").on('click',adunareB);
$("#scadere").on('click',scadereB);
$("#inmultire").on('click',inmultireB);
$("#impartire").on('click',impartireB);
$("#egal").on('click',calcul);

function adunare(firstNumber,secondNumber){
	var v=firstNumber+secondNumber;
	return v;
}

function scadere(firstNumber,secondNumber){
	var v=firstNumber-secondNumber;
	return v;
}

function inmultire(firstNumber,secondNumber){
	var v=firstNumber*secondNumber;
	return v;
}

function impartire(firstNumber,secondNumber){
	var v=firstNumber/secondNumber;
	return v;
}

function adunareB(){
	adunareBool=true;
}

function scadereB(){
	scadereBool=true;
}

function inmultireB(){
	inmultireBool=true;
}

function impartireB(){
	impartireBool=true;
}


function calcul(){
	var firstNumberText=$('#firstNumber').val();
	var secondNumberText=$('#secondNumber').val();
	var firstNumber=parseInt(firstNumberText);
	var secondNumber=parseInt(secondNumberText);

	if(adunareBool==true){
		$("#rezultat").html(adunare(firstNumber,secondNumber));
		adunareBool=false;
	}

	if(scadereBool==true){
		$("#rezultat").html(scadere(firstNumber,secondNumber));
		scadereBool=false;	
	}

	if(inmultireBool==true){
		$("#rezultat").html(inmultire(firstNumber,secondNumber));
		inmultireBool=false;	
	}	

	if(impartireBool==true){
		$("#rezultat").html(impartire(firstNumber,secondNumber));
		impartireBool=false;	
	}
}


