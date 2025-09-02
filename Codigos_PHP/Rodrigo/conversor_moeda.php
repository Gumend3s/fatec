<?php
// Cotações das moedas (valores aproximados - em um sistema real, viriam de uma API)
$cotacoes = [
    'dolar' => 5.20,
    'euro' => 5.65,
    'libra' => 6.45
];

$nomes_moedas = [
    'dolar' => 'Dólares Americanos (USD)',
    'euro' => 'Euros (EUR)',
    'libra' => 'Libras Esterlinas (GBP)'
];

if ($_POST) {
    $real = floatval($_POST['real']);
    $moedaDestino = $_POST['moedaDestino'];
    
    if (is_numeric($real) && $real > 0 && isset($cotacoes[$moedaDestino])) {
        $valorConvertido = $real / $cotacoes[$moedaDestino];
        $valorConvertido_formatado = number_format($valorConvertido, 2, ',', '.');
        $real_formatado = number_format($real, 2, ',', '.');
        $nome_moeda = $nomes_moedas[$moedaDestino];
    } else {
        $erro = "Por favor, insira valores válidos e selecione uma moeda.";
    }
}
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado da Conversão</title>
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
        
        .conversao {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 5px;
        }
        
        .detalhes {
            color: #666;
            font-size: 14px;
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
    <h1>Resultado da Conversão</h1>
    
    <?php if (isset($valorConvertido_formatado)): ?>
        <div class="resultado">
            <div class="conversao">R$ <?php echo $real_formatado; ?> = <?php echo $valorConvertido_formatado; ?></div>
            <div class="detalhes"><?php echo $nome_moeda; ?></div>
            <div class="detalhes">Cotação: R$ <?php echo number_format($cotacoes[$moedaDestino], 2, ',', '.'); ?></div>
        </div>
    <?php elseif (isset($erro)): ?>
        <div class="resultado erro">
            <?php echo $erro; ?>
        </div>
    <?php endif; ?>
    
    <div style="text-align: center;">
        <a href="conversor_moeda.html" class="voltar">Converter Novamente</a>
    </div>
</body>
</html>