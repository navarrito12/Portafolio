ALTER TABLE persons8
ADD surname VARCHAR(150);

ALTER TABLE persons8
RENAME COLUMN surname TO description;

ALTER TABLE persons8
MODIFY COLUMN descriptIon VARCHAR(250);

ALTER TABLE persons8
DROP COLUMN description;