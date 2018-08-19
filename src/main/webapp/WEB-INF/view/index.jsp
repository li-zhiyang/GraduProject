<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>智能叉车运行管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="/assets/css/bui/dpl-min.css" rel="stylesheet" type="text/css"/>
    <link href="/assets/css/bui/bui-min.css" rel="stylesheet" type="text/css"/>
    <link href="/assets/css/bui/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="header">

    <div class="dl-title">
        <span class="dl-title-text">智能叉车运行管理系统</span>
    </div>

    <div class="dl-log">欢迎您，
        <span class="dl-log-user"><%=session.getAttribute("username") %></span>
        <a href="/logout.json" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
</div>
<div class="content">
    <ul id="J_NavContent" class="dl-tab-content">

    </ul>
</div>
<script src="${pageContext.request.contextPath}/webjars/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="/assets/js/bui.js"></script>
<script type="text/javascript" src="/assets/js/config.js"></script>

<script>
    BUI.use('common/main', function () {
        var menulist;
        $(function () {
            $.ajax({
                type:"get",
                url:"menu",
                async:false,
                success:function (data) {
                    menulist = data;
                }

            })
        });
        var config = menulist;

        new PageUtil.MainPage({
            modulesConfig: config
        });
    });
</script>
</body>
</html>
