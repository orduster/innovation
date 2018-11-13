var index = 0;//默认index为0
$(function () {
    //初始化
    $('.content:not(:first)').hide();//隐藏第一个content的之外的div

    //划过li时
    $(".title-item").hover(function () {
        $(".title-item").removeClass('select');//清除所有的select样式
        $(this).addClass('select');//当前加上select样式
        index = $(this).index();//改变index值
        $(".content").hide();
        $(".content").eq(index).show();//显示对应div
    });
});