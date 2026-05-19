
let resul = "";

function Zerar(){
    document.getElementById("resposta").innerHTML = "";
    numero = "";
    resul = "";
    num = "";
}
function digito(num){
    let numero = document.getElementById("resposta").innerHTML;
    document.getElementById("resposta").innerHTML = numero + num;
    resul = numero += num

}
function calcular(){
    document.getElementById("resposta").innerHTML = eval(resul);
}