create schema pfr_tender;

alter schema pfr_tender
owner to gestionnaire;


create table pfr_tender.profil
(id_profil serial not null,
nom_profil varchar(50) not null
);

alter table pfr_tender.profil
add constraint PK_PROFIL primary key (id_profil),
owner to gestionnaire;
;


create table pfr_tender.etat_compte
(id_etat_compte serial not null,
nom_etat_compte varchar(50) not null,
duree integer not null
);

alter table pfr_tender.etat_compte
add constraint PK_ETAT_COMPTE primary key (id_etat_compte),
owner to gestionnaire;
;


create table pfr_tender.domaine
(id_domaine serial not null,
nom_domaine varchar(50) not null
);

alter table pfr_tender.domaine
add constraint PK_DOMAINE primary key (id_domaine),
owner to gestionnaire;
;


create table pfr_tender.pays
(id_pays serial not null,
nom_pays varchar(50) not null
);

alter table pfr_tender.pays
add constraint PK_PAYS primary key (id_pays),
owner to gestionnaire;


create table pfr_tender.ville
(id_ville serial not null,
nom_ville varchar(50) not null,
code_postal varchar(50),
id_pays integer not null
);

alter table pfr_tender.ville
add constraint PK_VILLE primary key (id_ville),
add constraint FK_VILLE_PAYS foreign key (id_pays) references pfr_tender.pays (id_pays),
owner to gestionnaire;


create table pfr_tender.utilisateur
(id_utilisateur serial not null,
nom_utilisateur varchar(50) not null,
prenom_utilisateur varchar(50) not null,
site_web varchar(50),
telephone varchar(20) not null,
poste_occupe varchar(50),
email_utilisateur varchar(100) not null,
mot_de_passe_utilisateur varchar(100) not null,
siret varchar(20),
nom_entreprise varchar(100),
num_voie varchar(10),
adresse varchar(100),
complement_adresse varchar(150),
id_domaine integer not null,
id_ville integer not null
);

alter table pfr_tender.utilisateur
add constraint PK_UTILISATEUR primary key (id_utilisateur),
add constraint FK_UTILISATEUR_DOMAINE foreign key (id_domaine) references pfr_tender.domaine (id_domaine),
add constraint FK_UTILISATEUR_VILLE foreign key (id_ville) references pfr_tender.ville (id_ville),
owner to gestionnaire;
;


create table pfr_tender.utilisateur_profil
(id_utilisateur int not null,
id_profil int not null
);

alter table pfr_tender.utilisateur_profil
add constraint PK_UTILISATEUR_PROFIL primary key (id_utilisateur, id_profil),
add constraint FK_UTILISATEUR_PROFIL_UTILISATEUR foreign key (id_utilisateur) references pfr_tender.utilisateur (id_utilisateur),
add constraint FK_UTILISATEUR_PROFIL_PROFIL foreign key (id_profil) references pfr_tender.profil (id_profil),
owner to gestionnaire;
;


create table pfr_tender.utilisateur_etat_compte
(id_utilisateur int not null,
id_etat_compte int not null,
date_debut date not null
);

alter table pfr_tender.utilisateur_etat_compte
add constraint PK_UTILISATEUR_ETAT_COMPTE primary key (id_utilisateur, id_etat_compte, date_debut),
add constraint FK_UTILISATEUR_ETAT_COMPTE_UTILISATEUR foreign key (id_utilisateur) references pfr_tender.utilisateur (id_utilisateur),
add constraint FK_UTILISATEUR_ETAT_COMPTE_ETAT_COMPTE foreign key (id_etat_compte) references pfr_tender.etat_compte (id_etat_compte),
owner to gestionnaire;
;


create table pfr_tender.favori
(id_utilisateur int not null,
id_utilisateur_favori int not null
);

alter table pfr_tender.favori
add constraint PK_FAVORI primary key (id_utilisateur, id_utilisateur_favori),
add constraint FK_FAVORI_UTILISATEUR foreign key (id_utilisateur) references pfr_tender.utilisateur (id_utilisateur),
add constraint FK_FAVORI_UTILISATEUR_FAVORI foreign key (id_utilisateur_favori) references pfr_tender.utilisateur (id_utilisateur),
owner to gestionnaire;
;


create table pfr_tender.type_publication
(
id_type_publication serial not null,
nom_type_publication varchar(100) not null
);

alter table pfr_tender.type_publication
add constraint PK_TYPE_PUBLICATION primary key (id_type_publication),
owner to gestionnaire
;


create table pfr_tender.etat_publication
(
id_etat_publication serial not null,
nom_etat_publication varchar(50) not null
);

alter table pfr_tender.etat_publication
add constraint PK_ETAT_PUBLICATION primary key (id_etat_publication),
owner to gestionnaire
;


create table pfr_tender.statut_publication
(
id_statut_publication serial not null,
nom_statut_publication varchar(50) not null
);

alter table pfr_tender.statut_publication
add constraint PK_STATUT_PUBLICATION primary key (id_statut_publication),
owner to gestionnaire
;


create table pfr_tender.publication
(
id_publication serial not null,
nom_publication varchar(50) not null,
description_publication varchar(500) not null,
prix float not null,
type_produit varchar(50) not null,
date_publication date not null,
quantite integer,
id_utilisateur integer not null,
id_type_publication integer not null,
id_statut_publication integer not null,
id_etat_publication integer not null
);

alter table pfr_tender.publication
add constraint PK_PUBLICATION primary key (id_publication),
add constraint FK_PUBLICATION_UTILISATEUR foreign key (id_utilisateur) references pfr_tender.utilisateur (id_utilisateur),
add constraint FK_PUBLICATION_TYPE_PUBLICATION foreign key (id_type_publication) references pfr_tender.type_publication (id_type_publication),
add constraint FK_PUBLICATION_STATUT_PUBLICATION foreign key (id_statut_publication) references pfr_tender.statut_publication (id_statut_publication),
add constraint FK_PUBLICATION_ETAT_PUBLICATION foreign key (id_etat_publication) references pfr_tender.etat_publication (id_etat_publication),
owner to gestionnaire
;


create table pfr_tender.acces_publication
(id_utilisateur int not null,
id_publication int not null,
accessible boolean not null
);

alter table pfr_tender.acces_publication
add constraint PK_ACCES_PUBLICATION primary key (id_utilisateur, id_publication),
add constraint FK_ACCES_PUBLICATION_UTILISATEUR foreign key (id_utilisateur) references pfr_tender.utilisateur (id_utilisateur),
add constraint FK_ACCES_PUBLICATION_PUBLICATION foreign key (id_publication) references pfr_tender.publication (id_publication),
owner to gestionnaire;
;


CREATE TABLE pfr_tender.action_sur_utilisateur
(
id_action_sur_utilisateur serial NOT NULL,
nom_action_sur_utilisateur varchar(50) NOT NULL
)
;

alter table pfr_tender.action_sur_utilisateur
add constraint PK_ACTION_SUR_UTILISATEUR PRIMARY KEY (id_action_sur_utilisateur),
OWNER to gestionnaire
;


CREATE TABLE pfr_tender.action_sur_publication
(
id_action_sur_publication Serial NOT NULL,
nom_action_sur_publication varchar(50) NOT NULL
);

alter table pfr_tender.action_sur_publication
add constraint PK_ACTION_SUR_PUBLICATION PRIMARY KEY (id_action_sur_publication),
OWNER to gestionnaire
;


CREATE TABLE pfr_tender.admin
(
id_admin Serial NOT NULL,
mail_admin varchar(100) NOT NULL,
mot_de_passe_admin varchar(100) NOT NULL,
telephone varchar(20),
num_voie_admin varchar(10),
adresse_admin varchar(100),
complement_adresse_admin varchar(150),
id_ville integer not null
);

alter table pfr_tender.admin
add constraint PK_ADMIN PRIMARY KEY (id_admin),
add constraint FK_ADMIN_VILLE foreign key (id_ville) references pfr_tender.ville (id_ville),
OWNER to gestionnaire
;


CREATE TABLE pfr_tender.administrer_utilisateur
(
id_admin integer NOT NULL,
id_action_sur_utilisateur integer NOT NULL,
id_utilisateur integer NOT NULL,
date_action_sur_utilisateur date NOT NULL
);

alter table pfr_tender.administrer_utilisateur
add constraint PK_ADMINISTRER_UTILISATEUR PRIMARY KEY (id_admin, id_action_sur_utilisateur, id_utilisateur, date_action_sur_utilisateur),
add constraint FK_ADMINISTRER_UTILISATEUR_ADMIN foreign key (id_admin) references  pfr_tender.admin (id_admin),
add constraint FK_ADMINISTRER_UTILISATEUR_ACTION_SUR_UTILISATEUR FOREIGN KEY (id_action_sur_utilisateur) references pfr_tender.action_sur_utilisateur (id_action_sur_utilisateur),
add constraint FK_ADMINISTRER_UTILISATEUR_UTILISATEUR FOREIGN KEY (id_utilisateur) references  pfr_tender.utilisateur (id_utilisateur),
OWNER to gestionnaire
;


CREATE TABLE pfr_tender.administrer_publication
(
id_admin integer NOT NULL,
id_action_sur_publication integer NOT NULL,
id_publication integer NOT NULL,
date_action_sur_publication date NOT NULL
);

alter table pfr_tender.administrer_publication
add constraint PK_ADMINISTRER_PUBLICATION PRIMARY KEY (id_admin, id_action_sur_publication, id_publication, date_action_sur_publication),
add constraint PK_ADMINISTRER_PUBLICATION_ADMIN FOREIGN KEY (id_admin) references  pfr_tender.admin (id_admin),
add constraint PK_ADMINISTRER_PUBLICATION_ACTION_SUR_PUBLICATION FOREIGN KEY (id_action_sur_publication) references  pfr_tender.action_sur_publication (id_action_sur_publication),
add constraint PK_ADMINISTRER_PUBLICATION_PUBLICATION FOREIGN KEY (id_publication) references  pfr_tender.publication (id_publication),
OWNER to gestionnaire
;

create table pfr_tender.negocier
(
id_utilisateur int,
id_publication int,
id_negociation text,
date TIMESTAMP,
message text,
constraint PK_NEGOCIER primary key (id_utilisateur, id_publication, id_negociation, date),
constraint FK_NEGOCIER_UTILISATEUR foreign key (id_utilisateur) references pfr_tender.utilisateur(id_utilisateur),
constraint FK_NEGOCIER_PUBLICATION foreign key (id_publication) references pfr_tender.publication(id_publication)
);

alter table pfr_tender.negocier 
OWNER to gestionnaire
;


INSERT INTO pfr_tender.domaine (nom_domaine) VALUES ('poulet');
INSERT INTO pfr_tender.domaine (nom_domaine) VALUES ('cheval');

INSERT INTO pfr_tender.pays (nom_pays) VALUES ('france');
INSERT INTO pfr_tender.pays (nom_pays) VALUES ('allemagne');

INSERT INTO pfr_tender.ville (nom_ville, code_postal, id_pays) VALUES ('lille', '59000', 1);
INSERT INTO pfr_tender.ville (nom_ville, code_postal, id_pays) VALUES ('lens', '62000', 1);
INSERT INTO pfr_tender.ville (nom_ville, code_postal, id_pays) VALUES ('paris', '75000', 1);
INSERT INTO pfr_tender.ville (nom_ville, code_postal, id_pays) VALUES ('berlin', '10178', 2);

INSERT INTO pfr_tender.utilisateur (nom_utilisateur, prenom_utilisateur, site_web, telephone, poste_occupe, email_utilisateur, mot_de_passe_utilisateur, siret, nom_entreprise, num_voie, adresse, complement_adresse, id_domaine, id_ville)
VALUES ('nomTest', 'prenomTest', 'test.com', '0123456789', 'développeur', 'test@test.com', '9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08', '123 456 789', 'entrepriseTest', '25', 'rue du test', 'complementTest', 1, 1);

INSERT INTO pfr_tender.profil (nom_profil) VALUES ('grossiste');
INSERT INTO pfr_tender.profil (nom_profil) VALUES ('distributer');
INSERT INTO pfr_tender.profil (nom_profil) VALUES ('détaillant');

INSERT INTO pfr_tender.utilisateur_profil (id_utilisateur, id_profil) VALUES (1, 1);
INSERT INTO pfr_tender.utilisateur_profil (id_utilisateur, id_profil) VALUES (1, 2);
INSERT INTO pfr_tender.utilisateur_profil (id_utilisateur, id_profil) VALUES (1, 3);

INSERT INTO pfr_tender.etat_compte (nom_etat_compte, duree) VALUES ('actif', 0);
INSERT INTO pfr_tender.etat_compte (nom_etat_compte, duree) VALUES ('suspendu', 30);

INSERT INTO pfr_tender.utilisateur_etat_compte (id_utilisateur, id_etat_compte, date_debut) VALUES (1, 1, '2021-08-06');

INSERT INTO pfr_tender.type_publication (nom_type_publication) VALUES ('offre');
INSERT INTO pfr_tender.type_publication (nom_type_publication) VALUES ('demande');

INSERT INTO pfr_tender.statut_publication (nom_statut_publication) VALUES ('public');
INSERT INTO pfr_tender.statut_publication (nom_statut_publication) VALUES ('privé');

INSERT INTO pfr_tender.etat_publication (nom_etat_publication) VALUES ('en cours');
INSERT INTO pfr_tender.etat_publication (nom_etat_publication) VALUES ('archivé');
INSERT INTO pfr_tender.etat_publication (nom_etat_publication) VALUES ('suspendu');

INSERT INTO pfr_tender.publication (nom_publication, description_publication, prix, type_produit, date_publication, quantite, id_utilisateur, id_type_publication, id_statut_publication, id_etat_publication)
VALUES ('nomPublicationTest', 'descriptionTest', 60, 'typeTest', '2021-08-08', 20, 1, 1, 1, 1);

commit;

