<?php 
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $peso = $_POST["peso"];
    $altura = $_POST["altura"];

    if (!is_numeric($peso) || !is_numeric($altura) || $peso <= 0 || $altura <= 0) {
        echo "<p style='color:red; font-weight:bold;'>Erro: insira valores válidos para peso e altura.</p>";
        exit;
    }

    $imc = $peso / ($altura * $altura);

    if ($imc < 18.5) {
        $classificacao = "Abaixo do peso";
    } elseif ($imc >= 18.6 && $imc <= 24.9) {
        $classificacao = "Peso ideal (parabéns)";
    } elseif ($imc >= 25.0 && $imc <= 29.9) {
        $classificacao = "Levemente acima do peso";
    } elseif ($imc >= 30.0 && $imc <= 34.9) {
        $classificacao = "Obesidade grau I";
    } elseif ($imc >= 35.0 && $imc <= 39.9) {
        $classificacao = "Obesidade grau II (severa)";
    } else {
        $classificacao = "Obesidade grau III (mórbida)";
    }
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Resultado IMC</title>
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
            background: rgba(255,255,255,0.95);
            padding: 40px 50px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            text-align: center;
            width: 100%;
            max-width: 400px;
        }
        h2 { margin-bottom: 20px; }
        p { font-size: 18px; margin: 8px 0; }
        strong { color: #4facfe; }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            text-decoration: none;
            background-color: #4facfe;
            color: white;
            border-radius: 8px;
            transition: 0.3s;
        }
        a:hover { background-color: #00f2fe; }
    </style>
</head>
<body>
    <div class="container">
        <h2>Resultado</h2>
        <p>Peso informado: <?php echo number_format($peso,2,',','.'); ?> kg</p>
        <p>Altura informada: <?php echo number_format($altura,2,',','.'); ?> m</p>
        <p>IMC calculado: <?php echo number_format($imc,2,',','.'); ?></p>
        <p>Classificação: <strong><?php echo $classificacao; ?></strong></p>
        <a href="atividade-3.html">Voltar</a>
    </div>
</body>
</html>
<?php } ?>
