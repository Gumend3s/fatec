<?php
    $p1 = $_POST["p1"];
    $p2 = $_POST["p1"];
    $ai1 = $_POST["ai1"];
    $ai2 = $_POST["ai2"];
    $frequencia = $_POST["frequencia"];

    $media = ((($p1 + $ai1) / 2) + (($p2 + $ai2) / 2)) / 2;

    echo '<h2>Média: ' , ($media) , '<br>';
    echo 'Frequência: ' , ($frequencia) , '%<br>';
    if ($media > 7.5) {
        if ($frequencia > 75) {
            echo "Aluno Aprovado";
        } else {
            echo "Aluno Reprovado por presença";
        }
    } else {
        if ($frequencia > 75) {
            echo "Aluno Reprovado por nota";
        } else {
            echo "Aluno Reprovado por nota e presença";
        }
    }
    echo '</h2>';
    echo '
        <form>
            <input type="button" value="Voltar" onclick="history.back()">
        </form>
        '
?>
