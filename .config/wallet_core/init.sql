USE wallet;

CREATE TABLE clients (id varchar(255), name varchar(255), email varchar(255), created_at date);
CREATE TABLE accounts (id varchar(255), client_id varchar(255), balance int, created_at date);
CREATE TABLE transactions (id varchar(255), account_id_from varchar(255), account_id_to varchar(255), amount int, created_at date);

INSERT INTO clients(id, name, email, created_at) VALUES ("164abb53-921c-46fe-90b1-45c7a34e0bed", "John A", "johna@mail.com", NOW());
INSERT INTO clients(id, name, email, created_at) VALUES ("af176b1c-28af-4ed2-acf0-fc160ee751ae", "John B", "johnb@mail.com", NOW());

INSERT INTO accounts(id, client_id, balance, created_at) VALUES ("f5fd4921-412e-4550-b6f0-2a0e8db728a1", "164abb53-921c-46fe-90b1-45c7a34e0bed", 1000, NOW());
INSERT INTO accounts(id, client_id, balance, created_at) VALUES ("e640ab99-e863-497d-b464-5eebbf65ebe4", "af176b1c-28af-4ed2-acf0-fc160ee751ae", 1000, NOW());