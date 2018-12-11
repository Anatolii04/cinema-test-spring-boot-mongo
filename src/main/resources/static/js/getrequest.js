$( document ).ready(function() {

    var url = window.location;

    $("#btnId").click(function(event){
        event.preventDefault();
        ajaxGet();
    })

    // DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : url + "/cinema/seances",
            success: function(data){
                fillData(data);
            },
            error : function(e) {
                fillData(null);
            }
        });
    }

    function fillData(data){

    }
})