<<<<<<< HEAD
INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 1, 'admin', '$2a$10$MtJ.LCpMv.O4hmlQvTngo.qSqoV4QIAViY6hzTVwv8UMre4TJ47ti');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (1, 1, "ROLE_ADMIN");

INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 2, 'auditor', '$2a$10$SukpGU3.i8gSo/VW.IFJ8.p5L1qLiByT1AHVeyOMcaaWjDygB/Wta');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (2, 2, "ROLE_AUDITOR");
<<<<<<< HEAD

<<<<<<< HEAD

=======
>>>>>>> rama_santander
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noreste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Suroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Sureste');

<<<<<<< HEAD

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
<<<<<<< HEAD

INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (2, 'Noreste');

INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (3, 'Sureste');

INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (4, 'Suroeste'); 
=======
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

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 14, 'tacho1');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 14, 20);
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 15, 'tacho2');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 15, 50);
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 3, 16, 'tacho3');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 16, 44);
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 17, 'tacho4');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 17, 65);
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 18, 'tacho5');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 18, 30);
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 19, 'tacho6');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 19, 60);
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 3, 20, 'tacho7');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 20, 35);
INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 4, 21, 'tacho8');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 21, 25);

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 26, 'aspersor1');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 26, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 27, 'aspersor2');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 27, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 28, 'aspersor3');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 28, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 29, 'aspersor4');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 29, '2023-06-20 07:00:00', '2023-06-20 07:10:00');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 30, 'aspersor5');
INSERT INTO `sistema_iot`.`dispositivo_aspersor` (`encendido`, `id`, `fecha_hora_desde`, `fecha_hora_hasta`) VALUES (0, 30, '2023-06-20 07:00:00', '2023-06-20 07:10:00');


>>>>>>> rama_santander

INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `espacio`, `nombre`, `playa_llena`) VALUES (1, 'Noreste', 'playa 1', 0);
INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `espacio`, `nombre`, `playa_llena`) VALUES (2, 'Noroeste', 'playa 2', 0);
INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `espacio`, `nombre`, `playa_llena`) VALUES (3, 'Sureste', 'playa 3', 0);
INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `espacio`, `nombre`, `playa_llena`) VALUES (4, 'Suroeste', 'playa 4', 0);

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (1, 0, 1, 'lugar 1');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (2, 1, 1, 'lugar 2');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (3, 0, 1, 'lugar 3');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (4, 0, 1, 'lugar 4');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (5, 1, 1, 'lugar 5');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (6, 1, 1, 'lugar 6');

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (7, 0, 2, 'lugar 7');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (8, 1, 2, 'lugar 8');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (9, 0, 2, 'lugar 9');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (10, 0, 2, 'lugar 10');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (11, 1, 2, 'lugar 11');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (12, 1, 2, 'lugar 12');

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (13, 1, 3, 'lugar 13');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (14, 1, 3, 'lugar 14');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (15, 0, 3, 'lugar 15');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (16, 0, 3, 'lugar 16');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (17, 1, 3, 'lugar 17');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (18, 1, 3, 'lugar 18');

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (19, 1, 4, 'lugar 19');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (20, 1, 4, 'lugar 20');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (21, 0, 4, 'lugar 21');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (22, 0, 4, 'lugar 22');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (23, 1, 4, 'lugar 23');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (24, 1, 4, 'lugar 24');

<<<<<<< HEAD
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (1, 1, 'dispo est 1', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (2, 1, 'dispo est 2', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (3, 1, 'dispo est 3', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (4, 1, 'dispo est 4', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (5, 1, 'dispo est 5', 1);

INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (1, 1);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (2, 2);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (3, 3);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (4, 4);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (5, 5); 








=======
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
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
=======
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (31, 1, 'dispo est 1', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (32, 1, 'dispo est 2', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (33, 1, 'dispo est 3', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (34, 1, 'dispo est 4', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (35, 1, 'dispo est 5', 1);

INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (31, 1);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (32, 2);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (33, 3);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (34, 4);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (35, 5);
>>>>>>> rama_santander
