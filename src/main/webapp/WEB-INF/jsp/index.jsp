<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>  
<script type="text/javascript" >
$(document).ready(function(){  
  /*$("button").click(function(){
	  	alert('click');
	    $.post("http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products",
	    {
	    	rows: "9",
	    	sort: "lastModified",
	    	start: "0",
	    	tag: "lclonline/Product_Category/Grocery",
	    	view: "grid"
	    },
	    function(data, status){
	        alert("Data: " + data + "\nStatus: " + status);
	    });
	    alert('click');
	});*/
	
	$('#json').click(function(){ 
        alert('json');
         $.getJSON("http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products",
         function(data) {
            alert(data);         
          });   
    });

    $('#ajax').click(function(){ 
        /*alert('ajax');
         $.ajax({ 
             type: "POST",
             dataType: "json",
             url: "http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products",
             data: "{start:'81',rows:'9',sort:'lastModified',view:'grid',tag:'lclonline/Product_Category/Grocery'}",
             contentType: "application/x-www-form-urlencoded",
             async: true,
             cache: false,
             success: function(data){        
                alert(data);
             }
         });*/
         
         $.post("http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products", { start:"81",rows:"9",sort:"lastModified",view:"grid",tag:"lclonline/Product_Category/Grocery"},
     		    function(returnedData){
        	 alert('ajax');
     		         console.log(returnedData);
     		});
    });

});
  </script>
</head>
<body>
  Hello World!!
  <form:form method="POST"  action="/json-db-translation/service">
  	<input type="submit" value="action"/>
  </form:form>
    <button> click</button><br/>
  <button id="ajax">ajax call</button>
  <button id="json">json</button>
  
<script type="text/javascript" >
  
   
/*$(document).ready(function(){
$("#vehicle-information-number").blur(function () {
var vin =  $("#vehicle-information-number").val();
   var contextRoot = "<%=request.getContextPath()%>"
   var requestPost = start=63&rows=9&sort=lastModified&view=grid&tag=lclonline/Product_Category/Grocery
   var url = http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products
   
    validateVINBasedOnVINCode(vin,contextRoot);
});
});

function validateVINBasedOnVINCode(value,contextRoot) {
$.ajax({
   url: contextRoot+"/validateVIN",
   type: 'POST',
   dataType: 'json',
   data: "{\"id\":\"4\",\"method\":\"autofillBasedOnVIN\",\"params\":[\""+ value + "\"],\"jsonrpc\":\"2.0\"}",
   contentType: 'application/json',
   mimeType: 'application/json',
   success: function(data) {
    $('#vehicle-make').val(data.make);
    $('#vehicle-model').val(data.model);
    $('#vehicle-year').val(data.year);
   },
   error:function(data,status,er) {
       alert("error: "+data+" status: "+status+" er:"+er);
   }
});
}*/
</script>
</body>
</html>