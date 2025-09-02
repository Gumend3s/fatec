<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo de uso do PHP</title>
</head>
<body>
    <?php //inicio de bloco PHP
    $a = array("Tales", "Thiago", "Sempre Vale na Chuva");
    $a1 = array("cliente 1", 3=>"cliente 2", "cliente 3");
    $a2 = array("cliente 1" => 1000, "cliente 2" => 5000, "cliente 3" => 0);
    $a3 = array("cliente 1" =>
                array ("endereço" => "Rua 1",
                    "bairro" => "Centro"),
                "cliente2" =>
                array("endereço" => "Rua 2",
                    "bairro" => "Vila Santos"));
    echo "<pre>";
    print_r($a);
    print_r($a1);
    print_r($a2);
    print_r($a3);
    echo "</pre>";

?> <!-- fim do bloco PHP
        comentario no HTML-->
</body>
</html>