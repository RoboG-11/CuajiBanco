-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-10-2021 a las 02:26:30
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_cuajibanco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `ID_cliente` int(11) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ApellidoP` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ApellidoM` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Direccion` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Telefono` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Correo` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `RFC` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nacimiento` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`ID_cliente`, `Nombre`, `ApellidoP`, `ApellidoM`, `Direccion`, `Telefono`, `Correo`, `RFC`, `Nacimiento`, `Status`) VALUES
(421800, 'Admin', 'Admin', 'Admin', 'Admin', 'Admin', 'Admin', 'Admin', 'Admin', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `ID_cuenta` int(20) NOT NULL,
  `Creacion` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Saldo` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Cliente_ID` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`ID_cuenta`, `Creacion`, `Saldo`, `Cliente_ID`) VALUES
(431900, 'admin', 'Admin', 421800);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `ID_movimiento` double NOT NULL,
  `Tipo_transaccion` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Fecha_Hora` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Cliente_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta`
--

CREATE TABLE `tarjeta` (
  `ID_tarjeta` bigint(16) NOT NULL,
  `Cod_seg` varchar(3) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Vencimiento` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NIP` varchar(4) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Cuenta_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tarjeta`
--

INSERT INTO `tarjeta` (`ID_tarjeta`, `Cod_seg`, `Vencimiento`, `NIP`, `Cuenta_ID`) VALUES
(4152786496350000, '000', '000', '0000', 431900);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID_cliente`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`ID_cuenta`),
  ADD KEY `Cliente_ID` (`Cliente_ID`);

--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`ID_movimiento`),
  ADD KEY `Cliente_ID` (`Cliente_ID`);

--
-- Indices de la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD PRIMARY KEY (`ID_tarjeta`),
  ADD KEY `Cuenta_ID` (`Cuenta_ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `ID_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=421801;

--
-- AUTO_INCREMENT de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  MODIFY `ID_cuenta` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=431901;

--
-- AUTO_INCREMENT de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  MODIFY `ID_movimiento` double NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  MODIFY `ID_tarjeta` bigint(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4152786496350001;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD CONSTRAINT `cuenta_ibfk_1` FOREIGN KEY (`Cliente_ID`) REFERENCES `cliente` (`ID_cliente`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD CONSTRAINT `movimiento_ibfk_1` FOREIGN KEY (`Cliente_ID`) REFERENCES `cliente` (`ID_cliente`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD CONSTRAINT `tarjeta_ibfk_1` FOREIGN KEY (`Cuenta_ID`) REFERENCES `cuenta` (`ID_cuenta`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
