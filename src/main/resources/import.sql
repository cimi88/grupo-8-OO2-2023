<<<<<<< HEAD
INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 1, 'admin', '$2a$10$MtJ.LCpMv.O4hmlQvTngo.qSqoV4QIAViY6hzTVwv8UMre4TJ47ti');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (1, 1, "ROLE_ADMIN");

INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 2, 'auditor', '$2a$10$SukpGU3.i8gSo/VW.IFJ8.p5L1qLiByT1AHVeyOMcaaWjDygB/Wta');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (2, 2, "ROLE_AUDITOR");
<<<<<<< HEAD


INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noreste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Suroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Sureste');


// creando dispositivos de basura
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 1, 'tacho1');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 1, 20);


INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 2, 'tacho2');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 2, 50);

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 3, 3, 'tacho3');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 3, 44);


INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 4, 'tacho4');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 4, 65);

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 5, 'tacho5');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 5, 30);


INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 6, 'tacho6');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 6, 60);

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 3, 7, 'tacho7');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 7, 35);


INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 8, 'tacho8');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 8, 25);

INSERT INTO `sistema_iot`.`evento` (`id`, `fecha_hora_registro`, `descripcion_evento`) VALUES (1, '2023-06-21 07:30:00', 'CAPACIDAD AUN INCOMPLETA');
INSERT INTO `sistema_iot`.`evento` (`id`, `fecha_hora_registro`, `descripcion_evento`) VALUES (2, '2023-06-21 18:30:00', 'RECOGER BASURA');
=======
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
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
