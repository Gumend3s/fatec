<?php
class aluno{
    public $ra;
    public function setRa($r){
        $this->ra = $r;
        echo  "Ra: $this->ra";
    }
}
$a = new aluno(); //instaciando obj da classe aluno
$a->setRa(12345);
?>