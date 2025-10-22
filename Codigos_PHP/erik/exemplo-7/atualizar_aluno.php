<?php
// atualizar_aluno.php
require_once 'conexao.php';

// Recebendo os dados do formulário de edição
$ra = $_POST['ra'];
$nome = $_POST['nome'];
$data_nascimento = $_POST['data_nascimento'];
$materia = $_POST['materia'];
$periodo = $_POST['periodo'];

// Prepara a consulta SQL
$sql = "UPDATE alunos SET nome = ?, data_nascimento = ?, materia = ?, periodo = ? WHERE ra = ?";
$stmt = $conexao->prepare($sql);

if ($stmt === false) {
    die("Erro na preparação da consulta: " . $conexao->error);
}

// Associa os parâmetros
$stmt->bind_param("ssssi", $nome, $data_nascimento, $materia, $periodo, $ra);

// Executa a consulta
if ($stmt->execute()) {
    echo "Dados do aluno atualizados com sucesso!";
    header("Location: index.php");
    exit();
} else {
    echo "Erro ao atualizar dados: " . $stmt->error;
}

$stmt->close();
$conexao->close();
?>