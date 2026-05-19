
function interruptorLamp() {
    const lamp = document.getElementById('#objeto');
    if (lamp == "acende") {
        lamp.src = "imagem/ligada.jpg"; 
        console.log("acesso");
    } else if (lamp == "apagado") {
        lamp.src = "imagem/desligada.jpg"; 
        console.log("apagado");
    }
}