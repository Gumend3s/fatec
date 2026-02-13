const input = require("prompt-sync")();
 
var base = parseFloat(input("Digite o valor inicial:"));
var fees = parseFloat(input("Digite a porcentagem juros mensal:")) / 100;
var months = parseFloat(input("Digite a quantidade de meses de juros:"));
 
var parcel = calculateFees(base, fees, months);

console.log("O valor da parcela final é: " + parcel.toFixed(2));

function calculateFees (base, fees, months){
    var result;
    result = (base * fees) / (1 - Math.pow(1 + fees, -months))
   return result;
}
calculateFees (base, fees, months);
