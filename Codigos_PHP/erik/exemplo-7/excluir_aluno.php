<?php
// excluir_aluno.php
require_once 'conexao.php';

// Pega o RA da URL
$ra = $_GET['ra'];

// Prepara a consulta SQL
$sql = "DELETE FROM alunos WHERE ra = ?";
$stmt = $conexao->prepare($sql);

if ($stmt === false) {
    die("Erro na preparação da consulta: " . $conexao->error);
}

// Associa o parâmetro
$stmt->bind_param("i", $ra);

// Executa a consulta
if ($stmt->execute()) {
    echo "Aluno excluído com sucesso!";
    header("Location: index.php");
    exit();
} else {
    echo "Erro ao excluir aluno: " . $stmt->error;
}

$stmt->close();
$conexao->close();
?>