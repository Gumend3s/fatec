<?php
// salvar_aluno.php
require_once 'conexao.php';

// Recebendo os dados do formulário
$ra = $_POST['ra'];
$nome = $_POST['nome'];
$data_nascimento = $_POST['data_nascimento'];
$materia = $_POST['materia'];
$periodo = $_POST['periodo'];

// Prepara a consulta SQL para evitar SQL Injection
$sql = "INSERT INTO alunos (ra, nome, data_nascimento, materia, periodo) VALUES (?, ?, ?, ?, ?)";
$stmt = $conexao->prepare($sql);

if ($stmt === false) {
    die("Erro na preparação da consulta: " . $conexao->error);
}

// Associa os parâmetros (s = string, i = integer)
$stmt->bind_param("issss", $ra, $nome, $data_nascimento, $materia, $periodo);

// Executa a consulta
if ($stmt->execute()) {
    echo "Aluno cadastrado com sucesso!";
    // Redireciona de volta para a página principal
    header("Location: index.php");
    exit();
} else {
    echo "Erro ao cadastrar aluno: " . $stmt->error;
}

$stmt->close();
$conexao->close();
?>