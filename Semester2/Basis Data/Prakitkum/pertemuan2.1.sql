/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2012                    */
/* Created on:     11/04/2018 22.10.50                          */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MELAYANI') and o.name = 'FK_MELAYANI_MELAYANI_PEGAWAI')
alter table MELAYANI
   drop constraint FK_MELAYANI_MELAYANI_PEGAWAI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MELAYANI') and o.name = 'FK_MELAYANI_MELAYANI2_PELANGGA')
alter table MELAYANI
   drop constraint FK_MELAYANI_MELAYANI2_PELANGGA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MEMESAN') and o.name = 'FK_MEMESAN_MEMESAN_PELANGGA')
alter table MEMESAN
   drop constraint FK_MEMESAN_MEMESAN_PELANGGA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MEMESAN') and o.name = 'FK_MEMESAN_MEMESAN2_MAKANAN_')
alter table MEMESAN
   drop constraint FK_MEMESAN_MEMESAN2_MAKANAN_
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('PEGAWAI') and o.name = 'FK_PEGAWAI_MEMPUNYAI_CAFE')
alter table PEGAWAI
   drop constraint FK_PEGAWAI_MEMPUNYAI_CAFE
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CAFE')
            and   type = 'U')
   drop table CAFE
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MAKANAN___MINUMAN')
            and   type = 'U')
   drop table MAKANAN___MINUMAN
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('MELAYANI')
            and   name  = 'MELAYANI2_FK'
            and   indid > 0
            and   indid < 255)
   drop index MELAYANI.MELAYANI2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('MELAYANI')
            and   name  = 'MELAYANI_FK'
            and   indid > 0
            and   indid < 255)
   drop index MELAYANI.MELAYANI_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MELAYANI')
            and   type = 'U')
   drop table MELAYANI
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('MEMESAN')
            and   name  = 'MEMESAN2_FK'
            and   indid > 0
            and   indid < 255)
   drop index MEMESAN.MEMESAN2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('MEMESAN')
            and   name  = 'MEMESAN_FK'
            and   indid > 0
            and   indid < 255)
   drop index MEMESAN.MEMESAN_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MEMESAN')
            and   type = 'U')
   drop table MEMESAN
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('PEGAWAI')
            and   name  = 'MEMPUNYAI_FK'
            and   indid > 0
            and   indid < 255)
   drop index PEGAWAI.MEMPUNYAI_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PEGAWAI')
            and   type = 'U')
   drop table PEGAWAI
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PELANGGAN')
            and   type = 'U')
   drop table PELANGGAN
go

/*==============================================================*/
/* Table: CAFE                                                  */
/*==============================================================*/
create table CAFE (
   ID_CAFE              int                  not null,
   NAMA_CAFE            text                 not null,
   ALAMAT_CAFE          text                 not null,
   JAM_BUKA             datetime             not null,
   constraint PK_CAFE primary key nonclustered (ID_CAFE)
)
go

/*==============================================================*/
/* Table: MAKANAN___MINUMAN                                     */
/*==============================================================*/
create table MAKANAN___MINUMAN (
   ID_MAKANAN_MINUMAN   varchar(10)          not null,
   JENIS_MAKANAN        varchar(10)          null,
   HARGA_MAKANAN        float(10)            null,
   constraint PK_MAKANAN___MINUMAN primary key nonclustered (ID_MAKANAN_MINUMAN)
)
go

/*==============================================================*/
/* Table: MELAYANI                                              */
/*==============================================================*/
create table MELAYANI (
   ID_PEGAWAI           int                  not null,
   ID_USER              int                  not null,
   constraint PK_MELAYANI primary key (ID_PEGAWAI, ID_USER)
)
go

/*==============================================================*/
/* Index: MELAYANI_FK                                           */
/*==============================================================*/
create index MELAYANI_FK on MELAYANI (
ID_PEGAWAI ASC
)
go

/*==============================================================*/
/* Index: MELAYANI2_FK                                          */
/*==============================================================*/
create index MELAYANI2_FK on MELAYANI (
ID_USER ASC
)
go

/*==============================================================*/
/* Table: MEMESAN                                               */
/*==============================================================*/
create table MEMESAN (
   ID_USER              int                  not null,
   ID_MAKANAN_MINUMAN   varchar(10)          not null,
   constraint PK_MEMESAN primary key (ID_USER, ID_MAKANAN_MINUMAN)
)
go

/*==============================================================*/
/* Index: MEMESAN_FK                                            */
/*==============================================================*/
create index MEMESAN_FK on MEMESAN (
ID_USER ASC
)
go

/*==============================================================*/
/* Index: MEMESAN2_FK                                           */
/*==============================================================*/
create index MEMESAN2_FK on MEMESAN (
ID_MAKANAN_MINUMAN ASC
)
go

/*==============================================================*/
/* Table: PEGAWAI                                               */
/*==============================================================*/
create table PEGAWAI (
   ID_PEGAWAI           int                  not null,
   ID_CAFE              int                  null,
   NAMA_                text                 null,
   ALAMAT_PEGAWAI       text                 null,
   constraint PK_PEGAWAI primary key nonclustered (ID_PEGAWAI)
)
go

/*==============================================================*/
/* Index: MEMPUNYAI_FK                                          */
/*==============================================================*/
create index MEMPUNYAI_FK on PEGAWAI (
ID_CAFE ASC
)
go

/*==============================================================*/
/* Table: PELANGGAN                                             */
/*==============================================================*/
create table PELANGGAN (
   ID_USER              int                  not null,
   NAMA_USER            text                 null,
   ALAMAT_USER          text                 null,
   constraint PK_PELANGGAN primary key nonclustered (ID_USER)
)
go

alter table MELAYANI
   add constraint FK_MELAYANI_MELAYANI_PEGAWAI foreign key (ID_PEGAWAI)
      references PEGAWAI (ID_PEGAWAI)
go

alter table MELAYANI
   add constraint FK_MELAYANI_MELAYANI2_PELANGGA foreign key (ID_USER)
      references PELANGGAN (ID_USER)
go

alter table MEMESAN
   add constraint FK_MEMESAN_MEMESAN_PELANGGA foreign key (ID_USER)
      references PELANGGAN (ID_USER)
go

alter table MEMESAN
   add constraint FK_MEMESAN_MEMESAN2_MAKANAN_ foreign key (ID_MAKANAN_MINUMAN)
      references MAKANAN___MINUMAN (ID_MAKANAN_MINUMAN)
go

alter table PEGAWAI
   add constraint FK_PEGAWAI_MEMPUNYAI_CAFE foreign key (ID_CAFE)
      references CAFE (ID_CAFE)
go

