<?php


$num1 = $_POST["num1"];
$num2 = $_POST["num2"];

$operacao = $_POST["operacao"];

switch ($operacao) {
    case "somar":
        echo'<h1>',($num1+$num2),'</h1>';
        break;
    case"subtrair":
        echo '<h1>' , ($num1 - $num2) , '</h1>';
        break;
    case "multiplicar":
        echo '<h1>' , ($num1 * $num2) , '</h1>';
        break;
    case "dividir":
        echo '<h1>' , ($num1 / $num2) , '</h1>';
        break;
}

?>