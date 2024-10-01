create database COMPRA_VENTA_

USE COMPRA_VENTA_

CREATE TABLE tblComprador
(
CedulaC int primary key,
Nombre varchar(30) not null,
Apellido varchar(30) not null,
Correo varchar(80) not null,
telefonoC varchar(10)  not null,
CelularC varchar(10) not null
)

CREATE TABLE tblVendedor
(
CedulaV int primary key,
Nombre varchar(30) not null,
Apellido varchar(30) not null,
Correo varchar(80) not null,
telefonoV varchar(10)  not null,
CelularV varchar(10) not null
)

CREATE TABLE tblUsuarioVendedor
(
idUsuario int identity primary key,
CedulaV int null, 
Usuario varchar(40) not null,
Contraseña varchar(40) not null,
foreign key (CedulaV) references tblVendedor(CedulaV),
)

CREATE TABLE tblUsuarioComprador
(
idUsuario int identity primary key,
CedulaC int null, 
Usuario varchar(40) not null,
Contraseña varchar(40) not null,
foreign key (CedulaC) references tblComprador(CedulaC),
)

CREATE TABLE tblTipo_Propiedad
(
IdTipo_Propiedad int primary key,
Tipo_Propiedad varchar(50) not null
)

CREATE TABLE tblPropiedad
(
Id_Propiedad int primary key,
CedulaV int not null,
IdTipo_Propiedad int not null,
Direccion varchar(60) not null,
Ciudad varchar(30) not null,
Codigo_Postal int not null,
Superficie float not null,
Precio int not null,
Fecha_publicacion varchar(30) not null,
Observaciones varchar(MAX) not null,
Descripcion varchar(MAX) not null,
Disponibilidad bit not null,
Estrato int not null,
Nro_Habitacion int not null,
Arriendo bit not null,
imgRuta varchar(MAX) null,
imgPropiedad varbinary(MAX) null
foreign key (CedulaV) references tblVendedor(CedulaV),
foreign key (IdTipo_Propiedad) references tblTipo_Propiedad(IdTipo_Propiedad)
)

CREATE TABLE tblCita
(
Id_Cita int primary key,
CedulaV int not null,
CedulaC int not null,
Id_Propiedad int not null,
Fecha_Cita varchar(30) not null,
foreign key (CedulaV) references tblVendedor(CedulaV),
foreign key (CedulaC) references tblComprador(CedulaC),
foreign key (Id_Propiedad) references tblPropiedad(Id_Propiedad)
)

CREATE TABLE tblMetodo_Pago
(
Id_Metodo_Pago int primary key,
Descripcion varchar(40)
)

CREATE TABLE tblTransaccion
(
Id_transaccion int primary key,
Id_Propiedad int,
CedulaC int not null,
CedulaV int not null,
Id_Metodo_Pago int not null,
Fecha_Transaccion varchar(30) not null,
total float not null,
foreign key (CedulaC) references tblComprador(CedulaC),
foreign key (Id_Propiedad) references tblPropiedad(Id_Propiedad),
foreign key (CedulaV) references tblVendedor(CedulaV),
foreign key (Id_Metodo_Pago) references tblMetodo_Pago (Id_Metodo_Pago)
)

CREATE TABLE tblDetalleTransaccion
(
Id_transaccion int not null,
Id_Cita int not null,
foreign key (Id_transaccion) references tbltransaccion(Id_transaccion),
foreign key (Id_Cita) references tblCita(Id_Cita)
)