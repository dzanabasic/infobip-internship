<html>
	<head>
		
		<script type="text/javascript" src= "http://code.jquery.com/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src= "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		<script type="text/javascript" src= "http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.5/js/bootstrap-select.min.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.5/css/bootstrap-select.min.css"></link>
			
		<style>
				//body {background-image: url("http://www.webdesignburn.com/wp-content/uploads/2015/03/Free-Spring-Wallpaper-HD-for-Desktop-36.jpg");
				p {color:blue;}
		
				.jumbotron h1 {
				font-family: 'Open Sans', sans-serif !important;
				color: white;
				text-rendering: optimizelegibility;
				text-align: center;
				}
		</style>
		<script type="text/javascript" >

			$(document).ready(function(){

				$("#weather").click(function(){
					var city=$("#citySelector").val();
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

				})
				$("#citySelector").change(function () {
					var selectedCity= $(this).val();

					if (selectedCity != null && selectedCity != '') {
						 $("#code").val(selectedCity);
					}      
				});


			}); 


			$(function(){
				// when button is pressed
				$('button').on('click',function(){  
				
				$('#myform').show();
			 
				});
			});
			
			

		</script>
	</head>
	<body>
		<h1>Welcome to Open Weather site</h1>
		<p>Let's take a look at weather in your city</p>
		
		<div id="div1">
		</div>
		
<!--		<form class="navbar-form navbar-left" role="search">
			<div class="form-group">
				<div class="input-group">
					
					<span class="input-group-addon" >
						<i class="glyphicon glyphicon-certificate"></i>
					</span>
					<input id="city" class="form-control" type="text" placeholder="City" name="City"/>
				</div>
				<input id="code" type="text" class="form-control" placeholder="Country code" name="code"/>
			</div>
			<button id="weather" type="button" class="btn btn-default">Go!</button>
		</form>
		-->
	

		
		<form class="navbar-form navbar-left" role="search">
			<div class="form-group">
				<div class="input-group">			
					<span class="input-group-addon" >
						<i class="glyphicon glyphicon-certificate"></i>
					
					</span>
					<select id="citySelector"class="selectpicker"  class="form-control" type="text" placeholder="City" name="city" >
						<optgroup label="United Kingdom">
							<option  value="UK">London</option>
							<option   value="UK">Liverpool</option>
							<option   value="UK">Manchester</option>
						</optgroup>
						<optgroup label="Bosnia">
							<option  value="BA">Sarajevo</option>
							<option  value="BA">Zenica</option>
							<option  value="BA">Banja Luka</option>
						</optgroup>
						<optgroup label="Serbia">
							<option   value="RS">Belgrade</option>
							<option   value="RS">Kragujevac</option>
							<option   value="RS">Valjevo</option>
						</optgroup>
					</select>
				</div>
				<input id="code" type="text" class="form-control" placeholder="Country" value="UK" />
			</div>
			<button id="weather" type="button" class="btn btn-default">Go!</button>
		</form>
		
		<div id="myform" style="display:none" img src="http://icons.iconarchive.com/icons/large-icons/large-weather/512/partly-cloudy-day-icon.png">
			<table class="table table-striped table-bordered ">
				<thead>
					<tr>
						<tr><td>Wind Speed</td><td id="wind" ></td></tr>
						<tr><td>Cloudiness</td><td id="clouds">/td></tr>
						<tr><td>Pressure</td><td id="pressure"></td></tr>
						<tr><td>Humidity</td><td id="humidity"></td></tr>
						<tr><td>Minimum Temperature</td><td id="temp_min"></td></tr>
						<tr><td>Maximum Temperature</td><td id="temp_max"></td></tr>
						<tr><td>Sunrise</td><td id="sunrise"></td></tr>
						<tr><td>Sunset</td><td id="sunset"></td></tr>
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