<?php
// index.php
require_once 'conexao.php'; // Inclui o arquivo de conexão
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Lista de Alunos</title>
    <link rel="stylesheet" href="estilo.css">
    <style>
        /* (Pode adicionar o mesmo CSS da tabela que você usou antes aqui) */
        table { width: 100%; border-collapse: collapse; }
        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
        a { text-decoration: none; color: blue; }
        a.delete { color: red; }
    </style>
</head>
<body>
    <h1>Gerenciamento de Alunos</h1>
    <p><a href="cadastrar.php">Adicionar Novo Aluno</a></p>

    <table>
        <thead>
            <tr>
                <th>RA</th>
                <th>Nome</th>
                <th>Data de Nascimento</th>
                <th>Matéria</th>
                <th>Período</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $sql = "SELECT ra, nome, DATE_FORMAT(data_nascimento, '%d/%m/%Y') AS data_formatada, materia, periodo FROM alunos";
            $resultado = $conexao->query($sql);

            if ($resultado->num_rows > 0) {
                // Loop através de cada linha de resultado
                while($aluno = $resultado->fetch_assoc()) {
                    echo "<tr>";
                    echo "<td>" . htmlspecialchars($aluno['ra']) . "</td>";
                    echo "<td>" . htmlspecialchars($aluno['nome']) . "</td>";
                    echo "<td>" . htmlspecialchars($aluno['data_formatada']) . "</td>";
                    echo "<td>" . htmlspecialchars($aluno['materia']) . "</td>";
                    echo "<td>" . htmlspecialchars($aluno['periodo']) . "</td>";
                    echo "<td>";
                    echo "<a href='editar.php?ra=" . $aluno['ra'] . "'>Editar</a> | ";
                    echo "<a href='excluir_aluno.php?ra=" . $aluno['ra'] . "' class='delete' onclick='return confirm(\"Tem certeza que deseja excluir este aluno?\");'>Excluir</a>";
                    echo "</td>";
                    echo "</tr>";
                }
            } else {
                echo "<tr><td colspan='6'>Nenhum aluno cadastrado.</td></tr>";
            }
            $conexao->close();
            ?>
        </tbody>
    </table>
</body>
</html>