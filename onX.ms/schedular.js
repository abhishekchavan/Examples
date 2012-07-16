console.log('Starting rule: geo-reminder');

var hours = 11;
var minutes = 25;

// define the start time of the scheduled task
var now = new Date();
var timerStart = new Date(now.getFullYear(), now.getMonth(), now.getDate(), hours, minutes, 0, 0);

// create notification
var lunchTimeReminder = function() {
   var reminder = device.notifications.createNotification('It\'s lunch time');
   reminder.show();
};

// subscribe the scheduled task to a daily timer
device.scheduler.setTimer({
    name: 'dailyHoroscopeTimer',
    time: timerStart.getTime(),
    interval: 'day',
    repeat: true,
    exact: true
},
lunchTimeReminder);

console.log('Completed rule: geo-reminder');