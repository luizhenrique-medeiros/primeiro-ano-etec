let cont = 0;
function interruptorLamp() {
    let lamp = document.querySelector('#objeto');
    if (lamp.src.includes("desligada.jpg")) {
        lamp.src = "imagem/ligada.jpg"; 
        console.log("acesso");
    } else if (lamp.src.includes("ligada.jpg")) {
        lamp.src = "imagem/desligada.jpg"; 
        console.log("apagado");
    }
    cont++
    if (cont > 10) {
        lamp.src = "imagem/quebrada.jpg"
    }
}
