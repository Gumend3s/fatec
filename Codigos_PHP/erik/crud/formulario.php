<?php
include 'conexao.php';

$cliente = [];
$id = null;
$acao = 'inserir';

if (isset($_GET['id'])) {
    $id = $_GET['id'];
    $acao = 'alterar';
    
    $stmt = $pdo->prepare("SELECT * FROM clientes WHERE id = ?");
    $stmt->execute([$id]);
    $cliente = $stmt->fetch();
    
    if (!$cliente) {
        header('Location: index.php');
        exit;
    }
} else {
    $cliente = [
        'nome_completo' => '', 'data_nascimento' => '', 'cpf' => '', 'rg' => '',
        'estado_civil' => '', 'rua' => '', 'numero' => '', 'bairro' => '',
        'cidade' => '', 'estado' => '', 'cep' => '', 'telefone' => '',
        'email' => '', 'profissao' => ''
    ];
}

function val($campo, $dados) {
    echo htmlspecialchars($dados[$campo] ?? '');
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?php echo $acao == 'inserir' ? 'Adicionar' : 'Editar'; ?> Cliente</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1><?php echo $acao == 'inserir' ? 'Adicionar Novo' : 'Editar'; ?> Cliente</h1>
        
        <form action="salvar.php" method="POST">
            
            <input type="hidden" name="acao" value="<?php echo $acao; ?>">
            <input type="hidden" name="id" value="<?php echo $id; ?>">
            
            <fieldset>
                <legend>Dados Pessoais</legend>
                
                <div class="campo">
                    <label for="nome_completo">Nome Completo:</label>
                    <input type="text" id="nome_completo" name="nome_completo" value="<?php val('nome_completo', $cliente); ?>" required>
                </div>
                
                <div class="grid-2">
                    <div class="campo">
                        <label for="data_nascimento">Data de Nasc.:</label>
                        <input type="date" id="data_nascimento" name="data_nascimento" value="<?php val('data_nascimento', $cliente); ?>">
                    </div>
                    <div class="campo">
                        <label for="cpf">CPF:</label>
                        <input type="text" id="cpf" name="cpf" value="<?php val('cpf', $cliente); ?>" placeholder="123.456.789-10">
                    </div>
                </div>

                <div class="grid-2">
                    <div class="campo">
                        <label for="rg">RG:</label>
                        <input type="text" id="rg" name="rg" value="<?php val('rg', $cliente); ?>">
                    </div>
                     <div class="campo">
                        <label for="estado_civil">Estado Civil:</label>
                        <select id="estado_civil" name="estado_civil">
                            <option value="" <?php if(empty($cliente['estado_civil'])) echo 'selected'; ?>>Selecione...</option>
                            <option value="Solteiro(a)" <?php if($cliente['estado_civil'] == 'Solteiro(a)') echo 'selected'; ?>>Solteiro(a)</option>
                            <option value="Casado(a)" <?php if($cliente['estado_civil'] == 'Casado(a)') echo 'selected'; ?>>Casado(a)</option>
                            <option value="Divorciado(a)" <?php if($cliente['estado_civil'] == 'Divorciado(a)') echo 'selected'; ?>>Divorciado(a)</option>
                            <option value="Viúvo(a)" <?php if($cliente['estado_civil'] == 'Viúvo(a)') echo 'selected'; ?>>Viúvo(a)</option>
                            <option value="União Estável" <?php if($cliente['estado_civil'] == 'União Estável') echo 'selected'; ?>>União Estável</option>
                        </select>
                    </div>
                </div>
            </fieldset>

            <fieldset>
                <legend>Contato</legend>
                 <div class="grid-2">
                    <div class="campo">
                        <label for="telefone">Telefone / Celular:</label>
                        <input type="tel" id="telefone" name="telefone" value="<?php val('telefone', $cliente); ?>" placeholder="(19) 99999-8888">
                    </div>
                    <div class="campo">
                        <label for="email">E-mail:</label>
                        <input type="email" id="email" name="email" value="<?php val('email', $cliente); ?>">
                    </div>
                </div>
                 <div class="campo">
                    <label for="profissao">Profissão:</label>
                    <input type="text" id="profissao" name="profissao" value="<?php val('profissao', $cliente); ?>">
                </div>
            </fieldset>

            <fieldset>
                <legend>Endereço</legend>
                <div class="campo">
                    <label for="rua">Rua / Logradouro:</label>
                    <input type="text" id="rua" name="rua" value="<?php val('rua', $cliente); ?>">
                </div>
                
                <div class="grid-2">
                    <div class="campo">
                        <label for="numero">Número:</label>
                        <input type="text" id="numero" name="numero" value="<?php val('numero', $cliente); ?>">
                    </div>
                    <div class="campo">
                        <label for="bairro">Bairro:</label>
                        <input type="text" id="bairro" name="bairro" value="<?php val('bairro', $cliente); ?>">
                    </div>
                </div>

                <div class="grid-3">
                    <div class="campo">
                        <label for="cidade">Cidade:</label>
                        <input type="text" id="cidade" name="cidade" value="<?php val('cidade', $cliente); ?>">
                    </div>
                    <div class="campo">
                        <label for="estado">Estado (UF):</label>
                        <input type="text" id="estado" name="estado" value="<?php val('estado', $cliente); ?>" maxlength="2" placeholder="SP">
                    </div>
                    <div class="campo">
                        <label for="cep">CEP:</label>
                        <input type="text" id="cep" name="cep" value="<?php val('cep', $cliente); ?>" placeholder="12345-678">
                    </div>
                </div>
            </fieldset>
            
            <div class="botoes">
                <button type="submit" class="btn">Salvar</button>
                <a href="index.php" class="btn-voltar">Voltar</a>
            </div>
        </form>
    </div>
</body>
</html>