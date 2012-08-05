var http = require('http');

http.get("http://www.google.co.in/index.html", function(res){
	res.on("data",function(chunk){
		console.log("body : "+ chunk);
	})
});