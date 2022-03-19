function test (){
	var fibo=getFibonacci(2);
	var ok=true;
	var sir=[1,1];
	for(var i=0;i<2;i++)
	{
		if(sir[i]!==fibo[i])
		{
			ok=false;
		}

	}
	console.log(ok==true? " Passed ":" Failed ");

	var fibo=getFibonacci(5);
	var sir1=[1,1,2,3,5];
	var ok=true;
	for(var i=0;i<5;i++)
	{
		if(sir1[i]!==fibo[i])
		{
			ok=false;
		}

	}
	console.log(ok==true? " Passed ":" Failed ");
	console.log((getFibonacci()=="not allowed")? " Passed ":" Failed ");
}
test ();