function binas() {
    var chamado = document.getElementById("receba").value;
    var num = 0;
    var base = 1;
    var i;

    for (i = chamado.length - 1; i >= 0; i--) {
        var digit = chamado.charCodeAt(i) - 48; 
        num += digit * base;
        base *= 10;
    }

    var binario = [];
    var index = 0;

  
    if (num === 0) {
        binario[index] = 0;
        index++;
    } else {
     
        while (num > 0) {
            binario[index] = num % 2;
            num = (num - (num % 2)) / 2;
            index++;
        }
    }

   
    var binariostr = "Seu número binário é: ";
    for (i = index - 1; i >= 0; i--) {
        binariostr += binario[i];
    }

    document.getElementById("linear").innerHTML = "<p>" + binariostr + "</p>";
}
