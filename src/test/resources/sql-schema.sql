DROP TABLE IF EXISTS `customers`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `items`;

CREATE TABLE IF NOT EXISTS `items` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `product_name` VARCHAR(40) DEFAULT NULL,
    `value` FLOAT DEFAULT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `orders`;

CREATE TABLE IF NOT EXISTS `orders` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `customer_id` INT DEFAULT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `order_items`;

CREATE TABLE IF NOT EXISTS `order_items` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `product_id` INT DEFAULT NULL,
    `quantity` INT DEFAULT NULL,
    `order_id` INT DEFAULT NULL,
    PRIMARY KEY (`id`)
);

