<html>
	<head>
	
		<script type="text/javascript" src= "http://code.jquery.com/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src= "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		<script type="text/javascript" src= "http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.5/js/bootstrap-select.min.js"></script>
		<script src="http://code.highcharts.com/stock/highstock.js"></script>
		<script src="http://code.highcharts.com/stock/modules/exporting.js"></script>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.5/css/bootstrap-select.min.css"></link>	

		<script type="text/javascript" >
			$(document).ready(function () {
				drawChart("Sarajevo")
			});
			function drawChart(city){
				$.ajax({url: "chart/city/" + city, success: function(result){
					alert(result);
			       
					var object=JSON.parse(result);
						
					

					$('#container').highcharts('StockChart', {
						rangeSelector : {
							selected : 1
						},

						title : {
							text : 'Daily temperature change(Celsius)'
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
		<div id="container" style="height:400px; min-width: 310px"></div>
	</body>
</html>