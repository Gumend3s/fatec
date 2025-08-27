<?php
if ($_POST) {
    $p1 = floatval($_POST['p1']);
    $p2 = floatval($_POST['p2']);
    $ai1 = floatval($_POST['ai1']);
    $ai2 = floatval($_POST['ai2']);
    $freq = floatval($_POST['freq']);
    
    if ($p1 >= 0 && $ai1 >= 0 && $p2 >= 0 && $ai2 >= 0 &&
        $p1 <= 10 && $ai1 <= 10 && $p2 <= 10 && $ai2 <= 10) {
        $media = (($p1 + $ai1) + ($p2 + $ai2)) / 4;
        
        if ($media >= 6 && $freq >= 75) {
            $categoria = "Aprovado";
        } elseif ($media >= 6 && $freq < 75) {
            $categoria = "Reprovado por frequencia";
        } elseif ($media < 6 && $freq >= 75) {
            $categoria = "Reprovado por nota";
        } else {
            $categoria = "Reprovado por nota e frequência";
        }
        
        $media_final = number_format($media, 1);
    } else {
        $erro = "Por favor, insira valores válidos.";
    }
}
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Media final</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background: #f5f5f5;
            color: #333;
        }
        
        h1 {
            text-align: center;
            margin-bottom: 30px;
            color: #555;
            font-weight: normal;
        }
        
        .resultado {
            background: white;
            padding: 15px;
            border-radius: 4px;
            margin-bottom: 20px;
            border-left: 3px solid #666;
            text-align: center;
        }
        
        .media {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 5px;
        }
        
        .erro {
            background: #ffe6e6;
            border-left-color: #d33;
            color: #d33;
        }
        
        .voltar {
            display: inline-block;
            padding: 8px 16px;
            background: #666;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        
        .voltar:hover {
            background: #555;
        }
    </style>
</head>
<body>
    <h1>Media final</h1>
    
    <?php if (isset($media_final)): ?>
        <div class="resultado">
            <div class="media">Media final: <?php echo $media_final; ?></div>
            <div><?php echo $categoria; ?></div>
        </div>
    <?php elseif (isset($erro)): ?>
        <div class="resultado erro">
            <?php echo $erro; ?>
        </div>
    <?php endif; ?>
    
    <div style="text-align: center;">
        <a href="boletim.html" class="voltar">Calcular Novamente</a>
    </div>
</body>
</html>