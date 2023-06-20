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

-- insercion de DISPOSITIVOS:
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 1, 'aspersor1');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 2, 'aspersor2');
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 3, 'aspersor3');

-- insercion de ASPERSORES:
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (1, 1, '2023-06-20 07:00:00', '2023-06-20 07:05:00');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (1, 2, '2023-06-20 07:00:00', '2023-06-20 07:05:00');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (1, 3, '2023-06-20 07:00:00', '2023-06-20 07:05:00');
