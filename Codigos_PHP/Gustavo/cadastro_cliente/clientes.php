<?php 

require_once 'connect.php';

require_once 'header.php';

echo "<div class='container'>";

if( isset($_POST['delete'])){
	$cpf = isset($_POST['cpf']) ? $_POST['cpf'] : '';
	$sql = "DELETE FROM cliente WHERE CPF='" . $con->real_escape_string($cpf) . "'";
	if($con->query($sql) === TRUE){
		echo "<div class='alert alert-success'>Cliente removido com sucesso</div>";
	}
}

$sql = "SELECT * FROM cliente";
$result = $con->query($sql); 

if( $result && $result->num_rows > 0)
{ 
	?>
	<h2>Lista de Clientes</h2>
	<table class="table table-bordered table-striped">
		<tr>
			<td>CPF</td>
			<td>Nome</td>
			<td>Cidade</td>
			<td>Estado</td>
			<td>Telefone</td>
			<td>Celular</td>
			<td width="70px">Delete</td>
			<td width="70px">EDIT</td>
		</tr>
	<?php
	while( $row = $result->fetch_assoc()){ 
		echo "<form action='' method='POST'>";
		echo "<input type='hidden' value='". htmlspecialchars($row['CPF'], ENT_QUOTES) ."' name='cpf' />";
		echo "<tr>";
		echo "<td>".$row['CPF'] . "</td>";
		echo "<td>".$row['nome'] . "</td>";
		echo "<td>".$row['cidade'] . "</td>";
		echo "<td>".$row['estado'] . "</td>";
		echo "<td>".$row['telefone'] . "</td>";
		echo "<td>".$row['celular'] . "</td>";
		echo "<td><input type='submit' name='delete' value='Delete' class='btn btn-danger' /></td>";  
		echo "<td><a href='edit.php?cpf=". urlencode($row['CPF']) ."' class='btn btn-info'>Edit</a></td>";
		echo "</tr>";
		echo "</form>"; 
	}
	?>
	</table>
<?php 
}
else
{
	echo "<br><br>Nenhum registro encontrado";
}
?> 
</div>

<?php 

 require_once 'footer.php';


