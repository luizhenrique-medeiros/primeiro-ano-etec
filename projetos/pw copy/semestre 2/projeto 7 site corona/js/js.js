document.getElementById('grava').addEventListener('click', grava);

let totalEntrevistados = 0;
let totalFebris = 0;
let grupoRisco = 0;
let febrisRisco = 0;
let masculino = 0;
let feminino = 0;
var se = 0;

function grava() {
    const nome = document.getElementById("naime").value;
    const idade = parseInt(document.getElementById("age").value);
    const genero = document.getElementById("gender").value;
    const temperatura = parseFloat(document.getElementById("temperature").value);
    const origem = document.getElementById("origin").value;
    var porc;
    var porc2;
    var porc3; 

         
		


    if (!nome || !idade || !temperatura) {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    totalEntrevistados++;

    if (temperatura >= 37.5) {
        totalFebris++;
    }
    else if(temperatura <= 35.9){
        totalFebris++;
    }
    
    if(temperatura >= 40){
        alert("Você está com hipertermia, vá a um medico imediatamente")
    }
    else if(temperatura <= 35){
        alert("Você está com hipotermia, vá a um médico imediatamente ")
    }

    if (idade >= 60) {
        grupoRisco++;

        if (temperatura >= 37.5) {
            febrisRisco++;
        }
        else if(temperatura <= 35.9){
            febrisRisco++;
        }
    }

    if (genero === "masculino") {
        masculino++;
    } else if (genero === "feminino") {
        feminino++;
    
    }
  
    

		localStorage.setItem("nome" + se, nome);
		localStorage.setItem("idade" + se, idade);
		localStorage.setItem("genero" + se, genero);
		localStorage.setItem("temperatura" + se, temperatura);
        localStorage.setItem("origem" + se, origem);

          se++;


    porc = (totalFebris/totalEntrevistados*100).toFixed(2);
    porc2 = (grupoRisco/totalEntrevistados*100).toFixed(2);
    porc3 = (febrisRisco/totalEntrevistados*100).toFixed(2);

    document.getElementById("entre").innerText = totalEntrevistados;
    document.getElementById("toF").innerText = totalFebris;
    document.getElementById("toF2").innerText = porc+"%";
    document.getElementById("Grisc").innerText = grupoRisco;
    document.getElementById("Grisc2").innerText = porc2+"%";
    document.getElementById("Frisc").innerText = febrisRisco;
    document.getElementById("Frisc2").innerText = porc3+"%";
    document.getElementById("masc").innerText = masculino;
    document.getElementById("fem").innerText = feminino;

   
}

function pasta(){

    var conteudo ="";
    var conteudo1 ="";
    var conteudo2 ="";
    var conteudo3 ="";
    var conteudo4 ="";

    for(i=0;i<99;i++){
        if( localStorage.getItem("nome" + i) != null){
    
    conteudo+="<p>"+   localStorage.getItem("nome" + i)+"</p>";
    conteudo1+="<p>"+   localStorage.getItem("idade" + i)+"</p>";
    conteudo2+="<p>"+   localStorage.getItem("temperatura" + i)+"</p>";
    conteudo3+="<p>"+   localStorage.getItem("origem" + i)+"</p>";
    conteudo4+="<p>"+   localStorage.getItem("genero" + i)+"</p>";
        }
        }

        document.getElementById("MYNAME").innerHTML = conteudo;
        document.getElementById("MYAGE").innerHTML = conteudo1;
        document.getElementById("MYGENDER").innerHTML = conteudo4;
        document.getElementById("MYTEMP").innerHTML = conteudo2;
        document.getElementById("MYORI").innerHTML = conteudo3;
    }


     


    function limpa(){
        localStorage.clear();
    }
    
    