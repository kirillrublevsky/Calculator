/* jQuery and AJAX */

$(document).ready(function () {

    $("#calculate").click(function (e) {
        e.preventDefault();

        var first = parseFloat($("#first").val());
        var second = parseFloat($("#second").val());
        var operation = $("#operation").find("option:selected").text();

        $.ajax({
            type: "POST",
            url: "/calculate",
            data: {"first": first, "operation": operation, "second": second},
            success: function (data) {
                $("#result").text(data);
            }
        });
    });
});
