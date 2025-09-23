<?php
session_start();

// Inicializa o array de contatos se não existir
if (!isset($_SESSION['contatos'])) {
    $_SESSION['contatos'] = [];
}

// Se o formulário foi enviado, adiciona novo contato
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $nome = $_POST['nome'] ?? '';
    $telefone = $_POST['telefone'] ?? '';
    $email = $_POST['email'] ?? '';

    // Adiciona ao array de sessão
    $_SESSION['contatos'][] = [
        'nome' => $nome,
        'telefone' => $telefone,
        'email' => $email
    ];
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Agenda de Contatos</title>
</head>
<body>
    <h2>Agenda de Contatos</h2>

    <table border="1" cellpadding="5">
        <tr>
            <th>Nome</th>
            <th>Telefone</th>
            <th>E-mail</th>
        </tr>
        <?php foreach ($_SESSION['contatos'] as $contato): ?>
            <tr>
                <td><?= htmlspecialchars($contato['nome']) ?></td>
                <td><?= htmlspecialchars($contato['telefone']) ?></td>
                <td><?= htmlspecialchars($contato['email']) ?></td>
            </tr>
        <?php endforeach; ?>
    </table>

    <br>
    <a href="contato.html">Adicionar novo contato</a>
</body>
</html>