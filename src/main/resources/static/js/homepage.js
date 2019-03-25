/*
  大图背景自适应
   */
$(function () {
    var mydiv = $("#jumbotron-img");
    var mydiv_resize = function () {
        $(mydiv).css("width", $(window).width());
    };
    mydiv_resize();
    $(window).resize(function () {
        mydiv_resize();
    });
});


/*
通知通告
 */
var TZTG,message;
$.ajax({
    url: '/home/message',
    type: 'get',
    success: function (response) {
        message = response.data;
        TZTG = new Vue({
            el: '#message1',
            data: {
                message: message,
            },
            methods:{
                getMessageId(id){
                  location.href="message/detail/"+id;
                }
            },
            filters: {
                formatDate(time) {
                    var date = new Date(time);
                    var year = date.getFullYear();
                    var month = date.getMonth();
                    var day = date.getDate();
                    return year+'-'+(month+1)+'-'+day;
                }
            },

        });
        return;
    }
});


/*
    创新训练项目(立项)
 */
var CXXL,CXXLProjects;
$.ajax({
    url: '/home/approval',
    type: 'get',
    success: function (response) {
        CXXLProjects = response.data;
        CXXL = new Vue({
            el: '#CXXLTitle',
            data: {
                CXXLProjects: CXXLProjects,
            },
        methods:{
            getCXXLLXId(id){
                location.href="approval/detail/"+id;
            }
        }
        });

        return;
    }
});



/*
    创业训练项目(立项)
 */
var CYXLProjects,CYXL;
$.ajax({
    url: '/home/approval',
    type: 'get',
    success: function (response) {
        CYXLProjects = response.data;
        CYXL = new Vue({
            el: '#CYXLTitle',
            data: {
                CYXLProjects: CYXLProjects,
            },
            methods:{
                getCYXLLXId(id){
                    location.href="approval/detail/"+id;
                }
            }
        });
        return;
    }
});


/*
    创业实践项目(立项)
 */
var CYSJProject,CYSJ;
$.ajax({
    url: '/home/approval',
    type: 'get',
    success: function (response) {
        CYSJProjects = response.data;
        CYSJ = new Vue({
            el: '#CYSJTitle',
            data: {
                CYSJProjects: CYSJProjects,
            },
            methods:{
                getCYSJLXId(id){
                    location.href="approval/detail/"+id;
                }
            }
        });
        return;
    }
});





/*
    创新训练项目(结项)
 */
var CXXL_JX,CXXLProjects_jx ;
$.ajax({
    url: '/home/approval',
    type: 'get',
    success: function (response) {
        CXXLProjects_jx = response.data;
            CXXL_JX = new Vue({
                el: '#CXXLTitle_jx',
                data: {
                    CXXLProjects_jx: CXXLProjects_jx,
                },
                methods:{
                    getCXXLJXId(id){
                        location.href="approval/detail/"+id;
                    }
                }
            });
        return;
    }
});




/*
    创业训练项目(结项)
 */

var CYXL_JX,CYXLProjects_jx;
$.ajax({
    url: '/home/approval',
    type: 'get',
    success: function (response) {
        CYXLProjects_jx = response.data;
        CYXL_JX = new Vue({
            el: '#CYXLTitle_jx',
            data: {
                CYXLProjects_jx: CYXLProjects_jx,
            },
            methods:{
                getCYXLJXId(id){
                    location.href="approval/detail/"+id;
                }
            }
        });
        return;
    }
});


/*
    创业实践项目(立项)
 */
var CYSJProjects_jx,CYSJ_JX;
$.ajax({
    url: '/home/approval',
    type: 'get',
    success: function (response) {
        CYSJProjects_jx = response.data;
        CYSJ_JX = new Vue({
            el: '#CYSJTitle_jx',
            data: {
                CYSJProjects_jx: CYSJProjects_jx,
            },
            methods:{
                getCYSJJXId(id){
                    location.href="approval/detail/"+id;
                }
            }
        });
        return;
    }
});
