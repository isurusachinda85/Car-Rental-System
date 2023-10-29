initiateUI();

function initiateUI() {
    clearAll();
    $("#homeForm").css("display", "block");
    setTheLastView();
}

function saveLastView(clickedID) {
    switch (clickedID) {
        case "homeForm":
            localStorage.setItem("view", "HOME");
            break;
        case "browseCarForm":
            localStorage.setItem("view", "BROWSECAR");
            break;
        case "rentCarForm":
            localStorage.setItem("view", "RENTCAR");
            break;
        case "bookingDetailsForm":
            localStorage.setItem("view", "BOKKINGDETAIL");
            break;

        case "yourPaymentDetailForm":
            localStorage.setItem("view", "PAYMENTDETAIL");
            break;
    }
}

function setTheLastView() {
    let view = localStorage.getItem("view");
    switch (view) {
        case "HOME":
            setView($("#homeForm"));
            break;
        case "BROWSECAR":
            setView($("#browseCarForm"));
            break;
        case "RENTCAR":
            setView($("#rentCarForm"));
            break;
        case "BOKKINGDETAIL":
            setView($("#bookingDetailsForm"));
            break;
        case "PAYMENTDETAIL":
            setView($("#yourPaymentDetailForm"));
            break;
        default:
            setView($("#homeForm"));
    }
}

function clearAll() {
    $("#homeForm,#browseCarForm,#rentCarForm,#bookingDetailsForm,#yourPaymentDetailForm").css('display', 'none');
}

function setView(viewOb) {
    clearAll();
    viewOb.css("display", "block");
    saveLastView(viewOb.get(0).id);
    // console.log(viewOb.get(0).id);
}

//bind events
$("#Home").click(function () {
    setView($("#homeForm"));
});

$("#BrowseCar").click(function () {
    setView($("#browseCarForm"));
});

$("#RentCar").click(function () {
    setView($("#rentCarForm"));
});

$("#YourRent").click(function () {
    setView($("#bookingDetailsForm"));
});

$("#Payment").click(function () {
    setView($("#yourPaymentDetailForm"));
});