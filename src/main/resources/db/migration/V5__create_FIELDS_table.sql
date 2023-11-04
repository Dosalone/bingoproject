CREATE TABLE fields (
    id bigserial PRIMARY KEY,
    bingo_id INT NOT NULL REFERENCES bingoes(id),
    field text,
    field_x INT NOT NULL,
    field_y INT NOT NULL
);