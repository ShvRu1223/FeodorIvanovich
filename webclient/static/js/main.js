function onTestGetButtonClick(){


    var httpRequest= new XMLHttpRequest();
    httpRequest.onreadystatechange=function(e){
        if(this.readyState === XMLHttpRequest.DONE &&this.status === 200){
            var json = JSON.parse(httpRequest.responseText);
            document.getElementById("server_response_section").innerHTML=json.location;
        }
    }

    httpRequest.open("POST", "/api/testpost", true);
    var requestJson={
            text : document.getElementById("test_input").value,
            location : location.host,
            protocol : location.protocol
        };
    httpRequest.send(JSON.stringify(requestJson));
}