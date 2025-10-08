<?php
$localhost = "localhost";
$usuarios = "admim";
$senha = "OE/wAJ-W*p6VBA@(";
$base = "gestao";

$conecao = new mysqli($localhost,$usuarios,$senha,$base);

if($conecao){
    die("Falha conexão". $conecao->connect_error);
    echo "Foi mal";
}

?>