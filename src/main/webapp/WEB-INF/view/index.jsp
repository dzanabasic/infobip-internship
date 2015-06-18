<html>
	<head>
		<script type="text/javascript" src= "http://code.jquery.com/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src= "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		<script type="text/javascript" src= "http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.5/js/bootstrap-select.min.js"></script>
		
		<script src="http://code.highcharts.com/stock/highstock.js"></script>
		<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>
	
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.5/css/bootstrap-select.min.css"></link>
			
		<style>				
			.skyimage {
				width: 40px;
				height: 40px;
			}
		</style>
		<script type="text/javascript" >

			$(document).ready(function(){

				$("#weather").click(function(){
					var code=$("#citySelector").val();
					var city=$("#citySelector :selected").text();
		
					drawChart(city);
			
					$.ajax({url: "index/city/"+city+"/code/"+code, success: function(result){
					
						var object=JSON.parse(result);
			
						var sunriseTime=new Date(object.sys.sunrise*1000);
						var sunsetTime=new Date(object.sys.sunset*1000);

						$("#wind").html(object.wind.speed);

						$("#pressure").html(object.main.pressure);
						$("#cloudsdescription").html(object.weather[0].description);
				
						if(object.weather[0].description=="Sky is Clear"){
							$("#skyimage").html('<img class="skyimage" src="http://icons.iconarchive.com/icons/large-icons/large-weather/512/partly-cloudy-day-icon.png"/>');		
						}
						else if(object.weather[0].description=="few clouds"){
							$("#skyimage").html('<img class="skyimage" src="http://www.psdgraphics.com/file/weather-icon.jpg"/>');
						}
						else{
							$("#skyimage").html('<img class="skyimage" src="http://www.psdgraphics.com/file/weather-icon.jpg"/>');
						}
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
			
			function drawChart(city){
				$.ajax({url: "chart/city/" + city, success: function(result){
			       
					var object=JSON.parse(result);

					$('#container').highcharts('StockChart', {
						rangeSelector : {
							selected : 1
						},

						title : {
							text : 'Daily temperature change(3h)'
						},

						series : [{
							name : 'Temperature',
							data: object,
							tooltip: {
								valueDecimals: 3
							}			
					   }]
					});

					}
				});
			}

		</script>
	</head>
	<body>
		<div id="icon"></div>
		<h1>Welcome to Open Weather site</h1>
		<p>Let's take a look at weather in your city</p>
		
		<form class="navbar-form navbar-left" role="search">
			<div class="form-group" class="skyimage">
				<div class="input-group">			
					<span class="input-group-addon" >
						<i class="glyphicon glyphicon-certificate"></i>
					
					</span>
					<select id="citySelector"class="selectpicker"  class="form-control" type="text" placeholder="City" name="city" >
						<optgroup label="United Kingdom">
							<option   value="UK">London</option>
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
		
		<div id="myform" style="display:none">
			<table class="table table-striped table-bordered ">
				<tbody>
					<tr><td>Wind Speed</td><td id="wind" ></td></tr>
					<tr>
						<td>Cloudiness</td>
						<td id="clouds">
							<div id="cloudsdescription"></div>
							<div id="skyimage" class="skyimage"></div>
						</td>
					</tr>
					<tr><td>Pressure</td><td id="pressure"></td></tr>
					<tr><td>Humidity</td><td id="humidity"></td></tr>
					<tr><td>Minimum Temperature</td><td id="temp_min"></td></tr>
					<tr><td>Maximum Temperature</td><td id="temp_max"></td></tr>
					<tr><td>Sunrise</td><td id="sunrise"></td></tr>
					<tr><td>Sunset</td><td id="sunset"></td></tr>
				</tbody>					
			</table>	
		</div>
		
		<div id="container" style="height:400px; min-width: 310px"></div>
	</body>
</html>