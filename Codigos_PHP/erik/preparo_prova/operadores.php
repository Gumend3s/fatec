<?php
// 1. Declaramos uma variável original com um valor.
$variavel_original = "Pizza de Calabresa";
echo "Valor do pedido original: " . $variavel_original . "<br>";
echo "--------------------------------------------------<br>";

// 2. Criamos uma nova variável 'atalho_pedido' e a atribuímos POR REFERÊNCIA.
// Agora, '$atalho_pedido' e '$variavel_original' são dois nomes para o mesmo valor.
$atalho_pedido = &$variavel_original;

// 3. Vamos alterar o valor usando a referência 'atalho_pedido'.
echo "Cliente ligou e mudou o pedido através do atalho.<br>";
$atalho_pedido = "Pizza de Quatro Queijos";

$y = 2;
$x = 5;

$x = &$y;
$x = &$y;

echo "teste".$x;

// 4. Agora, vamos verificar o valor de AMBAS as variáveis.
echo "--------------------------------------------------<br>";
echo "Valor do atalho_pedido: " . $atalho_pedido . "<br>";
echo "Valor do pedido ORIGINAL: " . $variavel_original . "<br>";

?>