<?php
    $gasolina = $_POST["gasolina"];
    $alcool = $_POST["alcool"];

    if($alcool / $gasolina < 0.7) {
        echo "<h2>Use álcool</h2>";
    } else {
        echo "<h2>Use gasolina</h2>";
    }
    echo '
        <form>
            <input type="button" value="Voltar" onclick="history.back()">
        </form>
        '
?>
