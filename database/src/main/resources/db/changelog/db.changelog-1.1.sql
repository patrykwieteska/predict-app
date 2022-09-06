--liquibase formatted sql
--changeset predict-app:1.1

ALTER TABLE USER_DATA
ADD COLUMN IS_ACTIVE TINYINT NOT NULL;


