$(document).ready(function () {
    classificationClick();
    mainPeasonClick();
    peasonClone();
})

function mainPeasonClick(){
    $("#mainPeason").change(function () {
        var classification = $('#classification option:selected').val();
        var mainPeason = $('#mainPeason option:selected').val();
        getPeason(classification,mainPeason);
    })
}
function classificationClick(){
    $("#classification").change(function () {
        var classification = $('#classification option:selected').val();
        var mainPeason = $('#mainPeason option:selected').val();
        getPeason(classification,mainPeason);
    })
}

function getPeason(classification,mainPeason){
    if((classification==2||classification==3)&&mainPeason==1){
        $("#peason option").remove()
        for(var i=1;i<=5;i++){
            $("#peason").append("<option value="+i+">"+i+'人'+"</option>");
        }
        $("#peason option[value='1']").attr("selected","selected")
    }
    if (classification == 1 && mainPeason == 1) {
        $("#peason option").remove()
        for(var i=2;i<=7;i++){
            $("#peason").append("<option value="+i+">"+i+'人'+"</option>");
        }
        $("#peason option[value='2']").attr("selected","selected")
    }
    if (classification == 1 && mainPeason == 2) {
        $("#peason option").remove()
        for(var i=1;i<7;i++){
            $("#peason").append("<option value="+i+">"+i+'人'+"</option>");
        }
        $("#peason option[value='1']").attr("selected","selected")
    }
    if((classification==2||classification==3)&&mainPeason==2){
        $("#peason option").remove()
        for(var i=1;i<=4;i++){
            $("#peason").append("<option value="+i+">"+i+'人'+"</option>");
        }
        $("#peason option[value='1']").attr("selected","selected")
    }
}


function peasonClone(){
    addPeason();
    $("#peason").change(function () {
        for (var i = 0; i<=$('#Peasons').children().length+4; i++) {
            $("#people"+i).remove()
        }
        addPeason();
    })
}

function addPeason(){
    var peason = $('#peason option:selected').val();
    for (var i = 0; i < peason ; i++) {
        ($("#people").clone()).attr('id','people'+i).show().insertAfter($("#people"));
    }
}
$("#mainPeason").bind("change",function() {
    var value = $("#mainPeason option:selected").val();
    if(value==2){
        $('#oneMainPeason').css("display","none");
        $('#twoMainPeason').css("display","block");
    }else {
        $('#oneMainPeason').css("display","block");
        $('#twoMainPeason').css("display","none");
    }
})

$("#tutorNumber").bind("change",function() {
    var value = $("#tutorNumber option:selected").val();
    if(value==2){
        $('#onetutor').css("display","none");
        $('#twotutor').css("display","block");
    }else {
        $('#onetutor').css("display","block");
        $('#twotutor').css("display","none");
    }
})


