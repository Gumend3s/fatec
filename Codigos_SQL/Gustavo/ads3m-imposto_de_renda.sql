-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19/09/2025 às 17:48
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ads3m-imposto_de_renda`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `contribuinte`
--

CREATE TABLE `contribuinte` (
  `CPF` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `endereco` varchar(60) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `contribuinte`
--

INSERT INTO `contribuinte` (`CPF`, `nome`, `endereco`, `telefone`) VALUES
(111111111, 'Gustavo', NULL, NULL),
(222222222, 'Felipe', NULL, NULL),
(333333333, 'Rodrigo', NULL, NULL),
(444444444, 'Erik', NULL, NULL),
(555555555, 'Osmane', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `contribuinte_malha_fina`
--

CREATE TABLE `contribuinte_malha_fina` (
  `Malha_fina_identificador` int(11) NOT NULL,
  `Contribuinte_CPF` int(11) NOT NULL,
  `valor` int(11) NOT NULL,
  `quantidade_de_prestacoes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `contribuinte_malha_fina`
--

INSERT INTO `contribuinte_malha_fina` (`Malha_fina_identificador`, `Contribuinte_CPF`, `valor`, `quantidade_de_prestacoes`) VALUES
(6, 333333333, 1000000, 5),
(7, 333333333, 2000000, 8),
(8, 333333333, 5000000, 12),
(8, 444444444, 2000, 4),
(8, 555555555, 7000, 10),
(9, 333333333, 8000000, 20),
(9, 444444444, 10000, 10),
(10, 333333333, 9999999, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `declaracao_imposto_de_renda`
--

CREATE TABLE `declaracao_imposto_de_renda` (
  `Contribuinte_CPF` int(11) NOT NULL,
  `ano_exercicio` date NOT NULL,
  `ano_base` date NOT NULL,
  `valor` int(11) NOT NULL,
  `restituicao_ou_pagamento` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `declaracao_imposto_de_renda`
--

INSERT INTO `declaracao_imposto_de_renda` (`Contribuinte_CPF`, `ano_exercicio`, `ano_base`, `valor`, `restituicao_ou_pagamento`) VALUES
(111111111, '2025-01-10', '2024-01-01', 10000, 1),
(222222222, '2025-01-05', '2024-01-01', 7000, 1),
(333333333, '2025-02-25', '2024-01-01', 50, 0),
(444444444, '2025-01-12', '2024-01-01', 200, 0),
(555555555, '2025-01-03', '2024-01-01', 5000, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `malha_fina`
--

CREATE TABLE `malha_fina` (
  `identificador` int(11) NOT NULL,
  `ano_exercicio` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `malha_fina`
--

INSERT INTO `malha_fina` (`identificador`, `ano_exercicio`) VALUES
(6, '2020-12-31'),
(7, '2021-12-31'),
(8, '2022-12-31'),
(9, '2023-12-31'),
(10, '2024-12-31');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `contribuinte`
--
ALTER TABLE `contribuinte`
  ADD PRIMARY KEY (`CPF`);

--
-- Índices de tabela `contribuinte_malha_fina`
--
ALTER TABLE `contribuinte_malha_fina`
  ADD PRIMARY KEY (`Malha_fina_identificador`,`Contribuinte_CPF`),
  ADD KEY `Contribuinte_CPF` (`Contribuinte_CPF`);

--
-- Índices de tabela `declaracao_imposto_de_renda`
--
ALTER TABLE `declaracao_imposto_de_renda`
  ADD PRIMARY KEY (`Contribuinte_CPF`,`ano_exercicio`);

--
-- Índices de tabela `malha_fina`
--
ALTER TABLE `malha_fina`
  ADD PRIMARY KEY (`identificador`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `malha_fina`
--
ALTER TABLE `malha_fina`
  MODIFY `identificador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `contribuinte_malha_fina`
--
ALTER TABLE `contribuinte_malha_fina`
  ADD CONSTRAINT `contribuinte_malha_fina_ibfk_1` FOREIGN KEY (`Contribuinte_CPF`) REFERENCES `contribuinte` (`CPF`),
  ADD CONSTRAINT `contribuinte_malha_fina_ibfk_2` FOREIGN KEY (`Malha_fina_identificador`) REFERENCES `malha_fina` (`identificador`);

--
-- Restrições para tabelas `declaracao_imposto_de_renda`
--
ALTER TABLE `declaracao_imposto_de_renda`
  ADD CONSTRAINT `declaracao_imposto_de_renda_ibfk_1` FOREIGN KEY (`Contribuinte_CPF`) REFERENCES `contribuinte` (`CPF`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
