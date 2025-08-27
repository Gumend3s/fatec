<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Calculadora Simples</title>
</head>
<body>

<div>
    <h2>Calculadora</h2>

    <form method="post" action="calculadoraSimples.php">
        <input type="number" name="numero1" placeholder="Número 1" required>
        <select name="operacao">
            <option value="soma">+</option>
            <option value="subtracao">-</option>
            <option value="multiplicacao">*</option>
            <option value="divisao">/</option>
        </select>
        <input type="number" name="numero2" placeholder="Número 2" required>
        <button type="submit">Calcular</button>
    </form>

    <?php
        
    // Verifica se os dados foram enviados via método POST
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        
        // Pega os valores dos campos
        $numero1 = $_POST['numero1'];
        $numero2 = $_POST['numero2'];
        $operacao = $_POST['operacao'];
        $resultado = 0;
        
        // Estrutura de controle para a operação
        switch ($operacao) {
            case 'soma':
                $resultado = $numero1 + $numero2;
                break;
            case 'subtracao':
                $resultado = $numero1 - $numero2;
                break;
            case 'multiplicacao':
                $resultado = $numero1 * $numero2;
                break;
            case 'divisao':
                if ($numero2 != 0) {
                    $resultado = $numero1 / $numero2;
                } else {
                    echo "<div class='resultado'>Erro: Divisão por zero não é permitida.</div>";
                    exit; // Encerra o script para não mostrar o resultado
                }
                break;
        }
        
        // Exibe o resultado na tela
        echo "<div class='resultado'>O resultado é: " . $resultado . "</div>";
    }
    ?>
</div>

</body>
</html>