/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     16/05/2018 08.50.59                          */
/*==============================================================*/


drop table if exists BARANG;

drop table if exists PELANGGAN;

/*==============================================================*/
/* Table: BARANG                                                */
/*==============================================================*/
create table BARANG
(
   ID_BARANG            int not null,
   ID_PELANNGAN         int,
   NAMA_BARANG          varchar(20),
   HARGA                decimal(22),
   primary key (ID_BARANG)
);

/*==============================================================*/
/* Table: PELANGGAN                                             */
/*==============================================================*/
create table PELANGGAN
(
   ID_PELANNGAN         int not null,
   NAMA_PELANNGAN       varchar(30),
   ALAMAT               varchar(100),
   TELP                 int,
   EMAIL                varchar(30),
   primary key (ID_PELANNGAN)
);

alter table BARANG add constraint FK_MEMBELI foreign key (ID_PELANNGAN)
      references PELANGGAN (ID_PELANNGAN) on delete restrict on update restrict;

