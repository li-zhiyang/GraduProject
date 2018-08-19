var system = require('system');
var page = require('webpage').create();

var osName = system.os.name;
if ('windows' === osName.toLowerCase()) {
    phantom.outputEncoding = "gbk";
}

var url = system.args[1];
var curdate = system.args[4];


//打开给定url的页面.
page.open(url, function (status) {
    if (status === 'success') {
        page.evaluate(function (curdate) {
            postImage(curdate);
        }, curdate);
    } else {
        console.log("页面加载失败 Page failed to load!");
    }
    phantom.exit();

});