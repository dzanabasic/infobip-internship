<html>
	<head>
		
		<script type="text/javascript" src= "http://code.jquery.com/jquery-1.11.3.min.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

		<style>
			body {background-image: url("http://www.webdesignburn.com/wp-content/uploads/2015/03/Free-Spring-Wallpaper-HD-for-Desktop-36.jpg");
			p {color:blue;}
		
			.jumbotron h1 {
				font-family: 'Open Sans', sans-serif !important;
				color: white;
				text-rendering: optimizelegibility;
				text-align: center;
}
		</style>
	</head>
	<body>
		<h1>Welcome to Open Weather site</h1>
  <p>Let's take a look at weather in your city</p>
		<script type="text/javascript" >
			
			$(document).ready(function(){
			
			$("#weather").click(function(){
				var city=$("#city").val();
			var code=$("#code").val();
				$.ajax({url: "index/city/"+city+"/code/"+code, success: function(result){
					
					var object=JSON.parse(result);
			var sunriseTime=new Date(object.sys.sunrise*1000);
			var sunsetTime=new Date(object.sys.sunset*1000);
			        
					$("#wind").html(object.wind.speed);
			
				$("#pressure").html(object.main.pressure);
			    $("#clouds").html(object.weather[0].description);
				$("#humidity").html(object.main.humidity);
				$("#temp_min").html(object.main.temp_min);
				$("#temp_max").html(object.main.temp_max);
				$("#sunrise").html(sunriseTime.getHours()+":"+sunriseTime.getMinutes()+":"+sunriseTime.getSeconds());
				$("#sunset").html(sunsetTime.getHours()+":"+sunsetTime.getMinutes()+":"+sunsetTime.getSeconds());
					
				}});
			});})
			
			
	$(function(){
   

    // when button is pressed
    $('button').on('click',function(){  
      $('#myform').show();
   });
});

		</script>


   <div id="div1">
	
</div>

<form>
City:<br>
<input id="city" type="text" name="City">
<br>
Country code:<br>
<input id="code" type="text"  name="Country code">
	</input>
	<button id="weather" type="button">Submit</button>




</form>
		
<div id="myform" style="display:none">
	<table class="table">
        <thead>
            <tr>
                <th>Wind Speed</th>
                <th>Cloudiness</th>
                <th>Preassure</th>
                <th>Humidity</th>
				<th>Minimum Temperature</th>
				<th>Maximum Temperature</th>
				<th>Sunrise</th>
				<th>Sunset</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td id="wind"></td>
                <td id="clouds"></td>
                <td id="pressure"></td>
                <td id="humidity"></td>
				<td id="temp_min"></td>
				<td id="temp_max"></td>
				<td id="sunrise"></td>
				<td id="sunset"></td>
            </tr>
            
        </tbody>
    </table>	
</div>

		
	</body>
</html>