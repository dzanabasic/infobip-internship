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
				var city=$("#city").val();
			var code=$("#code").val();
				$.ajax({url: "index/city/"+city+"/code/"+code, success: function(result){
					$("#div1").html(result);
				}});
			});})
		</script>


   <div id="div1">
	
</div>

<form>
City:<br>
<input id="city" type="text" name="City">
<br>
Country code:<br>
<input id="code" type="text"  name="Country code">
	<input type="button" id="weather"  value="Submit"></input>




</form>
		

		
		
	</body>
</html>