CREATE TABLE "smartphone" (
  "id" uuid PRIMARY KEY,
  "brend_id" integer,
  "owner_id" integer,
  "model_id" integer,
  "title" varchar,
  "display_type" varchar,
  "features" varchar
);

CREATE TABLE "owner" (
  "id" uuid PRIMARY KEY,
  "name" varchar
);

CREATE TABLE "brend" (
  "id" serial PRIMARY KEY,
  "title" varchar
);

CREATE TABLE "model" (
  "id" serial PRIMARY KEY,
  "title" varchar,
  "brend_id" integer
);

ALTER TABLE "smartphone" ADD CONSTRAINT "model" FOREIGN KEY ("model_id") REFERENCES "model" ("id");

ALTER TABLE "model" ADD CONSTRAINT "model_brend" FOREIGN KEY ("brend_id") REFERENCES "brend" ("id");

ALTER TABLE "smartphone" ADD CONSTRAINT "smartphone_owner" FOREIGN KEY ("owner_id") REFERENCES "owner" ("id");
