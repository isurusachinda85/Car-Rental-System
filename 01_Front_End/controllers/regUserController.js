let BASE_URL = "http://localhost:8080/carRentalSystem/";

$("#btnSaveCustomer").click(function () {
    let formData = $("#customerForm").serializeArray();

    $.ajax({
        url: BASE_URL + "customer",
        method: "post",
        data: formData,
        dataType: "json",
        success: function (res) {
            alert(res.message);
        },
        error: function (error) {
            alert(JSON.parse(error.responseText).message);
        }

    });
});
