INSERT INTO endereco (id_endereco, rua, numero, complemento, cep, cidade, estado) VALUES (1, 'Rua das Flores', '33', '-', '03543-950', 'São Paulo', 'SP');
INSERT INTO endereco (id_endereco, rua, numero, complemento, cep, cidade, estado) VALUES (2, 'Rua dos Campos', '144', '-', '03353-980', 'São Paulo', 'SP');

INSERT INTO ong (id_ong, razao_social, cnpj, id_endereco) VALUES (1, 'ONG Animal Feliz', '11234212342342', 1);
INSERT INTO ong (id_ong, razao_social, cnpj, id_endereco) VALUES (2, 'ONG Cantinho dos Animais', '32433455323435', 2);


INSERT INTO animal (id_animal, nome, raca, idade, porte, tipo_animal, sexo, descricao, foto, id_ong) VALUES (1, 'Lulu', 'sem raça definida', 2, 'pequeno', 'cao','femea','O Lulu é um cachorro que adora brincar com crianças! Extremamente ativo, exige bastante atenção de seus tutores!', 'https://cdn2.thedogapi.com/images/ygzwOZd_L.jpg', 1);
INSERT INTO animal (id_animal, nome, raca, idade, porte, tipo_animal, sexo, descricao, foto, id_ong) VALUES (2, 'Fininho', 'sem raça definida', 2, 'pequeno', 'cao','femea','essa eh a descricao temp!', 'https://cdn2.thedogapi.com/images/SyYtQe5V7_150x150.jpg', 1);
INSERT INTO animal (id_animal, nome, raca, idade, porte, tipo_animal, sexo, descricao, foto, id_ong) VALUES (3, 'Dengoso', 'sem raça definida', 5, 'medio', 'gato', 'macho','essa eh a descricao temp', 'https://cdn2.thecatapi.com/images/19t.gif', 2);
INSERT INTO animal (id_animal, nome, raca, idade, porte, tipo_animal, sexo, descricao, foto, id_ong) VALUES (4, 'Pablo', 'sem raça definida', 5, 'medio', 'gato', 'macho','essa eh a descricao temp', 'https://cdn2.thecatapi.com/images/6Wf5q65oZ.jpg', 2);
