<?php
if ($_POST) {
    $peso = floatval($_POST['peso']);
    $altura = floatval($_POST['altura']);
    
    if ($peso > 0 && $altura > 0) {
        $imc = $peso / ($altura * $altura);
        
        if ($imc < 18.5) {
            $categoria = "Baixo peso";
        } elseif ($imc < 25) {
            $categoria = "Peso normal";
        } elseif ($imc < 30) {
            $categoria = "Sobrepeso";
        } else {
            $categoria = "Obesidade";
        }
        
        $imc_formatado = number_format($imc, 1);
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
    <title>Resultado IMC</title>
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
        
        .imc {
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
    <h1>Resultado do IMC</h1>
    
    <?php if (isset($imc_formatado)): ?>
        <div class="resultado">
            <div class="imc">IMC: <?php echo $imc_formatado; ?></div>
            <div><?php echo $categoria; ?></div>
        </div>
    <?php elseif (isset($erro)): ?>
        <div class="resultado erro">
            <?php echo $erro; ?>
        </div>
    <?php endif; ?>
    
    <div style="text-align: center;">
        <a href="calculadora_IMC.html" class="voltar">Calcular Novamente</a>
    </div>
</body>
</html>