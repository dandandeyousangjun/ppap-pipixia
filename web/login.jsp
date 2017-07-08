<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>LogIn</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="http://labfile.oss.aliyuncs.com/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://labfile.oss.aliyuncs.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <style>
        .raise:hover,
.raise:focus {
  box-shadow: 0 0.5em 0.5em -0.4em var(--hover);
  -webkit-transform: translateY(-0.25em);
          transform: translateY(-0.25em);
}
        .raise {
  --color: #a972cb;
  --hover: #e5ff60;
}
        button {
         color:var(--color);
         -webkit-transition: 0.25s;
         transition: 0.25s;
         }
         
        button:hover, button:focus {
       border-color: var(--hover);
       color: #fff;
      }
      
       button {
         background: none;
          border: 2px solid;
          font: inherit;
          line-height: 1;
          width:80px;
           margin: 0.5em;
         padding: 1em 2em;
        }
        
        body {
  color:#a972cb;
  background: #17181c;
  font: 300 1em 'Fira Sans', sans-serif;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -ms-flex-line-pack: center;
      align-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  text-align: center;
  min-height: 100vh;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
        }
        
        body{
		background-image: url('pic/img014.jpg');
		background-repeat: repeat-x;
	}
  </style>
  
  <body>
    <div class="container">
        <div class="row">
        </div>
        <div class="row">
            <div id="alert1"  class="alert alert-success fade in text-center col-xs-2 col-xs-offset-5 hide">
                <strong>注册成功！</strong>
            </div>
        </div>
        <form id="form" class="form-horizontal" role="form" style="margin-top: 73px;">
          <div class="form-group"  >
            <label for="username" class="col-xs-2 control-label col-sm-offset-3" >用户名</label>
            <div class="col-xs-2">
              <input type="text" class="form-control" id="username" rel="tooltip"/>
            </div>
          </div>
          <div class="form-group">
            <label for="password" class="col-xs-2 control-label col-sm-offset-3">密码</label>
            <div class="col-xs-2">
              <input type="password" class="form-control" id="password"/>
            </div>
          </div>
          <div class="form-group">
            <div class="col-sm-offset-5 col-xs-1">
              <button type="button" class="raise" id="login">登录</button>
            </div>
            <div class="col-sm-1">
              <button type="button" class="raise" data-toggle="modal" data-target="#myModal">注册</button>
            </div>
          </div>
        </form>
    </div>

    <!-- 注册对话框 begin -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
            <h4 class="modal-title" id="myModalLabel">注册界面</h4>
          </div>
          <div class="modal-body">
              <form class="form-horizontal" role="form">
              <div class="form-group"  >
                <label for="reg_username" class="col-xs-2 control-label" >用户名</label>
                <div class="col-xs-4">
                  <input type="text" class="form-control" id="reg_username"/>
                </div>
              </div>
              <div class="form-group">
                <label for="reg_password" class="col-xs-2 control-label">密码</label>
                <div class="col-xs-4">
                  <input type="password" class="form-control" id="reg_password"/>
                </div>
              </div>
              <div class="form-group">
                <label for="reg_repassword" class="col-xs-2 control-label">再输一遍</label>
                <div class="col-xs-4">
                  <input type="password" class="form-control" id="reg_repassword"/>
                </div>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button type="button" class="btn btn-primary" id="register">注册</button>
          </div>
        </div>
      </div>
    </div>
    <!-- 注册对话框 end -->

    <script src="http://labfile.oss.aliyuncs.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            //点击登录
            $('#login').click(function() {
                //提交登录表单
                $.post('${pageContext.request.contextPath}' + '/UserAction?type=1',
                {
                    username: $('#username').val(),
                    password: $('#password').val()
                },
                function(data, status) {
                    if (data == '1') {
                        createPopOver('#username', 'right', '用户名不能为空 ', 'show');
                    } else if (data == '2') {
                        createPopOver('#password', 'right', '密码不能为空', 'show');
                    } else if (data == '3') {
                        createPopOver('#username', 'right', ' 用户名不存在', 'show');
                    } else if (data == '4') {
                        createPopOver('#password', 'right', '密码错误', 'show');
                    } else if (data == 5) {
                        location.href = "list.jsp";
                    }
                });
            });

            //点击注册按钮
            $('#register').click(function() {
                //提交注册表单
                $.post('${pageContext.request.contextPath}' + '/UserAction?type=2',
                {
                    username: $('#reg_username').val(),
                    password: $('#reg_password').val(),
                    repassword: $('#reg_repassword').val()
                },
                function(data, status) {
                    if (data == '1') {
                        createPopOver('#reg_username', 'right', '不能为空', 'show');
                    } else if (data == '2') {
                        createPopOver('#reg_password', 'right', '不能为空', 'show');
                    } else if (data == '3') {
                        createPopOver('#reg_repassword', 'right', '不能为空', 'show');
                    } else if (data == '4') {
                        createPopOver('#reg_repassword', 'right', '密码不匹配', 'show');
                    } else if (data == '5') {
                        createPopOver('#reg_username', 'right', '用户名存在', 'show');
                    } else if (data == '6') {
                        $('#reg_username').val('');
                        $('#reg_password').val('');
                        $('#reg_repassword').val('');
                        $('#myModal').modal('hide');
                        $('#alert1').removeClass('hide');
                        $('#form').css('margin-top', '0px');
                    }
                });
            }); 

            //显示弹出框
            function createPopOver(id, placement, content, action) {
                $(id).popover({
                    placement: placement,
                    content: content
                });
                $(id).popover(action);
            }

            //点击输入框时销毁弹出框
            $('#username').click(function() {
                $('#username').popover('destroy');
            });

            $('#password').click(function() {
                $('#password').popover('destroy');
            });

            $('#reg_username').click(function() {
                $('#reg_username').popover('destroy');
            });

            $('#reg_password').click(function() {
                $('#reg_password').popover('destroy');
            });

            $('#reg_repassword').click(function() {
                $('#reg_repassword').popover('destroy');
            });
        });
    </script>
  </body>
</html>