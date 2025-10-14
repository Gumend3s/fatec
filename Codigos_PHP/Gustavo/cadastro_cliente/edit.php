<?php 

require_once 'connect.php';

require_once 'header.php';

?>
<div class="container">
	<?php 
	
	if(isset($_POST['update'])){

		if( empty($_POST['CPF']) || empty($_POST['RG']) || 
			empty($_POST['nome']) || empty($_POST['data_nasciemnto']) ||
			empty($_POST['estado_civil']) || empty($_POST['rua']) ||
			empty($_POST['numero']) || empty($_POST['estado']) ||
			empty($_POST['cidade']) || empty($_POST['bairro']) ||
			empty($_POST['CEP']) || empty($_POST['profissao']) )
		{
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
			$sql = "UPDATE cliente SET 
				RG='{$RG}', 
				nome='{$nome}', 
				data_nasciemnto='{$data_nasciemnto}', 
				estado_civil='{$estado_civil}', 
				rua='{$rua}', 
				numero='{$numero}', 
				estado='{$estado}', 
				cidade='{$cidade}', 
				bairro='{$bairro}', 
				CEP='{$CEP}', 
				telefone='{$telefone}', 
				celular='{$celular}', 
				email='{$email}', 
				profissao='{$profissao}'
				WHERE CPF='{$CPF}'";

			if( $con->query($sql) === TRUE){
				echo "<div class='alert alert-success'>Cliente atualizado com sucesso.</div>";
			}else{
				echo "<div class='alert alert-danger'>Erro ao atualizar cliente.</div>";
			}
		}
	}
	$cpf = isset($_GET['cpf']) ? $_GET['cpf'] : '';
	$sql = "SELECT * FROM cliente WHERE CPF='{$cpf}'";
	$result = $con->query($sql);

	if(!$cpf || $result->num_rows < 1){
		header('Location: index.php');
		exit;
	}
	$row = $result->fetch_assoc();
	?>
	<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<div class="box">
			<h3><i class="glyphicon glyphicon-plus"></i>&nbsp;Alterar Cliente</h3> 
			<form action="" method="POST">
				<label for="CPF">CPF</label>
				<input type="text" id="CPF" name="CPF" value="<?php echo $row['CPF']; ?>" class="form-control" readonly><br>
				<label for="RG">RG</label>
				<input type="text" id="RG" name="RG" value="<?php echo $row['RG']; ?>" class="form-control"><br>
				<label for="nome">Nome</label>
				<input type="text" id="nome" name="nome" value="<?php echo $row['nome']; ?>" class="form-control"><br>
				<label for="data_nasciemnto">Data de Nascimento</label>
				<input type="date" id="data_nasciemnto" name="data_nasciemnto" value="<?php echo $row['data_nasciemnto']; ?>" class="form-control"><br>
				<label for="estado_civil">Estado Civil</label>
				<input type="text" id="estado_civil" name="estado_civil" value="<?php echo $row['estado_civil']; ?>" class="form-control"><br>
				<label for="rua">Rua</label>
				<input type="text" id="rua" name="rua" value="<?php echo $row['rua']; ?>" class="form-control"><br>
				<label for="numero">Número</label>
				<input type="number" id="numero" name="numero" value="<?php echo $row['numero']; ?>" class="form-control"><br>
				<label for="estado">Estado</label>
				<input type="text" id="estado" name="estado" value="<?php echo $row['estado']; ?>" class="form-control"><br>
				<label for="cidade">Cidade</label>
				<input type="text" id="cidade" name="cidade" value="<?php echo $row['cidade']; ?>" class="form-control"><br>
				<label for="bairro">Bairro</label>
				<input type="text" id="bairro" name="bairro" value="<?php echo $row['bairro']; ?>" class="form-control"><br>
				<label for="CEP">CEP</label>
				<input type="text" id="CEP" name="CEP" value="<?php echo $row['CEP']; ?>" class="form-control"><br>
				<label for="telefone">Telefone</label> 
				<input type="text" id="telefone" name="telefone" value="<?php echo $row['telefone']; ?>" class="form-control"><br>
				<label for="celular">Celular</label> 
				<input type="text" id="celular" name="celular" value="<?php echo $row['celular']; ?>" class="form-control"><br>
				<label for="email">Email</label> 
				<input type="email" id="email" name="email" value="<?php echo $row['email']; ?>" class="form-control"><br>
				<label for="profissao">Profissão</label> 
				<input type="text" id="profissao" name="profissao" value="<?php echo $row['profissao']; ?>" class="form-control"><br>
				<br>
				<input type="submit" name="update" class="btn btn-success" value="Update">
			</form>
		</div>
	</div>
</div>
</div>

<?php 

 require_once 'footer.php';