-- Migrations to add rank column to the users table
-- Migrations table is immutable
ALTER TABLE tb_users
ADD COLUMN rank VARCHAR(255);