$(document).ready(function(){
    // 在这里写你的代码...
    alert("213");


});

function addUser() {
    $.ajax({
        type: "post",
        url: "/user/add",
        data: "",
        success: function(msg){
            alert( "Data Saved: " + msg );
        }
    });
}

function listUser() {
    $.ajax({
        type: "post",
        url: "/user/list",
        dataType: "json",
        success: function(obj){
            alert( "Data: " + obj.username );
        }
    });
}