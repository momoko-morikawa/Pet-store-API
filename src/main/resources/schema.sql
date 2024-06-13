DROP TABLE IF EXISTS pets;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS tags;


CREATE TABLE category (
    id INTEGER PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE tags (
    id INTEGER PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE pets (
    id INTEGER PRIMARY KEY,
    category_id INTEGER,
    name VARCHAR(255),
    photoUrls VARCHAR(255), 
    status VARCHAR(50),
    tag_id INTEGER,
    FOREIGN KEY (category_id) REFERENCES category(id),
    FOREIGN KEY (tag_id) REFERENCES tags(id)
);