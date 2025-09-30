<?php
// ---- Exemplo Corrigido de Escopo de Variáveis ----

$valor = 10; // Variável com escopo global

function calcularDobro()
{
    // Esta variável $valor é LOCAL da função, independente da global
    $valor = 6;
    $valor = $valor * 2;
    echo "O valor dentro da função 'calcularDobro' é: " . $valor . "<br>";
}

// Para acessar a variável global de dentro de uma função, usa-se o array $GLOBALS
function mostrarGlobal()
{
    // CORREÇÃO: Acessando a variável global '$valor' através do array $GLOBALS
    echo "Acessando a variável global de dentro da função 'mostrarGlobal': " . $GLOBALS['valor'] . "<br>";
}

echo "Valor ANTES de chamar as funções: " . $valor . "<br>"; // Saída: 10

calcularDobro(); // Saída: O valor dentro da função 'calcularDobro' é: 12

echo "Valor DEPOIS de chamar 'calcularDobro': " . $valor . "<br>"; // Saída: 10 (a global não foi alterada)

mostrarGlobal(); // Saída: Acessando a variável global de dentro da função 'mostrarGlobal': 10
?>