insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Ceará');

insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 1);
insert into cidade (id, nome, estado_id) values (2, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 2);
insert into cidade (id, nome, estado_id) values (4, 'Campinas', 2);
insert into cidade (id, nome, estado_id) values (5, 'Fortaleza', 3);

insert into pessoa (id,nome) values (1, 'andré');
insert into pessoa (id,nome) values (2, 'alysson');
insert into pessoa (id,nome) values (3, 'cahu');
insert into pessoa (id,nome) values (4, 'nicolas');

insert into responsavel (id) values (1);
insert into assistido (id) values (1);
insert into assistente (id) values (1);

insert into telefone (id, codigo_pais, ddd, telefone, principal, pessoa_id) values (1, '55', '71', '88178835', true, 1);
insert into telefone (id, codigo_pais, ddd, telefone, principal, pessoa_id) values (2, '55', '91', '99999999', false, 1);

insert into email (id, email, principal, pessoa_id) values (1, 'principal@email.com', true, 1);
insert into email (id, email, principal, pessoa_id) values (2, 'secundario@email.com', false, 1);

insert into endereco (id, bairro, cep, logradouro, numero, principal, cidade_id, pessoa_id) values (1, 'asa norte', '70790902', 'rua', '911', true, 1,1);

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_CUIDADOR', 'Permite consultar cuidadores');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_CUIDADOR', 'Permite editar cuidadores');