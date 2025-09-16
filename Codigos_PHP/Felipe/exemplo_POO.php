<?php
    class aluno{
        public $ra;
        public function setRA($r){
            $this->ra = $r;
            echo "Ra: $this->ra";
        }
    }
    class graduacao extends aluno{
        protected $tcc;
        public function setTCC($t){
            $this->tcc = $t;
            echo "TCC: $this->tcc";
        }
    }
    $a = new aluno();
    $a->setRA(12345);
    $a = new graduacao();
    $a->setRA(67890);
    $a->setTCC("Programação Web");



?>