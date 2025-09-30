<!-- 
    Gustavo Mendes Oliveira
    RA: 2760482421030
-->
<?php
    $curso = $_POST["curso"];

    if($curso == "python") {
        $local = "laboratório 13";
        $curso = "Python";
    } else if ($curso == "arduino") {
        $local = "laboratório 16";
        $curso = "Arduino";
    } else if ($curso == "robotica") {
        $local = "laboratório 15";
        $curso = "Robótica";
    } 
    
    echo 'Sua inscrição no curso de ', $curso, ' foi realizada com sucesso. Seu curso será dia 20/04/2025 às 09h00 no ', $local , '.';
?>