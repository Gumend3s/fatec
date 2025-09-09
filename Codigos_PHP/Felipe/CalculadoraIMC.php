<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora de IMC</title>
</head>
<body>

<div class="container">
    <h1>Calculadora de IMC</h1>

    <form method="post" action="CalculadoraIMC.php">
        <label for="peso">Peso (kg):</label>
        <input type="number" id="peso" name="peso" step="0.01" required>

        <label for="altura">Altura (m):</label>
        <input type="number" id="altura" name="altura" step="0.01" required>

        <button type="submit">Calcular IMC</button>
    </form>

        <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $peso = $_POST["peso"];
        $altura = $_POST["altura"];

        if (is_numeric($peso) && is_numeric($altura) && $altura > 0) {
            $imc = $peso / ($altura * $altura);
            $imc_formatado = number_format($imc, 2, ',', '.');

            if ($imc < 18.5) {
                $classificacao = "Abaixo do peso normal";
            } elseif ($imc < 25) {
                $classificacao = "Peso normal";
            } elseif ($imc < 30) {
                $classificacao = "Excesso de peso";
            } elseif ($imc < 35) {
                $classificacao = "Obesidade classe I";
            } elseif ($imc < 40) {
                $classificacao = "Obesidade classe II";
            } else {
                $classificacao = "Obesidade classe III";
            }

            echo "<h2>Resultado do IMC</h2>";
            echo "<p>Seu IMC é: <b>$imc_formatado</b></p>";
            echo "<p>Classificação: <b>$classificacao</b></p>";
            echo "<a href='".$_SERVER['PHP_SELF']."' class='link-button'>Calcular novamente</a>";
        } else {
            echo "<h2>Erro</h2>";
            echo "<p>Por favor, insira valores válidos para peso e altura.</p>";
            echo "<a href='".$_SERVER['PHP_SELF']."' class='link-button'>Voltar</a>";
        }
    } 
?>

</div>

</body>
</html>
