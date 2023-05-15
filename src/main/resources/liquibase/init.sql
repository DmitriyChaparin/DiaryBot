-- liquibase formatted sql
-- changeset chaparin:1

CREATE TABLE  notification_task
(
    id BIGINT generated by default as identity primary key,
    message TEXT not null,
    chat_id BIGINT not null,
    notification_data_time TIMESTAMP not null
);