var messageBox = device.notifications.createMessageBox('More info');
 messageBox.content = 'More information is available online, would you like to open a browser?';
 messageBox.buttons = [ 'Yes', 'No' ];

 messageBox.on('Yes') = function() {
     device.browser.launch('http://m.bing.com');
 }
 messageBox.show();