function getFibonacci(n) {
	if (typeof n!=="number")
		return "not allowed";
	if (n<1 || n>10)
		return "not allowed";
	var fibo=[1,1]
	for(var i=2;i<=n;i++){
		fibo[i]=fibo[i-1]+fibo[i-2];
	}
	return fibo;
}