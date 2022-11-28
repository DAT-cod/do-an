create database freshfood;
use freshfood;
create table  sanpham (
masanpham bigint  not null primary key auto_increment ,
tensanpham nvarchar(200),
ngaynhaphang timestamp not null,
hansudung timestamp not null,
giatien bigint not null,
maloaisanpham bigint not null,
soluong bigint not null,
macuahang bigint not null
);
create table loaisanpham(
tenloaisanpham nvarchar(255) not null,
maloaisanpham bigint auto_increment Not null primary key
);

create table cuahang(
macuahang bigint not null  primary key auto_increment,
diachi nvarchar(255) not null,
tencuahang nvarchar(255) not null,
doanhthu varchar(250) not null,
maloaicuahang int
);

create table loaicuahang(
maloaicuahang int auto_increment,
tenloaicuahang nvarchar(200),
primary key(maloaicuahang)
);

create table nhanvien(
manhanvien  bigint auto_increment not null primary key,
tennhanvien nvarchar(255) not null,
diachi nvarchar(255) not null,
sodienthoai int not null,
email nvarchar(255) not null,
matrangthai int not null, 
machucvu bigint not null,
makhau nvarchar(255),
macuahang bigint not null,
luong varchar(255) not null
);

create table trangthailamviec(
	matrangthai int auto_increment,
    tentrangthai nvarchar(100),
    primary key(matrangthai)
);

create table  chucvu
(
machucvu bigint not null primary key auto_increment,
tenchucvu nvarchar(255) not null
);

create table hoadon(
mahoadon bigint auto_increment not null primary key ,
ngayxuat timestamp not null,
makhachhang bigint not null,
matrangthai bigint not null,
manhanvien bigint not null
);
create table tinhtrangthanhtoan(
matrangthai bigint not null primary key auto_increment,
trangthai nvarchar(255) not null
);

create table chitiethoadon(
machitiethoadon bigint auto_increment,
mahoadon bigint  not null,
masanpham bigint  not null,
primary key(machitiethoadon)
);

create table khachhang(
makhachhang bigint not null primary key auto_increment,
tenkhachhang nvarchar(255) not null,
diachi nvarchar(255) not null,
sodienthoai nvarchar(255) not null
);
alter table hoadon add constraint fk_makhachhang foreign key (makhachhang) references khachhang(makhachhang);
alter table sanpham add constraint fk_macuahang foreign key(macuahang) references cuahang(macuahang);
alter table chitiethoadon add constraint fk_mahoadon foreign key (mahoadon) references hoadon(mahoadon);
alter table chitiethoadon add constraint fk_masanpham foreign key (masanpham) references sanpham(masanpham);
alter table hoadon add constraint fk_trangthai foreign key (matrangthai) references tinhtrangthanhtoan(matrangthai);
alter table sanpham add constraint fk_maloaisanpham  foreign key (maloaisanpham) references loaisanpham(maloaisanpham);
alter table nhanvien add constraint fk_machucvu foreign key (machucvu) references chucvu(machucvu);
alter table hoadon add constraint fk_manhanvien foreign key(manhanvien) references nhanvien(manhanvien);
alter table nhanvien add constraint fk_macuahangnhanvien foreign key(macuahang) references cuahang(macuahang);
alter table nhanvien add constraint fk_matrangthainhanvien foreign key(matrangthai) references trangthailamviec(matrangthai);
alter table cuahang add constraint fk_maloaicuahang foreign key(maloaicuahang) references loaicuahang(maloaicuahang);

