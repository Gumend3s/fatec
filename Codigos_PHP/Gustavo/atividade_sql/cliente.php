<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<?php
// Recebe os dados do formulário com a variável $_POST
$nome = $_POST['nome'];
$nascimento = $_POST['nascimento'];
$cpf = $_POST['cpf'];
$rg = $_POST['rg'];
$civil = $_POST['civil'];
$rua = $_POST['rua'];
$numero = $_POST['numero'];
$estado = $_POST['estado'];
$cidade = $_POST['cidade'];
$bairro = $_POST['bairro'];
$cep = $_POST['cep'];
$telefone = $_POST['telefone'];
$celular = $_POST['celular'];
$email = $_POST['email'];
$profissao = $_POST['profissao'];

$hostname = "localhost";
$username = "root";
$password = "";
$dbname = "escola";
$usertable = "cliente";
$yourfield = "nome";

//conexão	e seleção do banco de dados
$con = mysqli_connect($hostname, $username, $password, $dbname);

//executa a consulta

$query = "INSERT INTO cliente (nome, data_nasciemnto, CPF, RG, estado_civil, rua, numero, estado, cidade, bairro, CEP, telefone, celular, email, profissao) 
  VALUES ('$nome','$nascimento','$cpf','$rg','$civil','$rua','$numero','$estado','$cidade','$bairro','$cep','$telefone','$celular','$email','$profissao')";
$insert = mysqli_query($con, $query);

if ($insert) {
  echo "Cliente Cadastrado com Sucesso";
} else {
  echo "Erro";
}
?>
<html>

<head>
  <title>Curso de PHP</title>
</head>

<body>
  <p>
    <font face="Arial, Helvetica, sans-serif" size="4">
      <a href="cliente.html">Clique aqui para voltar ao formulário.</a>
    </font>
</body>

</html>