<html lang="en">
<head>
<title>jQuery Get the Value of an Input Text Box</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
$(document).ready(function(){
    // Get value on button click and show alert
    $("#b").click(function(){
        var str = $("#a").val();
        document.write(str);
    });
});
</script>
</head>
<body bgcolor=lightblue>
   Enter your Address <textarea rows="15" cols="15" id="a"></textarea><br><br>
   <button type="button" id="b">print the address</button>
</body>
</html>

/*class 24th feb
var method 
how can we access, manipulate the elements of html*/