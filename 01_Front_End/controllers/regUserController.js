let BASE_URL = "http://localhost:8080/carRentBackEnd_war/";

$("#btnSaveCustomer").click(function () {
    let formData = $("#customerForm").serializeArray();

    $.ajax({
        url: BASE_URL + "customer",
        method: "post",
        data: formData,
        dataType: "json",
        success: function (res) {
            alert(res.message);
            window.open("LoginForm.html","_self")
        },
        error: function (error) {
            alert(JSON.parse(error.responseText).message);
        }

    });
});
