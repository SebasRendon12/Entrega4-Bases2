----------------- Punto 5 -----------------
CREATE TABLE usuario (
    nombre_usuario   VARCHAR2(20) PRIMARY KEY,
    contrasena       VARCHAR2(20) NOT NULL,
    direccion        VARCHAR2(50) NOT NULL
);