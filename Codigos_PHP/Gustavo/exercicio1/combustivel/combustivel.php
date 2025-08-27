<?php
    $gasolina = $_POST["gasolina"];
    $alcool = $_POST["alcool"];

    if($alcool / $gasolina < 0.7) {
        echo "<h3>Use álcool</h2>";
    } else {
        echo "<h3>Use gasolina</h2>";
    }
?>
