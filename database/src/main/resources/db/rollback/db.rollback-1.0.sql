DROP INDEX PK_USER_ID ON USER_DATA;

ALTER TABLE USER_DATA
DROP CONSTRAINT UNIQUE_EMAIL;

ALTER TABLE USER_DATA
DROP CONSTRAINT UNIQUE_USERNAME;

DROP TABLE USER_DATA;
