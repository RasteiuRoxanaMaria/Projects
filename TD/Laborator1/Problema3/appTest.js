function test(){
	console.log(sum(0)==0?"Passed":"Failed");
	console.log(sum(true)=="not a number"?"Passed":"Failed");
	console.log(sum("abc")=="not a number"?"Passed":"Failed");
}
test();