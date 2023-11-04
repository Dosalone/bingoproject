CREATE TABLE bingoes (
    id bigserial PRIMARY KEY,
    name text NOT NULL,
    format_id INT NOT NULL REFERENCES formats(id)
);