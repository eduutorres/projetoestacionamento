-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16-Dez-2019 às 05:05
-- Versão do servidor: 10.4.8-MariaDB
-- versão do PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientemensal`
--

CREATE TABLE `clientemensal` (
  `cod` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `fone` varchar(20) NOT NULL,
  `rg` varchar(30) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `sexo` varchar(11) NOT NULL,
  `rua` varchar(200) NOT NULL,
  `numero` int(11) NOT NULL,
  `bairro` varchar(200) NOT NULL,
  `cidade` varchar(200) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `placa` varchar(10) NOT NULL,
  `tipo` varchar(1) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `cor` varchar(100) NOT NULL,
  `datacadastro` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `clientemensal`
--

INSERT INTO `clientemensal` (`cod`, `nome`, `fone`, `rg`, `cpf`, `sexo`, `rua`, `numero`, `bairro`, `cidade`, `uf`, `placa`, `tipo`, `modelo`, `cor`, `datacadastro`) VALUES
(6, 'Maria', '(11) 11111-1111', '1.111.111', '111.111.111-11', 'Feminino', 'abc', 1111, 'abc', 'abc', 'SP', 'ABC-1111', 'C', 'abc', 'abc', '6/12/2019'),
(8, 'João José', '(22) 22222-2222', '2.222.222', '222.222.222-22', 'Masculino', 'aaaaaaaaa', 22, 'aaaaaaaaaaa', 'aaaaaaaaaaa', 'RO', 'AAA-2222', 'C', 'aaaaaaaaaaaa', 'aaaaaaaaaaa', '6/12/2019'),
(16, 'Teste10', '(11) 11111-1111', '1.111.111', '111.111.111-11', 'Feminino', 'aaaaa', 1221, 'aaaaa', 'aaaa', 'RS', 'AAA-5454', 'C', 'Gol', 'branco', '15/12/2019'),
(18, 'Teste', '(  )      -    ', ' .   .   ', '   .   .   -  ', 'Feminino', '', 14, '', '', 'RS', 'BBB-3233', 'C', '', '', '15/12/2019'),
(19, 'Teste11', '(  )      -    ', ' .   .   ', '   .   .   -  ', 'Masculino', '', 123, '', '', 'AC', 'AAA-3123', 'C', '', '', '15/12/2019'),
(20, 'Teste12', '(  )      -    ', ' .   .   ', '   .   .   -  ', 'Masculino', '', 2323, '', '', 'PE', 'ASA-1212', 'M', '', '', '15/12/2019');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contasareceber`
--

CREATE TABLE `contasareceber` (
  `cod` int(11) NOT NULL,
  `cliente` varchar(200) NOT NULL,
  `placa` varchar(10) NOT NULL,
  `mes` varchar(2) NOT NULL,
  `ano` int(11) NOT NULL,
  `tipo` varchar(11) NOT NULL,
  `valor` double(11,2) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `contasareceber`
--

INSERT INTO `contasareceber` (`cod`, `cliente`, `placa`, `mes`, `ano`, `tipo`, `valor`, `modelo`, `status`) VALUES
(1, 'Teste9', '   -    ', '12', 2019, 'C', 16.45, '', 'PENDENTE'),
(2, 'Teste10', 'AAA-5454', '12', 2019, 'C', 15.48, 'Gol', 'PENDENTE'),
(3, 'Teste', 'BBB-3233', '12', 2019, 'C', 15.48, '', 'PENDENTE'),
(4, 'Teste11', 'AAA-3123', '12', 2019, 'C', 15.48, '', 'PENDENTE'),
(5, 'Teste12', 'ASA-1212', '12', 2019, 'M', 5.16, '', 'PENDENTE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `preco`
--

CREATE TABLE `preco` (
  `cod` int(11) NOT NULL,
  `valorcarro` double(11,2) NOT NULL,
  `valormoto` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `preco`
--

INSERT INTO `preco` (`cod`, `valorcarro`, `valormoto`) VALUES
(1, 30.00, 10.00);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vagas`
--

CREATE TABLE `vagas` (
  `cod` int(11) NOT NULL,
  `vagascarro` int(11) NOT NULL,
  `vagasmoto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vagas`
--

INSERT INTO `vagas` (`cod`, `vagascarro`, `vagasmoto`) VALUES
(1, 65, 2);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `clientemensal`
--
ALTER TABLE `clientemensal`
  ADD PRIMARY KEY (`cod`),
  ADD UNIQUE KEY `placa` (`placa`);

--
-- Índices para tabela `contasareceber`
--
ALTER TABLE `contasareceber`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `preco`
--
ALTER TABLE `preco`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `vagas`
--
ALTER TABLE `vagas`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientemensal`
--
ALTER TABLE `clientemensal`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `contasareceber`
--
ALTER TABLE `contasareceber`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `preco`
--
ALTER TABLE `preco`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `vagas`
--
ALTER TABLE `vagas`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
