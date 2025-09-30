<!-- 
    Gustavo Mendes Oliveira
    RA: 2760482421030
-->
<?php
    $curso = $_POST["curso"];

    if ($curso == "artesmarciais") {
        echo 'Sua inscrição no curso de Artes Marciais foi realizada com sucesso. Seu curso será dia 20/04/2025 às 09h00 no ginásio.';
    } else {
        if($curso == "musculacao") {
        $local = "academia";
        $curso = "Musculaçao";
        } else if ($curso == "natacao") {
            $local = "piscina";
            $curso = "Natação";
        } 
        echo 'Sua inscrição no curso de ', $curso, ' foi realizada com sucesso. Seu curso se iniciará dia 20/04/2025 às 09h00 na ', $local , '.';
    }
?>