insert into curso (id_curso, nome) values (curso_id_seq.nextval, 'Sistemas de Informação');

insert into curso (id_curso, nome) values (curso_id_seq.nextval, 'Ciência da Computação');

insert into curso (id_curso, nome) values (curso_id_seq.nextval, 'Engenharia de Software');

insert into tipo_usuario (id_tipo_usuario, descricao) values (tipo_usuario_id_seq.nextval, 'Aluno');

insert into tipo_usuario (id_tipo_usuario, descricao) values (tipo_usuario_id_seq.nextval, 'Coordenador');

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 131110751, 'llara.juliano@gmail.com', 'Juliano Lara da Silva', '123456', null, sysdate, 1, 1);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 15213121751, 'llara.juliano@gmail.com', 'Teste veterano', '123456', null, sysdate - 360, 1, 1);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 155540751, 'llara.juliano@gmail.com', 'Teste veterano', '123456', null, sysdate - 360, 2, 1);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 212122121, 'llara.juliano@gmail.com', 'Teste veterano', '123456', null, sysdate - 360, 2, 1);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 545413132, 'llara.juliano@gmail.com', 'Teste veterano', '123456', null, sysdate - 360, 3, 1);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 123456789, 'neimar.osbel@gmail.com', 'Neimar Dell Osbel', '123456', null, sysdate, 3, 1);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 123456789, 'neimar.osbel@gmail.com', 'Neimar Dell Osbel', '123456', null, sysdate, 3, 1);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 123456789, 'neimar.osbel@gmail.com', 'Coord. SI', '123456', null, sysdate, 3, 2);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 123456789, 'neimar.osbel@gmail.com', 'Coord. CC', '123456', null, sysdate, 3, 2);

insert into usuario (id_usuario, matricula, email, nome, senha, data_aceite, data_matricula, id_curso, id_tipo_usuario)
values (usuario_id_seq.nextval, 123456789, 'neimar.osbel@gmail.com', 'Coord. ES', '123456', null, sysdate, 3, 2);
