
--1
CREATE PROCEDURE Insertar_Vendedor
	@CedulaV int,
	@Nombre varchar(30),
	@Apellido varchar(30),
	@Correo varchar(30),
	@TelefonoV varchar(10),
	@CelularV varchar(10)
AS
BEGIN
	INSERT INTO tblVendedor VALUES (@CedulaV, @Nombre, @Apellido, @Correo,@TelefonoV,@CelularV) 
	SELECT tblVendedor.CedulaV
	FROM tblVendedor
	WHERE @CedulaV = tblVendedor.CedulaV
END;
--2
CREATE PROCEDURE Insertar_Propiedad
	@id_Propiedad int,
	@Cedula int,
	@IdTip_Propiedad int,
	@Direccion varchar(30),
	@Ciudad varchar(30),
	@Codigo_Postal varchar(30),
	@Superficie float,
	@Precio int,
	@Fecha_publi date,
	@Observaciones varchar(MAX),
	@Descripcion varchar(MAX),
	@Disponibilidad bit,
	@Estrato int,
	@Nro_Habitaciones int,
	@Arriendo bit,
	@imgRuta varchar (MAX),
	@imgPropiedad varbinary(MAX)

AS
BEGIN
	INSERT INTO tblPropiedad VALUES (@id_Propiedad, @Cedula, @IdTip_Propiedad, @Direccion, @Ciudad, @Codigo_Postal,
	@Superficie,@Precio,@Fecha_publi,@Observaciones,@Descripcion,@Disponibilidad,@Estrato,@Nro_Habitaciones,
	@Arriendo,@imgRuta,@imgPropiedad)

	SELECT tblPropiedad.CedulaV 
	FROM tblPropiedad
	join tblVendedor  on tblVendedor.CedulaV = tblPropiedad.CedulaV
	where @Cedula = tblVendedor.CedulaV
END;
--3
CREATE PROCEDURE Insertar_Comprador
	@CedulaC int,
	@Nombre varchar(30),
	@Apellido varchar(30),
	@Correo varchar(30),
	@TelefonoC varchar(10),
	@CelularC varchar(10)
AS
BEGIN
	INSERT INTO tblComprador VALUES (@CedulaC, @Nombre, @Apellido, @Correo,@TelefonoC,@CelularC) 
	SELECT tblComprador.CedulaC
	FROM tblComprador
	WHERE @CedulaC = tblComprador.CedulaC
END;

--4
CREATE PROCEDURE Insertar_Cita
	@Id_Cita int,
	@CedulaV int,
	@CedulaC int,
	@Id_Propiedad int,
	@Fecha varchar(30)
AS
BEGIN
	INSERT INTO tblCita VALUES (@Id_Cita, @CedulaV,@CedulaC,@Id_Propiedad,@Fecha)
END;

--5
CREATE PROCEDURE Eliminar_Propiedad
	@Id_Propiedad INT
AS
BEGIN
	DELETE FROM tblPropiedad
	WHERE Id_Propiedad = @id_Propiedad
END;

--6
CREATE PROCEDURE Eliminar_Cita
	@id_Cita int
	
AS
BEGIN
	DELETE FROM tblCita
	WHERE Id_Cita = @id_Cita
END;

--7
CREATE PROCEDURE Actualizar_Propiedad
	@ID int,
	@Disponibilidad bit,
	@Arriendo bit, 
	@Observaciones varchar(max),
	@descripcion varchar(max),
	@superficie float(53),
	@precio int,
	@Nro_vivi int
AS
BEGIN
	UPDATE tblPropiedad
	SET 
	Disponibilidad = @Disponibilidad,
	Arriendo = @Arriendo,
	Observaciones = @Observaciones,
	Descripcion = @descripcion,
	Superficie = @superficie,
	Precio = @precio,
	Nro_Habitacion = @Nro_vivi
	WHERE Id_Propiedad = @ID
END;

--8
CREATE PROCEDURE Actualizar_Cita
	@Id_Cita int,
	@Fecha varchar(30)
AS
BEGIN
	UPDATE tblCita
	SET
	Fecha_Cita = @Fecha
	WHERE Id_Cita = @Id_Cita
END;