let min = 0, max = 10, qtd = 200, i, rnd;
let numbers = [];

for(i = 0; i < qtd; i++)
{
    numbers.push(Math.floor(Math.random() * (max - min + 1)) + min);
}

let high = numbers[1], low = numbers[1]

for(i = 1; i < qtd; i++)
{
    if(numbers[i] < low) low = numbers[i];
    if(numbers[i] > high) high = numbers[i];
}

console.log("Menor:", low, "\nMaior:", high);