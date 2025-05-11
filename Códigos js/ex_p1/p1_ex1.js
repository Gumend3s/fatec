//Gustavo Mendes Oliveira - 2760482421030
//Rodrigo Cabello Ferraz de Toledo - 2760482421022

function a()
{
    let x = [];
    let i, j;
    for(i = 0; i < 10; i++)
    {
        for(j = 0; j < 5; j++)
        {
            x[j] = Math.round(Math.random()*9) + 1 
        }
        console.log(x);
    }
}

function b()
{
    let x = [];
    let i, j;
    for(i = 0; i < 10; i++)
    {
        let y = []
        for(j = 0; j < 5; j++)
        {
            y[j] = Math.round(Math.random()*9) + 1 
        }
        x.push(y)
    }
    return x;
}

function c(seqs)
{
    let i, j, x = [];
    for(i = 0; i < 10; i++)
    {
        let mult = 1
        for(j = 0; j < 5; j++)
        {
            mult *= seqs[i][j]
        }
        x.push(mult)
    }

    return x
}

function d(seqs, mults)
{
    let i, menor = 0;

    for(i = 1; i < 10; i++)
    {
        if(mults[i] < mults[menor]) menor = i;
    }

    console.log(`Menor multiplicação: ${mults[menor]} gerada pela sequencia`, seqs[menor])
}

function ex_1()
{
    a()

    seqs = b()
    mults = c(seqs)
    
    console.log("Todas as sequencias:", seqs, "Todas as multiplicações:", mults)

    d(seqs, mults)
}

ex_1()