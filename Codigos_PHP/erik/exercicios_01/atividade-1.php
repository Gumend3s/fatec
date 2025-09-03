<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $alcool = $_POST["alcool"];
    $gasolina = $_POST["gasolina"];

    $relacao = $alcool / $gasolina;
    ?>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <title>Resultado - Combustível</title>
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
                transition: 0.3s;
            }

            a:hover {
                background-color: #00f2fe;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <h2>Resultado:</h2>
            <p>Preço do Álcool: R$ <?php echo number_format($alcool, 2, ',', '.'); ?></p>
            <p>Preço da Gasolina: R$ <?php echo number_format($gasolina, 2, ',', '.'); ?></p>
            <p>Relação Álcool/Gasolina: <?php echo number_format($relacao, 2, ',', '.'); ?></p>
            <p><strong>
                    <?php echo ($relacao <= 0.7) ? "Compensa abastecer com Álcool!" : "Compensa abastecer com Gasolina!"; ?>
                </strong></p>
            <a href="atividade-1.html">Voltar</a>
        </div>
    </body>

    </html>
<?php } ?>