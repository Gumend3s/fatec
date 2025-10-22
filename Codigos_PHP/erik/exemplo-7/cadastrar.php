<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastrar Aluno</title>
    <link rel="stylesheet" href="estilo.css">
</head>
<body>
    <h1>Cadastrar Novo Aluno</h1>
    <form action="salvar_aluno.php" method="POST">
        <label for="ra">RA:</label><br>
        <input type="number" id="ra" name="ra" required><br><br>

        <label for="nome">Nome:</label><br>
        <input type="text" id="nome" name="nome" required><br><br>

        <label for="data_nascimento">Data de Nascimento:</label><br>
        <input type="date" id="data_nascimento" name="data_nascimento" required><br><br>

        <label for="materia">Matéria:</label><br>
        <input type="text" id="materia" name="materia" required><br><br>

        <label for="periodo">Período:</label><br>
        <input type="text" id="periodo" name="periodo" required><br><br>

        <input type="submit" value="Salvar Aluno">
    </form>
</body>
</html>