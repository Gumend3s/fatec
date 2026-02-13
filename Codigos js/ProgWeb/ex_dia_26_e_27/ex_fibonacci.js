function fibonacci(){
    var current = 1, previous = 1, aux = 0;
    var odd = [], even = [];

    for(let i = 0; current<600; i++){
        if (current % 2 == 0){
            even.push(current);
        }else{
            odd.push(current);
        }

        aux = current;
        current = current + previous;
        previous = aux;
    }
    console.log("A quantidade de números pares é: " + odd);    
    console.log("A quantidade de números ímpares é: " + even);
}
fibonacci();