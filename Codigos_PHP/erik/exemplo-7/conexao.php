<?php
$localhost = "localhost";
$usuarios = "root";
$senha = "";
$base = "gestao";

$conexao = new mysqli($localhost,$usuarios,$senha,$base);

if($conexao->connect_error){
    die("Falha conexão");
}



?>