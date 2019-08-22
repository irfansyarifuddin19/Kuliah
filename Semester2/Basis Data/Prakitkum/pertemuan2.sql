/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2012                    */
/* Created on:     05/04/2018 16.17.45                          */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('RELASI') and o.name = 'FK_RELASI_RELASI_MAHASISW')
alter table RELASI
   drop constraint FK_RELASI_RELASI_MAHASISW
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('RELASI') and o.name = 'FK_RELASI_RELASI2_MATA_KUL')
alter table RELASI
   drop constraint FK_RELASI_RELASI2_MATA_KUL
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MAHASISWA')
            and   type = 'U')
   drop table MAHASISWA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MATA_KULIAH')
            and   type = 'U')
   drop table MATA_KULIAH
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('RELASI')
            and   name  = 'RELASI2_FK'
            and   indid > 0
            and   indid < 255)
   drop index RELASI.RELASI2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('RELASI')
            and   name  = 'RELASI_FK'
            and   indid > 0
            and   indid < 255)
   drop index RELASI.RELASI_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('RELASI')
            and   type = 'U')
   drop table RELASI
go

/*==============================================================*/
/* Table: MAHASISWA                                             */
/*==============================================================*/
create table MAHASISWA (
   NRP                  char(10)             not null,
   NAMA                 varchar(10)          null,
   JK                   varchar(10)          null,
   EMAIL                varchar(25)          null,
   constraint PK_MAHASISWA primary key nonclustered (NRP)
)
go

/*==============================================================*/
/* Table: MATA_KULIAH                                           */
/*==============================================================*/
create table MATA_KULIAH (
   KODEMK               varchar(8)           not null,
   NAMAMK               varchar(8)           null,
   SEMESTER             int                  null,
   SKS                  int                  null,
   constraint PK_MATA_KULIAH primary key nonclustered (KODEMK)
)
go

/*==============================================================*/
/* Table: RELASI                                                */
/*==============================================================*/
create table RELASI (
   NRP                  varchar(10)          not null,
   KODEMK               varchar(8)           not null,
   KODEAK               varchar(10)          not null,
   constraint PK_RELASI primary key (NRP, KODEMK, KODEAK)
)
go

/*==============================================================*/
/* Index: RELASI_FK                                             */
/*==============================================================*/
create index RELASI_FK on RELASI (
NRP ASC
)
go

/*==============================================================*/
/* Index: RELASI2_FK                                            */
/*==============================================================*/
create index RELASI2_FK on RELASI (
KODEMK ASC
)
go

alter table RELASI
   add constraint FK_RELASI_RELASI_MAHASISW foreign key (NRP)
      references MAHASISWA (NRP)
go

alter table RELASI
   add constraint FK_RELASI_RELASI2_MATA_KUL foreign key (KODEMK)
      references MATA_KULIAH (KODEMK)
go

