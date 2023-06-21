INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 1, 'admin', '$2a$10$MtJ.LCpMv.O4hmlQvTngo.qSqoV4QIAViY6hzTVwv8UMre4TJ47ti');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (1, 1, "ROLE_ADMIN");

INSERT INTO `sistema_iot`.`usuario` (`enabled`, `id`, `username`, `password`) VALUES (1, 2, 'auditor', '$2a$10$SukpGU3.i8gSo/VW.IFJ8.p5L1qLiByT1AHVeyOMcaaWjDygB/Wta');
INSERT INTO `sistema_iot`.`user_role` (`id`,`user_id`,`role`) VALUES (2, 2, "ROLE_AUDITOR");


INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Noreste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Suroeste');
INSERT INTO `sistema_iot`.`espacio` (`nombre`) VALUES ('Sureste');

INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 1, 1, 'tacho1');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 1, 20);


INSERT INTO `sistema_iot`.`dispositivo` (`en_alta`, `espacio_id`, `id`, `nombre`) VALUES (1, 2, 2, 'tacho2');
INSERT INTO `sistema_iot`.`dispositivo_basura` (`lleno`, `id`, `capacidad_litros`) VALUES (0, 2, 50);


