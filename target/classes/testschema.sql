DROP TABLE IF EXISTS room CASCADE;
CREATE TABLE room (
    id INT AUTO_INCREMENT,
    room_type VARCHAR(255),
    room_rent DOUBLE,
    room_occupant VARCHAR(255),
    PRIMARY KEY (id)
);