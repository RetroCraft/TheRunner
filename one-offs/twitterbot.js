var CronJob = require('cron').CronJob;
var TwitterBot = require('node-twitterbot').TwitterBot;
var Bot = new TwitterBot();

for (var i = 5; i > 0; i--) {
  new CronJob('5' + i + ' 11,14,21 * 7 *', function() {
    Bot.tweet(i + ' minutes!!! #TheRunner #TheRunnerSweepstakes');
  }, null, true, 'America/New_York');
}
