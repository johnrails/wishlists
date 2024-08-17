CREATE TABLE IF NOT EXISTS wishlists (
    id INT PRIMARY KEY NOT NULL,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS items (
    id INT PRIMARY KEY NOT NULL,
    url VARCHAR(255) NOT NULL,
    wishlist_id INT NOT NULL,
    FOREIGN KEY (wishlist_id) REFERENCES wishlists(id)
    );