create database multib;
use multib;

create table cliente(
nit_cliente varchar(128) primary key,
nombre varchar(128) not null,
direccion varchar(128) not null,
telefono varchar(128) not null,
correo varchar(128) not null
)engine=Innodb;

create table usuario(
id_usuario varchar(128) primary key,
nombre_usuario varchar(128) not null,
contraseña varchar(128) not null
)engine=innodb;

create table proveedor(
nit_proveedor varchar(128) primary key,
nombre_proveedor varchar(128) not null,
direccion varchar(128) not null
)engine=Innodb;

create table inventarios(
id_inventario varchar(80) primary key,
nombre varchar(80) not null
)engine=Innodb;

create table producto(
id_producto varchar(128) primary key,
nombre_produecto varchar(128) not null,
id_inventario varchar(80) not null,
id_proveedor varchar(128) not null,
existencias int not null,

foreign key (id_proveedor) references
proveedor(nit_proveedor),
foreign key (id_inventario) references
inventarios(id_inventario)
)engine=innodb;

create table compra_e(
id_compra varchar(80) primary key,
id_proveedor varchar(128) not null,
fecha date,
foreign key (id_proveedor) references
proveedor(nit_proveedor)
)engine=innodb;

create table compra_d(
id_compra varchar(80) primary key,
cantidad int not null,
producto varchar(80) not null,
total double not null,

foreign key (id_compra) references
compra_e(id_compra)
)engine=innodb;

create table venta_e(
id_venta varchar(80) primary key,
id_cliente varchar(128) not null,
fecha date,
foreign key (id_cliente) references
cliente(nit_cliente)
)engine=innodb;

create table venta_d(
id_venta varchar(80) primary key,
cantidad int not null,
producto varchar(80) not null,
total double not null,

foreign key (id_venta) references
venta_e(id_venta)
)engine=innodb;

create table cuentas(
id_cuenta varchar(80) primary key,
id_compra varchar(80),
id_venta varchar(80),
estado_cuenta double,
saldo_cuenta double,

foreign key (id_compra) references
compra_e(id_compra),
foreign key (id_venta) references
venta_e(id_venta)
)engine=innodb;

create table informe(
id_informe varchar(80) primary key,
nombre varchar(80) not null,
fecha date not null,
compras int not null,
id_cuenta varchar(80) not null,
saldo double not null,
id_usuario varchar(128),

foreign key (id_cuenta) references
cuentas(id_cuenta),
foreign key (id_usuario) references
usuario(id_usuario)
)engine=innodb;