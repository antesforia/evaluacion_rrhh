CREATE TABLE oferta_de_trabajo(
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    area VARCHAR (50),
    cargo VARCHAR (50),
    requisitos VARCHAR (50),
    sueldo_tope INT,
    fecha_de_cierre DATE,
    modalidad VARCHAR(50),
    beneficios VARCHAR (50),
    localidad VARCHAR (50),
    edad_maxima INT,
    aptitudes VARCHAR(50)
);

CREATE TABLE postulante(
    nombre VARCHAR(50),
    edad VARCHAR(50),
    fechaDeNacimiento DATE (50),
    genero char(1),
    dni VARCHAR(10),
    correo VARCHAR(50),
    telefono INT,
    experiencia char(2),
    direccion VARCHAR(50),
    centroDeEstudios VARCHAR(100),
    antecedentesPoliciales_Ruta boolean,
    aptitudes VARCHAR() 

)
