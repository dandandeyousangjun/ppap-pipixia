<!doctype html>
<%@ page contentType="text/html; charset=UTF-8" %>  
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
<title></title>
<link href="css/jq22.css" rel="stylesheet" type="text/css" />
</head>
    <style>
	body{
		background-image: url('images/back.png');
                background-repeat: repeat-x;
	}
        body{ 
	font:20px/200% Arial, Helvetica, sans-serif, "新宋体";
	height:90%;
     }
    </style>
<body>
	<div style="float:right;width:100%;margin:20px;">
		<div style="float:right;margin-right:10px;">
			<b><span>
				<a href="#">用户名</a>
			</span></b>
		</div>
	</div>
	<div style="margin:5px auto;width:4%;clear:both">
		<h2>歌单秀</h2>
	</div>
    <div class="btnMode" id="slider">    
	<a href="javascript:void(0);" class="prev btn"></a>
	<div class="scroll">	
		<ul class="scrollContainer">
			<li class="panel" id="panel_1">
				<a href="song.jsp" class="inside" >
					<img width="500" height="500" alt="《追光者》岑宁儿" src="LP/L1.png" />
					<span>《追光者》岑宁儿</span>
				</a>
			</li>
			<li class="panel" id="panel_2">
				<a href="#" class="inside" >
                                    <img width="500" height="500" alt="《童话镇》陈一发儿" src="LP/L2.png" />
					<span>《童话镇》陈一发儿</span>
				</a>
			</li>
			<li class="panel" id="panel_3">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《暧昧》薛之谦" src="LP/L3.png" />
					<span>《暧昧》薛之谦</span>
				</a>
			</li>
			<li class="panel" id="panel_4">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《成都》赵雷" src="LP/L4.png" />
					<span>《成都》赵雷</span>
				</a>
			</li>
			<li class="panel" id="panel_5">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《说散就散》 JC" src="LP/L5.png" />
					<span>《说散就散》 JC</span>
				</a>
			</li>
			<li class="panel" id="panel_6">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《全部都是你》" src="LP/L6.png" />
					<span>《全部都是你》 Dragon</span>
				</a>
			</li>
			<li class="panel" id="panel_7">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《安河桥》宋冬野" src="LP/L7.png" />
					<span>《安河桥》宋冬野</span>
				</a>
			</li>
                        <li class="panel" id="panel_8">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《刚好遇见你》李玉刚" src="LP/L8.png" />
					<span>《刚好遇见你》李玉刚</span>
				</a>
			</li>
                        <li class="panel" id="panel_9">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《Shape of You》Ed Sheeran" src="LP/L9.png" />
					<span>《Shape of You》Ed Sheeran</span>
				</a>
			</li>
                        <li class="panel" id="panel_10">
				<a href="#" class="inside" >
					<img width="500" height="500" alt="《再也没有》Ryan.B" src="LP/L10.png" />
					<span>《再也没有》Ryan.B</span>
				</a>
			</li>
		</ul>
	</div>
	<a href="javascript:void(0);" class="next btn"></a>     
</div>
<!--
<div style="width:100%;margin-bottom:20px;">
	<div style="width:20%;margin:5px auto;">
		<b><span>????</span></b>
	</div>
</div>
-->
<head>
<meta charset="UTF-8">
<title>歌单秀</title>

<link rel="stylesheet" href="css/mplayer.css">
<style>
	.info {
		font-family: "Microsoft Yahei";
		text-align: center;
	}
	.info h1 {
		font-weight: 400;
	}
</style>

</head>
<div class="mp">
	<div class="mp-box">
		<img src="img/mplayer_error.png" alt="music cover" class="mp-cover">
		<div class="mp-info">
			<p class="mp-name">燕归巢</p>
			<p class="mp-singer">许嵩</p>
			<p><span class="mp-time-current">00:00</span>/<span class="mp-time-all">00:00</span></p>
		</div>
		<div class="mp-btn">
			<button class="mp-prev" title="上一首"></button>
			<button class="mp-pause" title="播放"></button>
			<button class="mp-next" title="下一首"></button>
			<button class="mp-mode" title="播放模式"></button>
			<div class="mp-vol">
				<button class="mp-vol-img" title="静音"></button>
				<div class="mp-vol-range" data-range_min="0" data-range_max="100" data-cur_min="80">
					<div class="mp-vol-current"></div>
					<div class="mp-vol-circle"></div>
				</div>
			</div>
		</div>
		<div class="mp-pro">
			<div class="mp-pro-current"></div>
		</div>
		<div class="mp-menu">
			<button class="mp-list-toggle"></button>
			<button class="mp-lrc-toggle"></button>
		</div>
	</div>
	<button class="mp-toggle">
		<span class="mp-toggle-img"></span>
	</button>
	<div class="mp-lrc-box">
		<ul class="mp-lrc"></ul>
	</div>
	<button class="mp-lrc-close"></button>
	<div class="mp-list-box">
		<ul class="mp-list-title"></ul>
		<table class="mp-list-table">
			<thead>
				<tr>
					<th>歌名</th>
					<th>歌手</th>
					<th>时长</th>
				</tr>
			</thead>
			<tbody class="mp-list"></tbody>
		</table>
	</div>
</div>

<script src="js/jquery-2.1.1.js"></script>
<script src="js/mplayer.js"></script>
<script src="js/mplayer-list.js"></script>
<script src="js/mplayer-functions.js"></script>
<script src="js/jquery.nstSlider.min.js"></script>
<script>
var modeText = ['顺序播放','单曲循环','随机播放','列表循环'];
var player = new MPlayer({
	// 容器选择器名称
	containerSelector: '.mp',
	// 播放列表
	songList: mplayer_song,
	// 专辑图片错误时显示的图片
	defaultImg: 'img/mplayer_error.png',
	// 自动播放
	autoPlay: true,
	// 播放模式(0->顺序播放,1->单曲循环,2->随机播放,3->列表循环(默认))
	playMode:0,
	playList:0,
	playSong:0,
	// 当前歌词距离顶部的距离
	lrcTopPos: 34,
	// 列表模板，用${变量名}$插入模板变量
	listFormat: '<tr><td>${name}$</td><td>${singer}$</td><td>${time}$</td></tr>',
	// 音量滑块改变事件名称
	volSlideEventName:'change',
	// 初始音量
	defaultVolume:80
}, function () {
	// 绑定事件
	this.on('afterInit', function () {
		console.log('播放器初始化完成，正在准备播放');
	}).on('beforePlay', function () {
		var $this = this;
		var song = $this.getCurrentSong(true);
		var songName = song.name + ' - ' + song.singer;
		console.log('即将播放'+songName+'，return false;可以取消播放');
	}).on('timeUpdate', function () {
		var $this = this;
		console.log('当前歌词：' + $this.getLrc());
	}).on('end', function () {
		var $this = this;
		var song = $this.getCurrentSong(true);
		var songName = song.name + ' - ' + song.singer;
		console.log(songName+'播放完毕，return false;可以取消播放下一曲');
	}).on('mute', function () {
		var status = this.getIsMuted() ? '已静音' : '未静音';
		console.log('当前静音状态：' + status);
	}).on('changeMode', function () {
		var $this = this;
		var mode = modeText[$this.getPlayMode()];
		$this.dom.container.find('.mp-mode').attr('title',mode);
		console.log('播放模式已切换为：' + mode);
	});
});

$(document.body).append(player.audio); // 测试用

setEffects(player);

</script>

</body>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jq22.js"></script>
<script>
$(function(){
    
});
</script>
<p></p>
<br />
<br />
<br />
<br />
<p></p>
<div style="width:40%;margin:20px auto;">
		<strong>Copyright &copy; 2001-2017 <a href="#">PPAP北京有限公司</a>.</strong> All rights .
	</div>
</html>


	