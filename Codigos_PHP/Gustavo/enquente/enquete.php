<?php
    $voto = $_POST["voto"];

    $cedulas = array("PHP" => 0, "Java" => 0, "Python" => 0, "JavaScript" => 0, "C#" => 0, );

    $cedulas[$voto]++;

    foreach($cedulas as $cedula => $valor) echo $cedula , ": " , $valor , "<br>";

    echo '
        <form>
            <input type="button" value="Voltar" onclick="history.back()">
        </form>
        '
?>
