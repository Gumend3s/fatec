<?php
  $a = $_POST['num1'];
  $b = $_POST['num2'];
  $op = $_POST['operacao'];
  $r = $_POST['resposta'];
  $func = $_POST['funcao'];
  $memor = $_POST['memoria'];
  
  if($op) {
      if($op == '+')
        $r = $a + $b;
      else if($op == '-')
        $r = $a - $b;
      else if($op == '*')
        $r = $a*$b;
      else
        $r = $a/$b;        
    }
    if($func) {
      if($func == 'MC'){
        $memor = 0;
      }
      else if($func == 'MR'){
        $a = $a;
        $memor = $a;
      }
      else if($func == 'M+'){
        $r = $a + $b;
        $memor = $r;
    }
      else{
        $r = $b - $a;
        $memor = $r;
      }
    }    
?>