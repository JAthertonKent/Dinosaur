CREATE TABLE dinosaur
(
       dinosaur_id SERIAL PRIMARY KEY,
       name character varying(75) NOT NULL
);

INSERT INTO dinosaur (name) VALUES ('Triceratops');
INSERT INTO dinosaur (name) VALUES ('Stegosaurus');