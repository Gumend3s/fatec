const prompt = require("prompt-sync")();

let num = Number(prompt("Digite um numero: "));
let i, test = true;

for(i = 2; i <= num/2; i++)
{
    console.log(num % i);
    if(num % i == 0)
    {
        test = false;
        break;
    }
}

if(test) console.log("Numero primo");
else console.log("Numero nao primo");