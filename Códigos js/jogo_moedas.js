// Gustavo Mendes Oliveira - 2760482421030
// Matheus Henrique Souza Trindade - 2760482421006

const prompt = require("prompt-sync")();

const entradaUsuario = () => {
    let qtdMoedas = Number(prompt("Quantas moedas serão lançadas?: "));
    let qtdJogadas = Number(prompt("Quantas serão as jogadas?: "));

    return [qtdMoedas, qtdJogadas]
}

const geraMoedas = () => {
    if(Math.random() > 0.5) return "Cara";
    return "Coroa";
}

const geraJogadaInicial = (tam) => {
    let joagada = [];
    for (let i = 0; i < tam; i++) {
        joagada.push(geraMoedas());
    }
    return joagada;
}

const geraJogadaGeral = (tam, jogadas, qtdJogadas) => {
    let novaJogada = [];

    do {
        novaJogada = geraJogadaInicial(tam);
    } while(evitarJogadaRepetida(jogadas, novaJogada, qtdJogadas, tam))

    return novaJogada;
}

const comparaJogadas = (jogada1, jogada2, tam) => {
    for (let i = 0; i < tam; i++) {
        if (jogada1[i] !== jogada2[i]) return false;
    }
    return true;
}

const evitarJogadaRepetida = (jogadas, novaJogada, qtdJogadas, qtdMoedas) => {
    for (let i = 1; i < qtdJogadas; i++) {
        if (comparaJogadas(jogadas[i], novaJogada, qtdMoedas)) return true;
    }
    return false;
}

const publicaResultado = (acertou, qtdJogadas) => {
    if(!acertou)
    {
        console.log("Você perdeu, correspondência não encontrada")
    } else {
        console.log(`Você Ganhou, sequência reecontrada após ${qtdJogadas} jogadas`)
    }
}

const simuladorJogaMoedas = (qtdMoedas, qtdJogadas) => {
    var jogadas = [];
    
    jogadas[0] = geraJogadaInicial(qtdMoedas);
    console.log(`Jogada inicial: ${jogadas[0]}`)

    for(let i = 1; i <= qtdJogadas; i++)
    {
        jogadas.push(geraJogadaGeral(qtdMoedas, jogadas, i));

        console.log(`Jogada ${i}: ${jogadas[i]}`)

        if(comparaJogadas(jogadas[0], jogadas[i], qtdMoedas))
        {
            publicaResultado(true, i);
            return true;
        }
    }
    return false;
}

var [qtdMoedas, qtdJogadas] = entradaUsuario() 

if(!simuladorJogaMoedas(qtdMoedas, qtdJogadas)) publicaResultado(false);
