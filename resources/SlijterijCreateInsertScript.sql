-- noinspection SqlNoDataSourceInspectionForFile

-- noinspection SqlDialectInspectionForFile

CREATE SCHEMA `Slijterij` ;

CREATE TABLE `Slijterij`.`Wijn` (
  `idWijn` INT NOT NULL AUTO_INCREMENT,
  `wijnnaam` VARCHAR(145) NOT NULL,
  `brouwDatum` VARCHAR(45) NOT NULL,
  `prijs` DECIMAL(8,2) NOT NULL,
  `bewaarbaar` TINYINT NOT NULL,
  PRIMARY KEY (`idWijn`));


INSERT INTO `Slijterij`.`Wijn` (`wijnnaam`, `brouwDatum`, `prijs`, `bewaarbaar`) VALUES ('ARROGANT FROG SAUVIGNON BLANC', '2017-03-23', '7.99', '0');
INSERT INTO `Slijterij`.`Wijn` (`wijnnaam`, `brouwDatum`, `prijs`, `bewaarbaar`) VALUES ('TENUTA PIAN DELLE VIGNE BRUNELLO DI MONTALCINO', '2008-09-10', '62.99', '1');
INSERT INTO `Slijterij`.`Wijn` (`wijnnaam`, `brouwDatum`, `prijs`, `bewaarbaar`) VALUES ('VINO NOBILE DI MONTEPULCIANO ', '2013-05-28', '28.95', '1');
INSERT INTO `Slijterij`.`Wijn` (`wijnnaam`, `brouwDatum`, `prijs`, `bewaarbaar`) VALUES ('CHABLIS GRAND CRU LES BLANCHOTS', '2014-10-02', '49.95', '1');
INSERT INTO `Slijterij`.`Wijn` (`wijnnaam`, `brouwDatum`, `prijs`, `bewaarbaar`) VALUES ('ZONIN BARDOLINO CLASSICO ', '2017-04-12', '6.99', '0');


CREATE USER 'userSlijterij'@'localhost' IDENTIFIED BY 'userSlijterijPW';
GRANT ALL PRIVILEGES ON Slijterij . * TO 'userSlijterij'@'localhost';