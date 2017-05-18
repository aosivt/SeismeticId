// Double[][] dataChart, String nameChart,
function renderChart(dataChart, nameChart, resolutionDisplay){
  var tempArray = JSON.parse(dataChart);
  var tracerts = [];
 
 console.log("sfdgsfdg");
//  alert(dataChart);

// console.log(dataChart);
for(var elementArray in tempArray){
// dataChart.forEach(function(elementArray) {

tracerts.push({
   y: tempArray[elementArray],
   mode: 'lines+markers',
   name: 'Scatter + Lines'
 });

}

//alert(data[0]);
//  var trace1 = {

  //  y: data,

  //  mode: 'lines+markers',
  //  name: 'Scatter + Lines'
//  };


 var renderData = tracerts;

 var layout = {
   title:'Расчетное значение',
   height: 600,
   width: 720
 };

 $("#"+nameChart).renderData;
 Plotly.newPlot(nameChart, renderData, layout, 
   {
    transition: {
      duration: 500,
      easing: 'cubic-in-out',
    
    }
  });
}