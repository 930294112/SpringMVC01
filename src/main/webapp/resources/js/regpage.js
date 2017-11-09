/**
 * Created by lizhongren1 on 2017/5/9.
 */

$("#submitbtn").click(function () {

    $.ajax({
        type:"POST",
        url:"/reg",
        data:{
            "name":$("#regname").val(),
            "password":$("#regpass").val(),
            "tel":$("#regtel").val(),
            "address":$("#regaddress").val()
        },
        success:function (result) {
            console.log(result);
            if (result.errorCode == 0) {
                // 跳转到登录页
                location.href = "/login"
            } else {
                console.log(222222);
            }
        }

    })

})
