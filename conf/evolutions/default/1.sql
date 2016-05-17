# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table don (
  id                        integer auto_increment not null,
  user_id                   integer,
  project_id                integer,
  montant                   integer,
  type_dons                 integer,
  date                      datetime,
  description               longtext,
  accept                    tinyint(1) default 0,
  constraint pk_don primary key (id))
;

create table event (
  id                        integer auto_increment not null,
  title                     varchar(255),
  description               varchar(255),
  is_validate               tinyint(1) default 0,
  nbr_tickets_total         integer,
  ticket_price              integer,
  nbr_purchased_tickets     integer,
  constraint pk_event primary key (id))
;

create table project (
  id                        integer auto_increment not null,
  title                     varchar(255),
  description               varchar(255),
  id_parent                 integer,
  total_amount              integer,
  donation_amount           integer,
  is_validate               tinyint(1) default 0,
  is_completed              tinyint(1) default 0,
  constraint pk_project primary key (id))
;

create table user (
  id                        integer auto_increment not null,
  adresse_mail              varchar(255) not null,
  mot_de_passe              varchar(255) not null,
  adresse_maison            varchar(255) not null,
  code_postal               integer not null,
  date_de_naissance         datetime not null,
  nom                       varchar(255) not null,
  permission                tinyint not null,
  prenom                    varchar(255) not null,
  sexe                      varchar(255) not null,
  ville                     varchar(255) not null,
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table don;

drop table event;

drop table project;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

