var uid = 1;
var websocket = new WebSocket("ws://127.0.0.1:8080/ws?uid=" + uid);
websocket.onopen = function (event) {
    console.log("WebSocket:已连接");
    console.log(event);
};
websocket.onmessage = function (event) {
    console.log("WebSocket:收到一条消息", event.data);
    $("#content").append("<div class='fmsg'><label class='name'>webSocket&nbsp;" + new Date().Format("yyyy-MM-dd hh:mm:ss") + "</label><div class='fmsg_text'>" + event.data + "</div></div>");
    scrollToBottom();
};
websocket.onerror = function (event) {
    console.log("WebSocket:发生错误 ");
    console.log(event);
};
websocket.onclose = function (event) {
    console.log("WebSocket:已关闭");
    console.log(event);
}

function sendMsg() {
    var v = $("#msg").val();
    var data = {};
    data["text"] = v;
    var s = JSON.stringify(data);
    websocket.send(s);
    $("#content").append("<div class='tmsg'><label class='name'>我&nbsp;" + new Date().Format("yyyy-MM-dd hh:mm:ss") + "</label><div class='tmsg_text'>" + data.text + "</div></div>");
    $.get("/test", function (data, status) {
        console.log(data);
        console.log(status);
    });
    scrollToBottom();
    $("#msg").val("");
}

function scrollToBottom() {
    var div = document.getElementById('content');
    div.scrollTop = div.scrollHeight;
}

Date.prototype.Format = function (fmt) { //author: meizz
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

function clearAll() {
    $("#content").empty();
}