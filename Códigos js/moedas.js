// Gustavo Mendes Oliveira  - 2760482421030
// Guilerme Maciel Teixeira - 2760482421013

const prompt = require("prompt-sync")();

let qtd = Number(prompt("Digites quantas moedas serão jogadas: "));

function coin()
{
    if(Math.random() < 0.5) return "Cara";
    return "Coroa";
}

let i;
for(i; i < 10; i++) console.log(coin);