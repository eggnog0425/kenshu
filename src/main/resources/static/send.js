$(function(){
    $("#button1").click(function() {
        $.ajax({
            url: "/calc",
            dataType: "json",
            data: $("form").serialize(),
            type: "POST"
        }).done(function(data) {
            $("#result").text(data);
        }).fail(function() {
            $("#result").text("エラーが発生しました");
        });
    });
});