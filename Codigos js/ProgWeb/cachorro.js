const prompt = require("prompt-sync")();

let dog = Number(prompt("Digite o consumo dirio(g): "));
let bag = Number(prompt("Digite o peso do pacote(Kg): ")) * 1000;

console.log("O pacote dura", bag/dog , "dias");