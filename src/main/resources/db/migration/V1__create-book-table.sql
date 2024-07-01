CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE books (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    image VARCHAR(100) NOT NULL,
    description VARCHAR(300) NOT NULL
);
