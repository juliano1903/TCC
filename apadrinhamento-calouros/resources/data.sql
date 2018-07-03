insert into curso (id_curso, nome) values (curso_id_seq.nextval, 'Sistemas de Informação');
insert into curso (id_curso, nome) values (curso_id_seq.nextval, 'Ciência da Computação');
insert into curso (id_curso, nome) values (curso_id_seq.nextval, 'Engenharia de Software');

insert into evento (id_evento, data_evento, nome, descricao, local) values (evento_id_seq.nextval, (sysdate + 10), 'Evento de programação', 'Evento de programação para iniciantes', 'Faculdade de Informática');
insert into evento (id_evento, data_evento, nome, descricao, local ) values (evento_id_seq.nextval, (sysdate + 30), 'Palestra sobre inovação', 'Evento de arquitetura para iniciantes', 'Faculdade de Informática');
insert into evento (id_evento, data_evento, nome, descricao, local ) values (evento_id_seq.nextval, (sysdate + 25), 'Prova E2B', 'Prova do programa S2B', 'Faculdade de Informática');

insert into estrutura (id_estrutura, nome, descricao, local) values (estrutura_id_seq.nextval, 'Biblioteca', 'Biblioteca da PUCRS', 'Av. Ipiranga, 6681 – Prédio 16');
insert into estrutura (id_estrutura, nome, descricao, local) values (estrutura_id_seq.nextval, 'FIJO', 'Central de estágios', 'Av. Ipiranga, 6681, Prédio 2');


insert into tipo_usuario (id_tipo_usuario, descricao) values (tipo_usuario_id_seq.nextval, 'Aluno');
insert into tipo_usuario (id_tipo_usuario, descricao) values (tipo_usuario_id_seq.nextval, 'Coordenador');

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario, url_imagem_perfil)
values (usuario_id_seq.nextval, 1, 'llara.juliano@gmail.com', 'Aluno Calouro', '123456', null, sysdate, 1, 1, 'assets/imgs/juliano.jpg');
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario, url_imagem_perfil)
values (usuario_id_seq.nextval, 2, 'llara.juliano@gmail.com', 'Aluno veterano', '123456', null, sysdate - 360, 1, 1, 'assets/imgs/neimar.jpg');
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 3, 'llara.juliano@gmail.com', 'Teste veterano', '123456', null, sysdate - 360, 2, 1);
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 4, 'llara.juliano@gmail.com', 'Teste veterano', '123456', null, sysdate - 360, 2, 1);
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 5, 'llara.juliano@gmail.com', 'Teste veterano', '123456', null, sysdate - 360, 3, 1);
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 6, 'neimar.osbel@gmail.com', 'Neimar Dell Osbel', '123456', null, sysdate, 3, 1);
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 7, 'neimar.osbel@gmail.com', 'Neimar Dell Osbel', '123456', null, sysdate, 3, 1);
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario, url_imagem_perfil)
values (usuario_id_seq.nextval, 8, 'neimar.osbel@gmail.com', 'Coordenador', '123456', sysdate, sysdate, 1, 2, 'assets/imgs/avatardefault.png');
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 9, 'neimar.osbel@gmail.com', 'Marco Mangan', '123456', sysdate, sysdate, 2, 2);
insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 10, 'neimar.osbel@gmail.com', 'Afonso Salles', '123456', sysdate, sysdate, 3, 2);

--insert into vinculo_usuario(id_vinculo_usuario, id_usuario_calouro, id_usuario_veterano, data_vinculacao)
--values(vinculo_usuario_id_seq.nextval, 1, 2, sysdate);
