CREATE TABLE Contribuinte(
    cpf CHAR(11) PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    endereco VARCHAR(200),
    telefone VARCHAR(15)
);
CREATE TABLE DeclaracaoImpostoRenda(
    cpf_contribuinte CHAR(11) NOT NULL PRIMARY KEY,
    ano_exercicio DATE NOT NULL,
    ano_base DATE,
    valor_declarado INT,
    restituicao_pagamento BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (cpf_contribuinte) REFERENCES Contribuinte(cpf)
);

CREATE TABLE MalhaFina(
    id_malha_fina INT PRIMARY KEY AUTO_INCREMENT,
    ano_exercicio DATE
);

CREATE TABLE Contribuinte_MalhaFina(
    id_malha_fina INT NOT NULL,
    cpf_contribuinte CHAR(11) NOT NULL,
    valor_multa DECIMAL(10, 2),
    quantidade_prestacoes INT,
    PRIMARY KEY (id_malha_fina, cpf_contribuinte),
);