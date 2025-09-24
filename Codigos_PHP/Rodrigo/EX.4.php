<?php
//Rodrigo Cabello Ferraz de Toledo
$nome = $_POST['nome'];
$email = $_POST['email'];
$telefone = $_POST['telefone'];

if(isset($_POST['curso'])){
    $curso = $_POST['curso'];

    if($curso == 'musculacao'){
        echo "Inscrição no curso de Musculação foi realizada com sucesso. Seu curso iniciará dia 20/04/2025 às 09h00 na academia";
    }elseif($curso == 'natacao'){
        echo "Inscrição no curso de Natação foi realizada com sucesso. Seu curso iniciará dia 20/04/2025 às 09h00 na piscina";
    }elseif($curso == 'artes_marciais'){
        echo "Inscrição no curso de Artes Marciais foi realizada com sucesso. Seu curso será dia 20/04/2025 às 09h00 no ginásio";
    }
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Academia</title>
</head>
<body>
       
    <a href="EX.4.html" class="voltar">RETORNAR</a>
</body>
</html>