--liquibase formatted sql

--changeset murilojatoba:1.0.0_001_DDL_CREATE_TABLE_TB_CIDADAO

create sequence if not exists cidadao.tb_cidadao_seq;
alter sequence cidadao.tb_cidadao_seq owner to postgres;

create table cidadao.tb_cidadao (
	id_cidadao int4 not null default nextval('cidadao.tb_cidadao_seq'),
	ds_nome varchar(200) not null,
	nr_cpf varchar(20) not null,
	cd_sexo varchar(1) not null,
	ds_endereco varchar(500) not null,
	constraint tb_cidadao_pk primary key (id_cidadao),
	constraint tb_cidadao_cc check (cd_sexo in ('M', 'F'))
);

--rollback drop table cidadao.tb_cidadao;
--rollback drop sequence cidadao.tb_cidadao_seq;
