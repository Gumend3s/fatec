<?php
//Rodrigo Cabello Ferraz de Toledo
$nome = $_POST['nome'];
$email = $_POST['email'];
$telefone = $_POST['telefone'];

if(isset($_POST['curso'])){
    $curso = $_POST['curso'];

    if($curso == 'python'){
        echo "Inscrição no curso de Python foi realizada com sucesso. Seu curso será dia 20/04/2025 às 09h00 no laboratório 13";
    }elseif($curso == 'arduino'){
        echo "Inscrição no curso de Arduino foi realizada com sucesso. Seu curso será dia 20/04/2025 às 09h00 no laboratório 16";
    }elseif($curso == 'robotica'){
        echo "Inscrição no curso de Robótica foi realizada com sucesso. Seu curso será dia 20/04/2025 às 09h00 no laboratório 15";
    }
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Curso de Extensão</title>
</head>
<body>
       
    <a href="EX.5.html" class="voltar">RETORNAR</a>
</body>
</html>