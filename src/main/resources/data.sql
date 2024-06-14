INSERT INTO categories (id, name) VALUES 
(1, '柴犬'),
(2, 'ゴールデンレトリバー'),
(3, 'トイプードル'),
(4, 'チワワ'),
(5, '三毛猫'),
(6, 'マンチカン'),
(7, 'スコティッシュフォールド');

INSERT INTO tags (id, name) VALUES 
(1, 'いぬ'),
(2, 'ねこ'),
(3, 'かわいい'),
(4, 'もふもふ'),
(5, '白'),
(6, '茶色'),
(7, '元気'),
(8, 'おとなしい');

INSERT INTO pets (category_id, name, status) VALUES 
(1, 'むぎ', 'available'),
(1, 'ぽち', 'sold'),
(2, 'マル', 'available'),
(5, 'たま', 'available'),
(6, 'しゃけ', 'sold');

INSERT INTO pet_tags (pet_id, tag_id) VALUES 
(1, 1),
(1, 4),
(2, 1),
(3, 3),
(4, 2),
(4, 8),
(5, 2),
(5, 5),
(5, 7);

INSERT INTO petphotos (pet_id, url) VALUES 
(1, 'http://example.com/buddy1.jpg'),
(1, 'http://example.com/buddy2.jpg'),
(2, 'http://example.com/max1.jpg'),
(3, 'http://example.com/whiskers1.jpg');