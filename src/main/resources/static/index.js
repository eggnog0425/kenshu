$(function(){
    $("#button1").click(function() {
        $.ajax({
            url: "/calc",
            dataType: "text",
            data: $("form").serialize(),
            type: "POST",
            timeout: 10000
        }).done(function(data) {
            $("#result").text(data);
        }).fail(function(jqXHR, textStatus, errorThrown) {
            $("#result").text("エラーが発生しました");
            console.log(textStatus)
            console.log(errorThrown.message)
            console.log(jqXHR.status)
        });
    });
});

$(function() {
    $(".type").click(function() {
        $("#num2").prop("disabled", false);
    });
    $("#fibonacci").click(function() {
        $("#num2").prop("disabled", true);
    });
});