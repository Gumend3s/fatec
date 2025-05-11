//Gustavo Mendes Oliveira - 2760482421030
//Rodrigo Cabello Ferraz de Toledo - 2760482421022

let animais = ["camelo", "cavalo", "gata", "aguia", "onça", "pomba", "coruja", "mocho", "jacare", "cobra"];

function a(animais)
{
    let animais_a = ["sabiá", "bentevi"];
    
    for(let i = 0; i < animais.length; i++){
        animais_a.push(animais[i]);
    }
    console.log(animais_a);
}

a(animais)

function b(animais){
    let animais_b = [];
    animais_b.push(animais[8], animais[9]);
    console.log(animais_b);
}
b(animais)