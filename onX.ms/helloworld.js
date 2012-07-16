device.screen.on("unlock",function(){
	var notification = device.notifications.createNotification('Hello World!!');
	notification.show();
	console.log("Hello World Shown on phone.");
});