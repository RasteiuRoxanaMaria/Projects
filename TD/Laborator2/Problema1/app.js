var app=new Vue({
	el: '#app',
	data: {
		message: ''
	},
	methods: {
		process: function(){
			console.log(this.message);
            if(this.message=='123')
            	return this.message='Mesajul este 123';
		}
	}
})

