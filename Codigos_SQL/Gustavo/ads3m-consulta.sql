-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12/09/2025 às 17:46
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
-- Banco de dados: `ads3m-consulta`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `convenio`
--

CREATE TABLE `convenio` (
  `CodigoConvenio` int(6) NOT NULL,
  `NomeConvenio` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `convenio`
--

INSERT INTO `convenio` (`CodigoConvenio`, `NomeConvenio`) VALUES
(1, 'UNIMED'),
(2, 'BRADESCO SAÚDE');

-- --------------------------------------------------------

--
-- Estrutura para tabela `medico`
--

CREATE TABLE `medico` (
  `CRM` varchar(8) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Especilizacao` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `paciente`
--

CREATE TABLE `paciente` (
  `NumeroPaciente` int(6) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `CodigoConvenio` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `paciente`
--

INSERT INTO `paciente` (`NumeroPaciente`, `Nome`, `CodigoConvenio`) VALUES
(1, 'José da Silva', 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `convenio`
--
ALTER TABLE `convenio`
  ADD PRIMARY KEY (`CodigoConvenio`);

--
-- Índices de tabela `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`CRM`);

--
-- Índices de tabela `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`CodigoConvenio`,`NumeroPaciente`);

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `paciente_ibfk_1` FOREIGN KEY (`CodigoConvenio`) REFERENCES `convenio` (`CodigoConvenio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
