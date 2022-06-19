CREATE TABLE adotante(
    id_adotante int auto_increment primary key,
    nome varchar(255) not null,
    sobrenome varchar(255) not null,
    email varchar(255) not null,
    telefone varchar(255) not null,
    idade varchar(255) not null,
    descricao_perfil varchar(255) not null,
    senha varchar(255) not null,
);