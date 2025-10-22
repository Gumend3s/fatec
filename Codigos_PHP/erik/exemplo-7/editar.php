<?php
// editar.php
require_once 'conexao.php';

$ra = $_GET['ra']; // Pega o RA da URL

// Busca os dados do aluno para preencher o formulário
$sql = "SELECT * FROM alunos WHERE ra = ?";
$stmt = $conexao->prepare($sql);
$stmt->bind_param("i", $ra);
$stmt->execute();
$resultado = $stmt->get_result();
$aluno = $resultado->fetch_assoc();

if (!$aluno) {
    die("Aluno não encontrado.");
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Editar Aluno</title>
    <link rel="stylesheet" href="estilo.css">
</head>
<body>
    <h1>Editar Aluno</h1>
    <form action="atualizar_aluno.php" method="POST">
        <input type="hidden" name="ra" value="<?php echo htmlspecialchars($aluno['ra']); ?>">

        <label for="nome">Nome:</label><br>
        <input type="text" id="nome" name="nome" value="<?php echo htmlspecialchars($aluno['nome']); ?>" required><br><br>

        <label for="data_nascimento">Data de Nascimento:</label><br>
        <input type="date" id="data_nascimento" name="data_nascimento" value="<?php echo htmlspecialchars($aluno['data_nascimento']); ?>" required><br><br>

        <label for="materia">Matéria:</label><br>
        <input type="text" id="materia" name="materia" value="<?php echo htmlspecialchars($aluno['materia']); ?>" required><br><br>

        <label for="periodo">Período:</label><br>
        <input type="text" id="periodo" name="periodo" value="<?php echo htmlspecialchars($aluno['periodo']); ?>" required><br><br>

        <input type="submit" value="Atualizar Aluno">
    </form>
</body>
</html>
<?php
$stmt->close();
$conexao->close();
?>