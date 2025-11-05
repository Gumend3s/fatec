<?php
include 'conexao.php';

$sql = "SELECT id, nome_completo, email, telefone, cpf FROM clientes ORDER BY nome_completo";
$stmt = $pdo->query($sql);

$clientes = $stmt->fetchAll();
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Clientes</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Cadastro de Clientes</h1>
        
        <a href="formulario.php" class="btn">Adicionar Novo Cliente</a>
        
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>E-mail</th>
                    <th>Telefone</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                <?php if (count($clientes) > 0): ?>
                    <?php foreach ($clientes as $cliente): ?>
                        <tr>
                            <td><?php echo htmlspecialchars($cliente['nome_completo']); ?></td>
                            <td><?php echo htmlspecialchars($cliente['cpf']); ?></td>
                            <td><?php echo htmlspecialchars($cliente['email']); ?></td>
                            <td><?php echo htmlspecialchars($cliente['telefone']); ?></td>
                            <td class="acoes">
                                <a href="formulario.php?id=<?php echo $cliente['id']; ?>" class="btn-editar">Editar</a>
                                
                                <a href="salvar.php?acao=excluir&id=<?php echo $cliente['id']; ?>" 
                                   class="btn-excluir" 
                                   onclick="return confirm('Tem certeza que deseja excluir este cliente?');">
                                   Excluir
                                </a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                <?php else: ?>
                    <tr>
                        <td colspan="5">Nenhum cliente cadastrado.</td>
                    </tr>
                <?php endif; ?>
            </tbody>
        </table>
    </div>
</body>
</html>