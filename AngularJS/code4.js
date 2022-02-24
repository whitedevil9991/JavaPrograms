<html lang="en">
<head>
<title>jQuery Get the Value of an Input Text Box</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
$(document).ready(function(){
    // Get value on button click and show alert
    $("#b").click(function(){
        var str = $("#a").val();
        var s=$("#t1").val();

        alert(str);
alert(s);

    });
});
</script>
</head>
    <body bgcolor=lightblue>
     Enter your language <input type="text" id="a"><br>
     Enter your Batch time<input type="text" id="t1"><br>
    <button type="button" id="b">Show Value</button>
    </body>
</html>