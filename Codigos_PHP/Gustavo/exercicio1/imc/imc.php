<?php
    $altura = $_POST["altura"];
    $peso = $_POST["peso"];

    $imc = $peso/($altura*$altura);

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

    echo '<h2>Seu imc é: ' , ($imc) , '</br>
              Sua classificação é: ' , ($classificacao) , '</h2>';
    echo '
        <form>
            <input type="button" value="Voltar" onclick="history.back()">
        </form>
        '
?>
