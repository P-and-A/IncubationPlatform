$(document).ready(function () {
    $("input[name=mainPeason]").click(function () {
        var value = $('input[name=mainPeason]:checked').val();
        if(value==2){
            $('#oneMainPeason').css("display","none");
            $('#twoMainPeason').css("display","block");
        }else {
            $('#oneMainPeason').css("display","block");
            $('#twoMainPeason').css("display","none");
        }
    })
})