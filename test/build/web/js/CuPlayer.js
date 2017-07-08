 $(function(){
  var playlist = [{
      title:"追光者",
      artist:"岑宁儿《夏至未至》",
      mp3:"./file/cbq-ppxhn.mp3",
      poster: "L1/1.jpg"
    },{
       title:"追光者",
      artist:"岑宁儿《夏至未至》",
      mp3:"./file/cbq-ppxhn.mp3",
      poster: "L1/1.jpg"
    }];
  
  var cssSelector = {
    jPlayer: "#jquery_jplayer",
    cssSelectorAncestor:".music-player"
  };
  
  var options = {
    swfPath: "Jplayer.swf",
	solution: 'html, flash',
    supplied: "ogv, m4v, oga, mp3"
  };
  
  var myPlaylist = new jPlayerPlaylist(cssSelector, playlist, options);
  
});