<%-- 
    Document   : song
    Created on : 2017-7-7, 18:14:16
    Author     : pc
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>歌曲详情</title>
</head>
<body>

<style type="text/css">img{border:0;}
li{list-style:none;}

.user_callback #user_pic{position:relative;overflow:hidden;height:450px;width:1200px;z-index:2;margin:0 auto;}
.user_callback #user_pic ul{width:990px;height:285px;position:relative;top:20px;left:105px;}
.user_callback #user_pic ul li{position:absolute;}
.user_callback #user_pic ul img{position:relative;top:0;left:0;}

.user_callback #user_pic ul .user_pic1{top:-285px;left:-231px;z-index:0;}
.user_callback #user_pic ul .user_pic2{top:-23px;left: -99.5px;z-index:2;}
.user_callback #user_pic ul .user_pic3{top: 66px;left: 68px;z-index:3;}
.user_callback #user_pic ul .user_pic4{top:110px;left:247.5px;z-index:4;}
.user_callback #user_pic ul .user_pic5{top:110px;left:495px;z-index:3;}
.user_callback #user_pic ul .user_pic6{top:66px;left:695.5px;z-index:2;}
.user_callback #user_pic ul .user_pic7{top:-23px;left:852px;z-index:1;}
.user_callback #user_pic ul .user_pic8{top:-285px;left:1000px;z-index:0;}

.user_callback #user_pic ul .user_pic1 a{width:216.5px;height:248px;}
.user_callback #user_pic ul .user_pic2 a{width:225.5px;height:259px;}
.user_callback #user_pic ul .user_pic3 a{width:247.5px;height:285px;}
.user_callback #user_pic ul .user_pic4 a{width:247.5px;height:285px;}
.user_callback #user_pic ul .user_pic5 a{width:247.5px;height:285px;}
.user_callback #user_pic ul .user_pic6 a{width:247.5px;height:285px;}
.user_callback #user_pic ul .user_pic7 a{width:225.5px;height:259px;}
.user_callback #user_pic ul .user_pic8 a{width:216.5px;height:248px;}


.user_callback #user_pic ul li:hover{background:#d9bb83;}

.user_callback #user_pic ul li.user_pic1{opacity:0.2;filter:alpha(opacity:20);}
.user_callback #user_pic ul li.user_pic2{opacity:0.6;filter:alpha(opacity:60);}
.user_callback #user_pic ul li.user_pic3{opacity:0.8;filter:alpha(opacity:80);}
.user_callback #user_pic ul li.user_pic4{opacity:1;filter:alpha(opacity:100);}
.user_callback #user_pic ul li.user_pic5{opacity:1;filter:alpha(opacity:100);}
.user_callback #user_pic ul li.user_pic6{opacity:0.8;filter:alpha(opacity:80);}
.user_callback #user_pic ul li.user_pic7{opacity:0.6;filter:alpha(opacity:60);}
.user_callback #user_pic ul li.user_pic8{opacity:0.2;filter:alpha(opacity:20);}

.user_callback #user_pic ul li.user_pic1 img{width:216.5px;height:248px;}
.user_callback #user_pic ul li.user_pic2 img{width:225.5px;height:259px;}
.user_callback #user_pic ul li.user_pic3 img{width:230.5px;height:264px;}
.user_callback #user_pic ul li.user_pic4 img{width:247.5px;height:285px;}
.user_callback #user_pic ul li.user_pic5 img{width:247.5px;height:285px;}
.user_callback #user_pic ul li.user_pic6 img{width:230.5px;height:264px;}
.user_callback #user_pic ul li.user_pic7 img{width:225.5px;height:259px;}
.user_callback #user_pic ul li.user_pic8 img{width:216.5px;height:248px;}

.user_callback #user_pic span{display:inline-block;*display:inline;*zoom:1;width:80px;height:80px;position:absolute;top:160px;z-index:30;cursor:pointer;opacity:0.7;filter:alpha(opacity=70);}
.user_callback #user_pic:hover span{opacity:1;filter:alpha(opacity=100);}
.user_callback #user_pic span img{width:80px;height:80px;display:block;}
.user_callback #user_pic span.prev{background:url(img/5836af12Neb8a5654.png) no-repeat;position:absolute;top:100px;left:5px;display:inline-block; width:60px;height:60px;}
.user_callback #user_pic span.next{background:url(img/5836af12N536e472b.jpg) no-repeat;position:absolute;top:100px;right:5px;display:inline-block;width:60px;height:60px; }
.user_callback #user_pic span.prev:hover{background:url(img/5836af12Neb8a56523.png) no-repeat;}
.user_callback #user_pic span.next:hover{background:url(img/5836b011N9a4d4531.jpg) no-repeat;}
.user_callback{background:#ccab6e;overflow:hidden;}</style>

<div class="user_callback">  
	<div class="user_pic" id="user_pic">   
		<span class="prev"></span>   <span class="next"></span>   
		<ul id="user_call">    
			<li class="user_pic1">
				<a href="#"> <img src="L1/1.jpg" alt="1" width="248" height="285" /></a>
			</li>    
			<li class="user_pic2"> 
				<a href="#"> <img src="L1/2.jpg" alt="2" width="247" height="285" /></a>
			</li>    
			<li class="user_pic3">
				<a href="#"> <img src="L1/3.png" alt="3" width="248" height="285" /></a>
			</li>    
			<li class="user_pic4">
				<a href="#"> <img src="L1/4.png" alt="4" width="247" height="285" /></a>
			</li>    
			<li class="user_pic5"> 
				<a href="#"> <img src="L1/5.jpg" alt="5" width="247" height="285" /></a>
			</li>    
			<li class="user_pic6">
				<a href="#"> <img src="L1/6.png" alt="6" width="247" height="285" /></a>
			</li>    
			<li class="user_pic7">
				<a href="#"> <img src="L1/7.jpg" alt="7" width="247" height="285" /></a> 
			</li>    
			<li class="user_pic8">
				<a href="#"> <img src="L1/8.jpg" alt="8" width="247" height="285" /></a>
			</li>   
		</ul>  
	</div>
</div>

<script type="text/javascript">function arcSlip()
  {
	 var oPic=document.getElementById('user_pic');
	 var oPrev=getByClass(oPic,'prev')[0];
	 var oNext=getByClass(oPic,'next')[0];
	 
	 var aLi=oPic.getElementsByTagName('li');
	 
	 var arr=[];
	 
	 for(var i=0;i<aLi.length;i++)
	 {
	   var oImg=aLi[i].getElementsByTagName('img')[0];
	   
	 	 arr.push([parseInt(getStyle(aLi[i],'left')),parseInt(getStyle(aLi[i],'top')),
		           getStyle(aLi[i],'zIndex'),oImg.width,parseFloat(getStyle(aLi[i],'opacity')*100)]);
	 }
	 
	 
	 oPrev.onclick=function moveTP()
	 {
	     arr.push(arr[0]);
		 arr.shift();
		     for(var i=0;i<aLi.length;i++)
	         {
			     var oImg=aLi[i].getElementsByTagName('img')[0];
					
					aLi[i].style.zIndex=arr[i][2];
					startMove(aLi[i],{left:arr[i][0],top:arr[i][1],opacity:arr[i][4]});
					startMove(oImg,{width:arr[i][3]});
			 }
			
	 }
	 
	oNext.onclick=function moveTN()
	 {
	      arr.unshift(arr[arr.length-1]);
		  arr.pop();
		     for(var i=0;i<aLi.length;i++)
	         {
			     var oImg=aLi[i].getElementsByTagName('img')[0];
					
					aLi[i].style.zIndex=arr[i][2];
					startMove(aLi[i],{left:arr[i][0],top:arr[i][1],opacity:arr[i][4]});
					startMove(oImg,{width:arr[i][3]});
			 }
	 }
    var moveTime = setInterval (function(){
	
		oNext.click();
		
		},2000);
	$('#user_pic').hover(function(){
		;;
         clearInterval(moveTime);
            },function(){
        moveTime=setInterval(function(){	
		oNext.click();		
		},2000);
            });
				
 function getStyle(obj,name)
	 {
	       if(obj.currentStyle){ return obj.currentStyle[name]; }
		   else{ return getComputedStyle(obj,false)[name]; }
	 }
  } 
function getByClass(oParent,sClass)
  {
      var aResult=[];
	  var aEle=oParent.getElementsByTagName('*');
	  
		  for(var i=0;i<aEle.length;i++)
		  {
			 if(aEle[i].className==sClass)
			 {
				aResult.push(aEle[i]);
			 }
		  }
	  return aResult;
  }
function getStyle(obj,name)
  {
       if(obj.currentStyle)
	   {
	       return obj.currentStyle[name];
	   }
       
	   else
	   {
	       return getComputedStyle(obj,false)[name];
	   }
  }
 function startMove(obj,json,fnEnd)
  {
       clearInterval(obj.timer);
       obj.timer=setInterval(function()
	   {
		 var bStop=true;
		 for(var attr in json)
	     {	
			   var cur=0;
	
			   if(attr=='opacity')
			   {
					cur=Math.round(parseFloat(getStyle(obj,attr))*100);
			   }
			   else
			   {
					cur=parseInt(getStyle(obj,attr));
			   }
		  
			   var  speed=(json[attr]-cur)/6;
			   speed=speed>0?Math.ceil(speed):Math.floor(speed);
		   
			   if(cur!=json[attr]) bStop=false;
			 
			   if(attr=='opacity')
			   {
				   obj.style.filter='alpha(opacity:'+(cur+speed)+')';
				   obj.style.opacity=(cur+speed)/100;
			   }
			   else
			   {
				   obj.style[attr]=cur+speed+'px';
			   }
		 }
		 
		 if(bStop)
		 {
		     clearInterval(obj.timer);
			 if(fnEnd) fnEnd();
		 }
		 
	   },30)
	   
	 
  }
  arcSlip();
</script>

<div style="text-align:center;clear:both">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div>
</body>
</html>


<head>
<meta charset="UTF-8">
<title>音乐播放器</title>
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
</head>
<body class="keBody">
<h1 class="keTitle">PPAP音乐播放器</h1>
<div class="kePublic">
<!--效果html开始-->
  <div class="music-player">
  <div style="background-image: url(images/yqB0erk.jpg);" class="album"></div>
  <div class="info">
    <div class="left">
      <a href="javascript:;" class="icon-shuffle"></a>
      <a href="javascript:;" class="icon-heart"></a>
    </div>
    <div class="center">
    <div class="jp-playlist">
      <ul>
        <li></li>
      </ul>
    </div>
    </div>
    <div class="right">
      <a href="javascript:;" class="icon-repeat"></a>
      <a href="javascript:;" class="icon-share"></a>
    </div>

    <div class="progress jp-seek-bar">
      <span class="jp-play-bar" style="width: 0%"></span>
    </div>
  </div>

  <div class="controls">
    <div class="current jp-current-time">00:00</div>
    <div class="play-controls">
      <a href="javascript:;" class="icon-previous jp-previous" title="previous"></a>
      <a href="javascript:;" class="icon-play jp-play" title="play"></a>
      <a href="javascript:;" class="icon-pause jp-pause" title="pause"></a>
      <a href="javascript:;" class="icon-next jp-next" title="next"></a>
    </div>
    <div class="volume-level jp-volume-bar">
      <span class="jp-volume-bar-value" style="width: 0%"></span>
      <a href="javascript:;" class="icon-volume-up jp-volume-max" title="max volume"></a>
      <a href="javascript:;" class="icon-volume-down jp-mute" title="mute"></a>
    </div>
  </div>
  <div id="jquery_jplayer" class="jp-jplayer"></div>
</div>
  <script src="js/jquery-1.8.3.min.js"></script>
  <script src='js/jquery.jplayer.min.js'></script>
  <script src='js/jplayer.playlist.min.js'></script>
  <script src="js/CuPlayer.js"></script>
<!--效果html结束-->
<div class="clear"></div>
</div>
<div class="keBottom">
</div>

</body>

    </body>
</html>
