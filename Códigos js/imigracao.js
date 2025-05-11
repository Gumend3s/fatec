const prompt = require("prompt-sync")();

let origem = prompt("Digite o seu pais de origem: ");
var destino = prompt("Digite o seu pais atual: ");

if(origem != destino)
{
    console.log("Você é estrangeiro no país: " + destino);
    console.log("Você é natural de: " + origem);
} else 
{
    console.log("Você está no seu país de origem");
}
