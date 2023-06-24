INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 1, 'admin', '$2a$10$MtJ.LCpMv.O4hmlQvTngo.qSqoV4QIAViY6hzTVwv8UMre4TJ47ti');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (1, 1, "ROLE_ADMIN");

INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 2, 'auditor', '$2a$10$SukpGU3.i8gSo/VW.IFJ8.p5L1qLiByT1AHVeyOMcaaWjDygB/Wta');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (2, 2, "ROLE_AUDITOR");

INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noreste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Suroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Sureste');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 1, 'poste1');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 1, 20, 100, 'calle1');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 2, 'poste2');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 2, 40, 100, 'calle1');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 3, 'poste3');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 3, 60, 100, 'calle1');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 4, 'poste4');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 4, 80, 100, 'calle1');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 5, 'poste5');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 5, 20, 150, 'calle2');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 6, 'poste6');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 6, 40, 150, 'calle2');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 7, 'poste7');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 7, 60, 150, 'calle2');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 3, 8, 'poste8');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 8, 20, 200, 'calle1');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 3, 9, 'poste9');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 9, 40, 200, 'calle1');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 10, 'poste10');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 10, 20, 100, 'calle3');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 11, 'poste11');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 11, 40, 100, 'calle3');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 12, 'poste12');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 12, 60, 100, 'calle3');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 13, 'poste13');
INSERT INTO `sistema_iot`.`dispositivo_alumbrado` (`encendido`, `id`, `numeracion`, `potencia`, `senda`) VALUES (0, 13, 80, 100, 'calle3');

INSERT INTO `sistema_iot`.`evento` (`id`, `fecha_hora_registro`, `descripcion_evento`) VALUES (1, '2023-06-21 07:30:00', 'APAGAR LUCES');
INSERT INTO `sistema_iot`.`evento` (`id`, `fecha_hora_registro`, `descripcion_evento`) VALUES (2, '2023-06-21 18:30:00', 'ENCENDER LUCES');
