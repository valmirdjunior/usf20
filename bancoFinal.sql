-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.1.38-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              10.3.0.5771
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para estacionamento
-- CREATE DATABASE IF NOT EXISTS `estacionamento` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `estacionamento`;

-- Copiando estrutura para tabela estacionamento.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `iduser` int(11) NOT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `fone` varchar(25) DEFAULT NULL,
  `login` varchar(25) DEFAULT NULL,
  `senha` varchar(25) DEFAULT NULL,
  `perfil` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela estacionamento.usuarios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`iduser`, `usuario`, `fone`, `login`, `senha`, `perfil`) VALUES
	(1, 'Adriano', '62984567604', 'admin', 'admin', 'admin');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

-- Copiando estrutura para tabela estacionamento.veiculos
CREATE TABLE IF NOT EXISTS `veiculos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `Placa` varchar(30) DEFAULT NULL,
  `DataEntrada` varchar(30) DEFAULT NULL,
  `DataSaida` varchar(30) DEFAULT NULL,
  `Obs` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela estacionamento.veiculos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `veiculos` DISABLE KEYS */;
INSERT INTO `veiculos` (`codigo`, `Placa`, `DataEntrada`, `DataSaida`, `Obs`) VALUES
	(1, 'KDM 1212', '22/02/2020', '22/03/2020', 'COR VERDE');
/*!40000 ALTER TABLE `veiculos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'striix'; flush privileges;
