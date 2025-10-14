<?php 

require_once 'connect.php';

require_once 'header.php';

?>
<div class="container">
	<?php 

	if(isset($_POST['addnew'])){

		if( empty($_POST['CPF']) || empty($_POST['RG']) ||
			empty($_POST['nome']) || empty($_POST['data_nasciemnto']) ||
			empty($_POST['estado_civil']) || empty($_POST['rua']) ||
			empty($_POST['numero']) || empty($_POST['estado']) ||
			empty($_POST['cidade']) || empty($_POST['bairro']) ||
			empty($_POST['CEP']) || empty($_POST['profissao']) ){
			echo "<div class='alert alert-danger'>Preencha todos os campos obrigatórios.</div>"; 
		}else{		
			$CPF  = $_POST['CPF'];
			$RG 	= $_POST['RG'];
			$nome 	= $_POST['nome'];
			$data_nasciemnto = $_POST['data_nasciemnto'];
			$estado_civil = $_POST['estado_civil'];
			$rua = $_POST['rua'];
			$numero = $_POST['numero'];
			$estado = $_POST['estado'];
			$cidade = $_POST['cidade'];
			$bairro = $_POST['bairro'];
			$CEP = $_POST['CEP'];
			$telefone = isset($_POST['telefone']) ? $_POST['telefone'] : '';
			$celular = isset($_POST['celular']) ? $_POST['celular'] : '';
			$email = isset($_POST['email']) ? $_POST['email'] : '';
			$profissao = $_POST['profissao'];
			$sql = "INSERT INTO cliente(
				CPF, RG, nome, data_nasciemnto, estado_civil,
				rua, numero, estado, cidade, bairro, CEP,
				telefone, celular, email, profissao
			) VALUES (
				'{$CPF}', '{$RG}', '{$nome}', '{$data_nasciemnto}', '{$estado_civil}',
				'{$rua}', '{$numero}', '{$estado}', '{$cidade}', '{$bairro}', '{$CEP}',
				'{$telefone}', '{$celular}', '{$email}', '{$profissao}'
			)";

			if( $con->query($sql) === TRUE){
				echo "<div class='alert alert-success'>Cliente adicionado com sucesso.</div>";
			}else{
				echo "<div class='alert alert-danger'>Erro ao adicionar cliente.</div>";
			}
		}
	}
	?>
	<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<div class="box">
			<h3><i class="glyphicon glyphicon-plus"></i>&nbsp;Adicionar Novo Cliente</h3> 
			<form action="" method="POST">
				<label for="CPF">CPF</label>
				<input type="text" id="CPF" name="CPF" class="form-control"><br>
				<label for="RG">RG</label>
				<input type="text" id="RG" name="RG" class="form-control"><br>
				<label for="nome">Nome</label>
				<input type="text" id="nome" name="nome" class="form-control"><br>
				<label for="data_nasciemnto">Data de Nascimento</label>
				<input type="date" id="data_nasciemnto" name="data_nasciemnto" class="form-control"><br>
				<label for="estado_civil">Estado Civil</label>
				<input type="text" id="estado_civil" name="estado_civil" class="form-control"><br>
				<label for="rua">Rua</label>
				<input type="text" id="rua" name="rua" class="form-control"><br>
				<label for="numero">Número</label>
				<input type="number" id="numero" name="numero" class="form-control"><br>
				<label for="estado">Estado</label>
				<input type="text" id="estado" name="estado" class="form-control"><br>
				<label for="cidade">Cidade</label>
				<input type="text" id="cidade" name="cidade" class="form-control"><br>
				<label for="bairro">Bairro</label>
				<input type="text" id="bairro" name="bairro" class="form-control"><br>
				<label for="CEP">CEP</label>
				<input type="text" id="CEP" name="CEP" class="form-control"><br>
				<label for="telefone">Telefone</label> 
				<input type="text" id="telefone" name="telefone" class="form-control"><br>
				<label for="celular">Celular</label> 
				<input type="text" id="celular" name="celular" class="form-control"><br>
				<label for="email">Email</label> 
				<input type="email" id="email" name="email" class="form-control"><br>
				<label for="profissao">Profissão</label> 
				<input type="text" id="profissao" name="profissao" class="form-control"><br>
				<br>
				<input type="submit" name="addnew" class="btn btn-success" value="Salvar">
			</form>
		</div>
	</div>
</div>
</div>

<?php 

 require_once 'footer.php';