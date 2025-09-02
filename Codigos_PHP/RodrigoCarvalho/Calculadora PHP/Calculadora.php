<?php 

if($_SERVER["REQUEST_METHOD"] == "POST"){
    $number1 = $_POST['Number1'];
    $number2 = $_POST['Number2'];

    if($number1 != null && $number2 != null){
        if (isset($_POST['plus'])){
            Echo $number1 + $number2;
        }
        if (isset($_POST['minus'])){
            echo $number1 - $number2;
        }
        if (isset($_POST['divide'])){
            echo $number1 / $number2;
        }
        if (isset($_POST['times'])){
            echo $number1 * $number2;
        }
    }else if($number1 == null || $number2 == null){
        echo "erro!";
    }
    

}
?>
</body>
</html>