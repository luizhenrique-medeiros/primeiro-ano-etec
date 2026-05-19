
function calculo() {
        var num = document.getElementById("number").value;
        var resultado = "";

        for (x= 1 ; x <= 10 ; x++ ) {
        resultado += "<p>" + num + "x" + x + "=" + (num*x) + "</p>";
        }

        document.getElementById("linha").innerHTML = resultado;


}