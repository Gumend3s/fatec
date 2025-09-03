<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $p1 = $_POST["p1"];
    $ai1 = $_POST["ai1"];
    $p2 = $_POST["p2"];
    $ai2 = $_POST["ai2"];
    $freq = $_POST["freq"];

    if (!is_numeric($p1) || !is_numeric($ai1) || !is_numeric($p2) || !is_numeric($ai2) || !is_numeric($freq)) {
        echo "<p style='color:red; font-weight:bold;'>Erro: insira apenas valores numéricos.</p>";
        exit;
    }

    if ($freq < 0 || $freq > 100) {
        echo "<p style='color:red; font-weight:bold;'>Erro: a frequência deve estar entre 0 e 100.</p>";
        exit;
    }

    $media = (($p1 + $ai1) + ($p2 + $ai2)) / 2;

    if ($media >= 6 && $freq >= 75) {
        $situacao = "Aprovado ";
    } elseif ($media >= 6 && $freq < 75) {
        $situacao = "Reprovado por frequência ";
    } elseif ($media < 6 && $freq >= 75) {
        $situacao = "Reprovado por nota ";
    } else {
        $situacao = "Reprovado por nota e frequência ";
    }
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Resultado Final</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #4facfe, #00f2fe);
            color: #333;
        }

        .container {
            background: rgba(255, 255, 255, 0.95);
            padding: 40px 50px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            text-align: center;
            width: 100%;
            max-width: 400px;
        }

        h2 {
            margin-bottom: 20px;
        }

        p {
            font-size: 18px;
            margin: 8px 0;
        }

        strong {
            color: #4facfe;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            text-decoration: none;
            background-color: #4facfe;
            color: white;
            border-radius: 8px;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #00f2fe;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Resultado Final</h2>
        <p>P1: <?php echo number_format($p1, 1, ',', '.'); ?></p>
        <p>AI I: <?php echo number_format($ai1, 1, ',', '.'); ?></p>
        <p>P2: <?php echo number_format($p2, 1, ',', '.'); ?></p>
        <p>AI II: <?php echo number_format($ai2, 1, ',', '.'); ?></p>
        <p>Frequência: <?php echo $freq; ?>%</p>
        <p>Média Final: <?php echo number_format($media, 1, ',', '.'); ?></p>
        <p>Situação: <strong><?php echo $situacao; ?></strong></p>
        <a href="index.html">Voltar</a>
    </div>
</body>
</html>
<?php
}
?>
