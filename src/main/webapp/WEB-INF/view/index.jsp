<html>
	<head>
		
		<script type="text/javascript" src= "http://code.jquery.com/jquery-1.11.3.min.js"></script>
		
	</head>
	<body>
		<script type="text/javascript" >
			function getWeather() {
				$.get("http://localhost:8080/index/city/Sarajevo/code/ba", function(data){
						$("#div1").html(data);
					});
			}
			$(document).ready(function(){
			
			$("#weather").click(function(){
				console.log("mbnm");
				$.ajax({url: "index/city/Sarajevo/code/ba", success: function(result){
					$("#div1").html(result);
				}});
			});})
		</script>


   <div id="div1">
	
</div>
	
		
<input type="button" id="weather"  value="Weather in the world"></input>
		</script>	
			
		
	
		
	</body>
</html>