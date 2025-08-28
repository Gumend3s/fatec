<?php
    $valor = $_POST["valor"];
    $inicial = (float) $_POST["inicial"];
    $final = (float) $_POST["final"];

    echo '<h2>O resultado da conversão é: ' , ($valor * $final / $inicial) , '$</h2>';
    echo '
        <form>
            <input type="button" value="Voltar" onclick="history.back()">
        </form>
        '
?>
