<?php
    function calcularIMC($peso, $altura) {
        $imc = number_format($peso/($altura*$altura), 2);

        if ($imc < 18.5) {
            $classificacao = "Abaixo do peso normal";
        } elseif ($imc < 25) {
            $classificacao = "Peso normal";
        } elseif ($imc < 30) {
            $classificacao = "Excesso de peso";
        } elseif ($imc < 35) {
            $classificacao = "Obesidade classe I";
        } elseif ($imc < 40) {
            $classificacao = "Obesidade classe II";
        } else {
            $classificacao = "Obesidade classe III";
        }

        return "Seu imc é: $imc e sua classificação é: $classificacao";
    }

    if($_SERVER["REQUEST_METHOD"]=="POST"){
        $peso = $_POST["peso"];
        $altura = $_POST["altura"];
        echo calcularIMC($peso, $altura);
    }
?>
