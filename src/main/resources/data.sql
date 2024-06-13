INSERT INTO category (id, name)
VALUES (0, 'Category1'),
       (1, 'Category2');

INSERT INTO tags (id, name)
VALUES (0, 'Tag1'),
       (1, 'Tag2'),
       (2, 'Tag3');


INSERT INTO pets (id, category_id, name, photoUrls, status, tag_id)
VALUES (0, 0, 'Pet1', 'https://example.com/pet1.jpg', 'available', 0), 
       (1, 1, 'Pet2', 'https://example.com/pet2.jpg', 'pending', 1),   
       (2, 0, 'Pet3', 'https://example.com/pet3.jpg', 'sold', 2);  