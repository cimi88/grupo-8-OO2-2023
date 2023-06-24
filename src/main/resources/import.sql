<<<<<<< HEAD
INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 1, 'admin', '$2a$10$MtJ.LCpMv.O4hmlQvTngo.qSqoV4QIAViY6hzTVwv8UMre4TJ47ti');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (1, 1, "ROLE_ADMIN");

INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 2, 'auditor', '$2a$10$SukpGU3.i8gSo/VW.IFJ8.p5L1qLiByT1AHVeyOMcaaWjDygB/Wta');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (2, 2, "ROLE_AUDITOR");
=======
-- insert usuario y clave para ADMIN:
INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 1, 'admin', '$2a$10$6Z60cSEyo7npY244KLAHhuOZsMRj1yFswXO2sPH3Z3bFAU4hn.O66');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (1, 1, "ROLE_ADMIN");


-- insert usuario y clave para AUDITOR: 
INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 2, 'auditor', '$2a$10$5hmG7dtqmyk1vtODTgrggucqjZOCELhfdOLjgVJmi4iKb9fZA/Dqm');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (2, 2, "ROLE_AUDITOR");


-- insercion de ESPACIOS:
INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (1, 'Noroeste');
INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (2, 'Noreste');
INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (3, 'Suroeste');
INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (4, 'Sureste');


-- insercion de DISPOSITIVOS y ASPERSORES:
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 1, 'aspersor1');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 1, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 2, 'aspersor2');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 2, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 3, 'aspersor3');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 3, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 4, 'aspersor4');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 4, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 5, 'aspersor5');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 5, '2023-06-20 07:00:00', '2023-06-20 07:10:00');
>>>>>>> rama_salgueiro
