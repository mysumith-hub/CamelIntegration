
function load(){
	
	$.ajax({
    	type: "get",
        url: "camel/hello",
        dataType: "json",
        contentType: "application/json"
    }).then(function(data) {
    	window.alert("hello");
    	var tr = "<tr id = firstTable_><td><b><u>AppName</u></b></td><td><b><u>Version</u></b></td><td><b><u>GreenBuild</u></b></td><td><b><u>Stage-1</u></b></td></tr>";
    	$('#firstTable tbody').append(tr);
    	
    });	
}
