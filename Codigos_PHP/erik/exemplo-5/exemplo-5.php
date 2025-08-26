<?php 

$list = array(
    "filme"=> array(
        "O Senhor dos Anéis: A Sociedade do Anel" => "Fantasia",
        "Matrix" => "Ficção científica",
        "Gladiador" => "Ação/Drama",
        "A Origem" => "Ficção científica",
        "Clube da Luta" => "Drama",
        "Interestelar" => "Ficção científica",
        "O Poderoso Chefão" => "Crime/Drama",
        "Coringa" => "Drama/Thriller",
        "Pulp Fiction" => "Crime",
        "Forrest Gump" => "Drama/Romance"
        ),
    );

foreach ($list['filme'] as $key => $value) {
    echo $key ."==>". $value ."<br>";
}

?>