<?php
include 'conexao.php';

$acao = $_REQUEST['acao'] ?? '';

extract($_POST);

try {

    switch ($acao) {
        
        case 'inserir':
            $sql = "INSERT INTO clientes 
                        (nome_completo, data_nascimento, cpf, rg, estado_civil, rua, numero, bairro, cidade, estado, cep, telefone, email, profissao) 
                    VALUES 
                        (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            $stmt = $pdo->prepare($sql);
            $stmt->execute([
                $nome_completo, $data_nascimento, $cpf, $rg, $estado_civil,
                $rua, $numero, $bairro, $cidade, $estado, $cep,
                $telefone, $email, $profissao
            ]);
            
            break;
            
        case 'alterar':
            $id = $_POST['id'] ?? null; 
            
            if (!$id) {
                throw new Exception('ID do cliente não fornecido para alteração.');
            }
            
            $sql = "UPDATE clientes SET
                        nome_completo = ?, data_nascimento = ?, cpf = ?, rg = ?, estado_civil = ?,
                        rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ?,
                        telefone = ?, email = ?, profissao = ?
                    WHERE 
                        id = ?";
            
            $stmt = $pdo->prepare($sql);
            $stmt->execute([
                $nome_completo, $data_nascimento, $cpf, $rg, $estado_civil,
                $rua, $numero, $bairro, $cidade, $estado, $cep,
                $telefone, $email, $profissao,
                $id
            ]);

            break;
            
        case 'excluir':
            $id = $_GET['id'] ?? null;
            
            if (!$id) {
                throw new Exception('ID do cliente não fornecido para exclusão.');
            }

            $sql = "DELETE FROM clientes WHERE id = ?";
            $stmt = $pdo->prepare($sql);
            $stmt->execute([$id]);
            
            break;
    }

    header('Location: index.php');
    exit;

} catch (PDOException $e) {
    echo "Erro de SQL: " . $e->getMessage();
} catch (Exception $e) {
    echo "Erro: " . $e->getMessage();
}

?>