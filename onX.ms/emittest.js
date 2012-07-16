// create a region around my parents' house
var region = device.regions.createRegion({
    name : "my parents'",
latitude : 28.510676, 
longitude : 77.048708,
        radius: 1000
  });

// subscribe the callback to the trigger
region.on('enter', function(){
    var reminder = "don't forget your jacket this time";

    // show a notification with reminder
    device.notifications.createNotification(reminder).show();
}
);

// start monitoring the region
device.regions.startMonitoring(region);

var locationSignal =    { latitude: 28.510676, longitude : 77.048708 };
region.emit('enter', locationSignal);