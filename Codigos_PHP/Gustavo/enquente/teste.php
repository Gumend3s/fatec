<?php
// Define o nome do arquivo para armazenar os votos
$arquivo_votos = 'votos.txt';

// Inicializa a contagem de votos
$votos = [
    'PHP' => 0,
    'Java' => 0,
    'Python' => 0,
    'JavaScript' => 0,
    'C#' => 0
];

// Se o arquivo de votos existir, lê o conteúdo
if (file_exists($arquivo_votos)) {
    // Tenta ler o conteúdo do arquivo
    $conteudo = file_get_contents($arquivo_votos);
    // Se a leitura for bem-sucedida, decodifica o JSON e atualiza os votos
    if ($conteudo !== false) {
        $votos_salvos = json_decode($conteudo, true);
        if (is_array($votos_salvos)) {
            $votos = array_merge($votos, $votos_salvos);
        }
    }
}

// Verifica se o formulário foi enviado via POST e se o voto existe
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['linguagem'])) {
    $voto_enviado = $_POST['linguagem'];

    // Incrementa a contagem de votos para a linguagem escolhida
    if (array_key_exists($voto_enviado, $votos)) {
        $votos[$voto_enviado]++;
    }
    
    // Salva a contagem de votos atualizada no arquivo
    file_put_contents($arquivo_votos, json_encode($votos));
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado da Enquete</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .container {
            background-color: #f0f0f0;
            padding: 20px;
            border-radius: 8px;
            width: 350px;
        }
        h2 {
            color: #333;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
            font-size: 18px;
        }
        strong {
            color: #007BFF;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Resultado da Enquete</h2>
        <ul>
            <?php foreach ($votos as $linguagem => $total): ?>
                <li>
                    <strong><?php echo htmlspecialchars($linguagem); ?>:</strong> <?php echo htmlspecialchars($total); ?> votos
                </li>
            <?php endforeach; ?>
        </ul>
        <br>
        <a href="teste.html">Voltar para a enquete</a>
    </div>
</body>
</html>