DROP TABLE IF EXISTS account.account;
CREATE TABLE account.account
(
    `member_id`  varchar(64) COLLATE utf8mb4_bin NOT NULL,
    `email`      varchar(64) COLLATE utf8mb4_bin NOT NULL,
    `status`     tinyint(4) NOT NULL,
    `created_at` datetime(6) NOT NULL,
    `created_by` varchar(64) COLLATE utf8mb4_bin NOT NULL,
    `updated_at` datetime(6) DEFAULT NULL,
    `updated_by` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL,
    PRIMARY KEY (`member_id`),
    UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC;
