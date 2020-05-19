 
create table cidade (
       id bigint not null auto_increment,
        nome varchar(255) not null,
        estado_id bigint not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table endereco (
       id bigint not null auto_increment,
        endereco_bairro varchar(255),
        endereco_cep varchar(255),
        endereco_complemento varchar(255),
        endereco_logradouro varchar(255),
        endereco_numero varchar(255),
        endereco_principal bit,
        endereco_cidade_id bigint,
        enderecos_id bigint not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table estado (
       id bigint not null auto_increment,
        nome varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table grupo (
       id bigint not null auto_increment,
        nome varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table grupo_permissao (
       grupo_id bigint not null,
        permissao_id bigint not null
    ) engine=InnoDB
Hibernate: 
    
    create table intercorrencia (
       id bigint not null auto_increment,
        titulo varchar(255) not null,
        intercorrencias_id bigint not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table permissao (
       id bigint not null auto_increment,
        descricao varchar(255) not null,
        nome varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table pessoa (
       dtype varchar(31) not null,
        id bigint not null auto_increment,
        nome varchar(255) not null,
        tiporesponsavel varchar(255),
        atributo_assistente varchar(255),
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table procedimento (
       id bigint not null auto_increment,
        nome varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table usuario (
       id bigint not null auto_increment,
        data_cadastro datetime not null,
        email varchar(255) not null,
        nome varchar(255) not null,
        senha varchar(255) not null,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table usuario_grupo (
       usuario_id bigint not null,
        grupo_id bigint not null
    ) engine=InnoDB
Hibernate: 
    
    alter table cidade 
       add constraint FKkworrwk40xj58kevvh3evi500 
       foreign key (estado_id) 
       references estado (id)
Hibernate: 
    
    alter table endereco 
       add constraint FKckypcp27tyiumw3tijodfj471 
       foreign key (endereco_cidade_id) 
       references cidade (id)
Hibernate: 
    
    alter table endereco 
       add constraint FKhrdakuk08b2bx16iwl8d986rg 
       foreign key (enderecos_id) 
       references pessoa (id)
Hibernate: 
    
    alter table grupo_permissao 
       add constraint FKh21kiw0y0hxg6birmdf2ef6vy 
       foreign key (permissao_id) 
       references permissao (id)
Hibernate: 
    
    alter table grupo_permissao 
       add constraint FKta4si8vh3f4jo3bsslvkscc2m 
       foreign key (grupo_id) 
       references grupo (id)
Hibernate: 
    
    alter table intercorrencia 
       add constraint FK2isjd7qprtmsy4ercrq2nwkp8 
       foreign key (intercorrencias_id) 
       references pessoa (id)
Hibernate: 
    
    alter table usuario_grupo 
       add constraint FKk30suuy31cq5u36m9am4om9ju 
       foreign key (grupo_id) 
       references grupo (id)
Hibernate: 
    
    alter table usuario_grupo 
       add constraint FKdofo9es0esuiahyw2q467crxw 
       foreign key (usuario_id) 
       references usuario (id)