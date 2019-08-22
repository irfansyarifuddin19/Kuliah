/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     10/05/2018 20.11.19                          */
/*==============================================================*/


drop table if exists PELANNGAN;

drop table if exists PESANAN;

drop table if exists RELATIONSHIP_1;

drop table if exists WARUNG;

/*==============================================================*/
/* Table: PELANNGAN                                             */
/*==============================================================*/
create table PELANNGAN
(
   ID_PESANAN           int,
   ID_PELANGGAN         int,
   NAMA_PELANGGAN       char(30),
   NO_HP                int
);

/*==============================================================*/
/* Table: PESANAN                                               */
/*==============================================================*/
create table PESANAN
(
   ID_PESANAN           int not null,
   NAMA_PEGAWAI         char(20),
   NOMER_MEJA           int,
   primary key (ID_PESANAN)
);

/*==============================================================*/
/* Table: RELATIONSHIP_1                                        */
/*==============================================================*/
create table RELATIONSHIP_1
(
   ID_WARUNG            int not null,
   ID_PESANAN           int not null,
   primary key (ID_WARUNG, ID_PESANAN)
);

/*==============================================================*/
/* Table: WARUNG                                                */
/*==============================================================*/
create table WARUNG
(
   ID_WARUNG            int not null,
   ALAMAT               text,
   NO_TELP              int,
   primary key (ID_WARUNG)
);

alter table PELANNGAN add constraint FK_RELATIONSHIP_3 foreign key (ID_PESANAN)
      references PESANAN (ID_PESANAN);

alter table RELATIONSHIP_1 add constraint FK_RELATIONSHIP_1 foreign key (ID_WARUNG)
      references WARUNG (ID_WARUNG);

alter table RELATIONSHIP_1 add constraint FK_RELATIONSHIP_2 foreign key (ID_PESANAN)
      references PESANAN (ID_PESANAN);

