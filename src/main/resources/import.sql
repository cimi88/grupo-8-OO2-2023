INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 1, 'admin', '$2a$10$MtJ.LCpMv.O4hmlQvTngo.qSqoV4QIAViY6hzTVwv8UMre4TJ47ti');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (1, 1, "ROLE_ADMIN");

INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 2, 'auditor', '$2a$10$SukpGU3.i8gSo/VW.IFJ8.p5L1qLiByT1AHVeyOMcaaWjDygB/Wta');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (2, 2, "ROLE_AUDITOR");

INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (1, 'Noroeste');

INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (2, 'Noreste');

INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (3, 'Sureste');

INSERT INTO `sistema_iot`.`espacio` (`id`, `nombre`) VALUES (4, 'Suroeste'); 



INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `playa_llena`, `nombre`) VALUES (1, 0, 'playa 1');
INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `playa_llena`, `nombre`) VALUES (2, 0, 'playa 2');
INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `playa_llena`, `nombre`) VALUES (3, 0, 'playa 3');
INSERT INTO `sistema_iot`.`playa_estacionamiento` (`id`, `playa_llena`, `nombre`) VALUES (4, 0, 'playa 4');

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (1, 0, 1, 'lugar 1');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (2, 1, 1, 'lugar 2');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (3, 0, 1, 'lugar 3');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (4, 0, 1, 'lugar 4');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (5, 1, 1, 'lugar 5');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (6, 1, 1, 'lugar 6');

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (7, 0, 2, 'lugar 1');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (8, 1, 2, 'lugar 2');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (9, 0, 2, 'lugar 3');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (10, 0, 2, 'lugar 4');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (11, 1, 2, 'lugar 5');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (12, 1, 2, 'lugar 6');

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (13, 1, 3, 'lugar 1');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (14, 1, 3, 'lugar 2');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (15, 0, 3, 'lugar 3');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (16, 0, 3, 'lugar 4');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (17, 1, 3, 'lugar 5');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (18, 1, 3, 'lugar 6');

INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (19, 1, 4, 'lugar 1');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (20, 1, 4, 'lugar 2');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (21, 0, 4, 'lugar 3');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (22, 0, 4, 'lugar 4');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (23, 1, 4, 'lugar 5');
INSERT INTO `sistema_iot`.`lugar` (`id`, `lugar_libre`, `playa_estacionamiento_id`, `nombre_lugar`) VALUES (24, 1, 4, 'lugar 6');

INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (1, 1, 'dispo est 1', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (2, 1, 'dispo est 2', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (3, 1, 'dispo est 3', 1);
INSERT INTO `sistema_iot`.`dispositivo` (`id`, `en_alta`, `nombre`, `espacio_id`) VALUES (4, 1, 'dispo est 4', 1);

INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (1, 1);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (2, 2);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (3, 3);
INSERT INTO `sistema_iot`.`dispositivo_estacionamiento` (`id`, `lugar_id`) VALUES (4, 4);








