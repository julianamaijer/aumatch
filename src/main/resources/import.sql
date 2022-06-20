INSERT INTO endereco (id_endereco, rua, numero, complemento, cep, cidade, estado, localizacao) VALUES (1, 'Rua das Flores', '33', '-', '03543-950', 'São Paulo', 'SP', 5);
INSERT INTO endereco (id_endereco, rua, numero, complemento, cep, cidade, estado, localizacao) VALUES (2, 'Rua dos Campos', '144', '-', '03353-980', 'São Paulo', 'SP', 10);

INSERT INTO ong (id_ong, razao_social, cnpj, id_endereco) VALUES (1, 'ONG Animal Feliz', '11234212342342', 1);
INSERT INTO ong (id_ong, razao_social, cnpj, id_endereco) VALUES (2, 'ONG Cantinho dos Animais', '32433455323435', 2);


INSERT INTO animal (id_animal, nome, raca, idade, porte, tipo_animal, sexo, descricao, foto, id_ong) VALUES (1, 'Lulu', 'sem raça definida', 18, 'pequeno', 'fêmea','cão','https://randomuser.me/api/portraits/women/9.jpg', 'essa eh a descricao temp', 1);
INSERT INTO animal (id_animal, nome, raca, idade, porte, tipo_animal, sexo, descricao, foto, id_ong) VALUES (2, 'Dengoso', 'sem raça definida', 30, 'médio', 'gato', 'macho','https://randomuser.me/api/portraits/women/1.jpg', 'essa eh a descricao temp', 2);
