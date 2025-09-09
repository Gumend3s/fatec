<?php
    $arquivo_votos = 'votos.txt';
    $cedulas = ["PHP" => 0, "Java" => 0, "Python" => 0, "JavaScript" => 0, "C#" => 0, ];

    if (isset($_POST['enviar']))  {
        $voto = $_POST["voto"];
        
        if (file_exists($arquivo_votos)) {
            $cedulas = array_merge($cedulas, json_decode(file_get_contents($arquivo_votos), true));
        }
        $cedulas[$voto]++;
    }

    if (isset($_POST['resultados'])) {
        if (file_exists($arquivo_votos)) {
            $cedulas = array_merge($cedulas, json_decode(file_get_contents($arquivo_votos), true));
        }
        foreach($cedulas as $cedula => $valor) echo $cedula , ": " , $valor , "<br>";

        echo '
            <form>
                <input type="button" value="Voltar" onclick="history.back()">
            </form>
            ';
    } else {
        file_put_contents($arquivo_votos, json_encode($cedulas));
        echo '<script>history.back();</script>';
    }
?>
