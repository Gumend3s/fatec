<?php
    $p1 = $_POST["p1"] * 0.35;
    $p2 = $_POST["p2"] * 0.35;
    $ai1 = $_POST["ai1"] * 0.15;
    $ai2 = $_POST["ai2"] * 0.15;
    $frequencia = $_POST["frequencia"];

    $media = number_format($p1 + $ai1 + $p2 + $ai2, 1);

    echo '<h2>Média: ' , ($media) , '<br>';
    echo 'Frequência: ' , ($frequencia) , '%<br>';
    if ($media > 6) {
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
