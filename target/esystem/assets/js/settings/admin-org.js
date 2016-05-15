

$(document).ready(function () {

    var tableId = "#orgs";
    var ajaxUri = "./orgs.do";
    var columns = [
        {"data": "name"},
        {"data": "desp"},
        {"data": "type"}
    ];

    tableInit(tableId, ajaxUri, columns);

});