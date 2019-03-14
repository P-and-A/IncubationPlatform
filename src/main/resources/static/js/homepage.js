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
var TZTG;
// $.ajax({
//     url: '/home/message',
//     type: 'get',
//     success: function (response) {
//         message = response.data;
//
//         return;
//     }
// });
var message = [{
    id:"123456",
    title:"关于2019年大学生创新创业比赛的结项通知",
    createTime:"2019-03-11"
},{
    id:"123456",
    title:"关于2019年大学生创新创业比赛的结项通知",
    createTime:"2018-11-26 20:46:38"
},{
    id:"123456",
    title:"关于2019年大学生创新创业比赛的结项通知",
    createTime:"2018-11-26 20:46:38"
},{
    id:"123456",
    title:"关于2019年大学生创新创业比赛的结项通知",
    createTime:"2018-11-26 20:46:38"
},{
    id:"123456",
    title:"关于2019年大学生创新创业比赛的结项通知",
    createTime:"2018-11-26 20:46:38"
},{
    id:"123456",
    title:"关于2019年大学生创新创业比赛的结项通知",
    createTime:"2018-11-26 20:46:38"
},{
    id:"123456",
    title:"关于2019年大学生创新创业比赛的结项通知",
    createTime:"2018-11-26 20:46:38"
}];
TZTG = new Vue({
    el: '#message1',
    data: {
        message: message,
    },
    methods:{
        getMessageId(id){
            alert(location.href="/manager/activity/"+id);
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

/*
    创新训练项目(立项)
 */
var CXXL;
// $.ajax({
//     url: '/home/approval',
//     type: 'get',
//     success: function (response) {
//         CXXLProjects = response.data;
//
//         return;
//     }
// });
var CXXLProjects = [{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'bing bing 水果店',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'广商纪念品',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},,{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
}]
CXXL = new Vue({
    el: '#CXXLTitle',
    data: {
        CXXLProjects: CXXLProjects,
    }
});


/*
    创业训练项目(立项)
 */
var CYXLProjects = [{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'bing bing 水果店',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'广商纪念品',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},,{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
}]
var CYXL ;
// $.ajax({
//     url: '/home/approval',
//     type: 'get',
//     success: function (response) {
//         CYXLProjects = response.data;
//
//         return;
//     }
// });
CYXL = new Vue({
    el: '#CYXLTitle',
    data: {
        CYXLProjects: CYXLProjects,
    },
});

/*
    创业训练项目(立项)
 */
var CYSJProjects = [{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'bing bing 水果店',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'广商纪念品',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},,{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
}]
var CYSJ;
// $.ajax({
//     url: '/home/approval',
//     type: 'get',
//     success: function (response) {
//         CYSJProjects = response.data;
//
//         return;
//     }
// });
CYSJ = new Vue({
    el: '#CYSJTitle',
    data: {
        CYSJProjects: CYSJProjects,
    },
});




/*
    创新训练项目(立项)
 */
var CXXL_JX;
// $.ajax({
//     url: '/home/approval',
//     type: 'get',
//     success: function (response) {
//         CXXLProjects = response.data;
//
//         return;
//     }
// });
var CXXLProjects_jx = [{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'bing bing 水果店',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'广商纪念品',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},,{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
}]
CXXL_JX = new Vue({
    el: '#CXXLTitle_jx',
    data: {
        CXXLProjects_jx: CXXLProjects_jx,
    }
});


/*
    创业训练项目(立项)
 */
var CYXLProjects = [{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'bing bing 水果店',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'广商纪念品',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},,{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
}]
var CYXL ;
// $.ajax({
//     url: '/home/approval',
//     type: 'get',
//     success: function (response) {
//         CYXLProjects = response.data;
//
//         return;
//     }
// });
CYXL = new Vue({
    el: '#CYXLTitle',
    data: {
        CYXLProjects: CYXLProjects,
    },
});

/*
    创业训练项目(立项)
 */
var CYSJProjects = [{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'创序软件工作室',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'bing bing 水果店',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'广商纪念品',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
},,{
    id : '123456',
    name :'老司机plus',
    classification:'创业实践',
    grade:'国家级',
    introduce:'这是一个工作室',
    create_time:'2018-11-28 01:44:54'
}]
var CYSJ;
// $.ajax({
//     url: '/home/approval',
//     type: 'get',
//     success: function (response) {
//         CYSJProjects = response.data;
//
//         return;
//     }
// });
CYSJ = new Vue({
    el: '#CYSJTitle',
    data: {
        CYSJProjects: CYSJProjects,
    },
});