initiateUI();

function initiateUI() {
    clearAll();
    $("#adminDashBoardForm").css("display", "block");
    setTheLastView();
}

function saveLastView(clickedID) {
    switch (clickedID) {
        case "adminDashBoardForm":
            localStorage.setItem("view", "DASHBOARD");
            break;
        case "customerManageForm":
            localStorage.setItem("view", "CUSTOMERMANAGE");
            break;
        case "customerDetailForm":
            localStorage.setItem("view", "CUSTOMERDETAIL");
            break;
        case "driverManageForm":
            localStorage.setItem("view", "DRIVERMANAGE");
            break;
        case "carManageForm":
            localStorage.setItem("view", "CARMANAGE");
            break;

        case "paymentDetailForm":
            localStorage.setItem("view", "PAYMENTDETAIL");
            break;
        case "rentDetailForm":
            localStorage.setItem("view", "RENTDETAIL");
            break;
        case "rentRequestForm":
            localStorage.setItem("view", "RENTREQUEST");
            break;
    }
}

function setTheLastView() {
    let view = localStorage.getItem("view");
    switch (view) {
        case "DASHBOARD":
            setView($("#adminDashBoardForm"));
            break;
        case "CUSTOMERMANAGE":
            setView($("#customerManageForm"));
            break;
        case "CUSTOMERDETAIL":
            setView($("#customerDetailForm"));
            break;
        case "DRIVERMANAGE":
            setView($("#driverManageForm"));
            break;
        case "CARMANAGE":
            setView($("#carManageForm"));
            break;
        case "PAYMENTDETAIL":
            setView($("#paymentDetailForm"));
            break;
        case "RENTDETAIL":
            setView($("#rentDetailForm"));
            break;
        case "RENTREQUEST":
            setView($("#rentRequestForm"));
            break;
        default:
            setView($("#adminDashBoardForm"));
    }
}

function clearAll() {
    $("#adminDashBoardForm,#customerManageForm,#customerDetailForm,#driverManageForm,#carManageForm,#paymentDetailForm,#rentDetailForm,#rentRequestForm").css('display', 'none');
}

function setView(viewOb) {
    clearAll();
    viewOb.css("display", "block");
    saveLastView(viewOb.get(0).id);
    // console.log(viewOb.get(0).id);
}

//bind events
$("#Dashboard").click(function () {
    setView($("#adminDashBoardForm"));
});

$("#CustomerManage").click(function () {
    setView($("#customerManageForm"));
});

$("#CustomerDetail").click(function () {
    setView($("#customerDetailForm"));
});

$("#DriverManage").click(function () {
    setView($("#driverManageForm"));
});

$("#CarManage").click(function () {
    setView($("#carManageForm"));
});

$("#PaymentDetail").click(function () {
    setView($("#paymentDetailForm"));
});
$("#RentDetail").click(function () {
    setView($("#rentDetailForm"));
});
$("#RentRequest").click(function () {
    setView($("#rentRequestForm"));
});