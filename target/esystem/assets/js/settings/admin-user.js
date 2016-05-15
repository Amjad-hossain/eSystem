
$(document).ready(function () {




    var tableId = "#users";
    var ajaxUri = "./userList.do";
    var columns = [
        { "data": "userName", bSortable: true, bSearchable:true },
        { "data": "displayName", bSortable: true, bSearchable:true},
        { "data": "email", bSortable: true, bSearchable:true },
        { "data": "timeZone", bSortable: false },
        { "data": "active", bSortable: false }
    ];

    tableInit(tableId, ajaxUri, columns);

});