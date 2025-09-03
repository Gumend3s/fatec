<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $valor = $_POST["valor"];
    $moeda = $_POST["moeda"];

    if (!is_numeric($valor) || $valor <= 0) {
        echo "<p style='color:red; font-weight:bold;'>Erro: insira um valor numérico válido!</p>";
        exit;
    }

    $cotacoes = ["dolar" => 5.20, "euro" => 5.60, "libra" => 6.50];

    if (!array_key_exists($moeda, $cotacoes)) {
        echo "<p style='color:red; font-weight:bold;'>Erro: moeda inválida!</p>";
        exit;
    }

    $resultado = $valor / $cotacoes[$moeda];
    ?>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <title>Resultado da Conversão</title>
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
                box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
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

            a:hover {
                background-color: #00f2fe;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <h2>Resultado da Conversão</h2>
            <p>Valor em Reais: R$ <?php echo number_format($valor, 2, ',', '.'); ?></p>
            <?php
            switch ($moeda) {
                case "dolar":
                    echo "<p>Convertido em Dólares: US$ " . number_format($resultado, 2, ',', '.') . "</p>";
                    break;
                case "euro":
                    echo "<p>Convertido em Euros: € " . number_format($resultado, 2, ',', '.') . "</p>";
                    break;
                case "libra":
                    echo "<p>Convertido em Libras: £ " . number_format($resultado, 2, ',', '.') . "</p>";
                    break;
            }
            ?>
            <a href="atividade-2.html">Voltar</a>
        </div>
    </body>

    </html>
<?php } ?>