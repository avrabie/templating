CREATE TABLE tutorial
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(255),
    description TEXT,
    published   BOOLEAN
);