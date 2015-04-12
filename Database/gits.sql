/*
Navicat PGSQL Data Transfer

Source Server         : postgres
Source Server Version : 90400
Source Host           : localhost:5432
Source Database       : gits
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90400
File Encoding         : 65001

Date: 2015-04-13 00:05:39
*/


-- ----------------------------
-- Sequence structure for articles_article_id_seq
-- ----------------------------
DROP SEQUENCE "public"."articles_article_id_seq";
CREATE SEQUENCE "public"."articles_article_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for categories_category_id_seq
-- ----------------------------
DROP SEQUENCE "public"."categories_category_id_seq";
CREATE SEQUENCE "public"."categories_category_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for users_user_id_seq
-- ----------------------------
DROP SEQUENCE "public"."users_user_id_seq";
CREATE SEQUENCE "public"."users_user_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Table structure for articles
-- ----------------------------
DROP TABLE IF EXISTS "public"."articles";
CREATE TABLE "public"."articles" (
"article_id" int4 DEFAULT nextval('articles_article_id_seq'::regclass) NOT NULL,
"title" varchar(1000) COLLATE "default",
"content" text COLLATE "default",
"user_id" int4 NOT NULL,
"category_id" int4 NOT NULL,
"createddate" timestamp(6),
"status" varchar(1) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of articles
-- ----------------------------

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS "public"."categories";
CREATE TABLE "public"."categories" (
"category_id" int4 DEFAULT nextval('categories_category_id_seq'::regclass) NOT NULL,
"name" varchar(100) COLLATE "default",
"description" varchar(100) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of categories
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS "public"."users";
CREATE TABLE "public"."users" (
"user_id" int4 DEFAULT nextval('users_user_id_seq'::regclass) NOT NULL,
"name" varchar(100) COLLATE "default",
"email" varchar(100) COLLATE "default",
"password" varchar(100) COLLATE "default",
"status" varchar(1) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of users
-- ----------------------------

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "public"."articles_article_id_seq" OWNED BY "articles"."article_id";
ALTER SEQUENCE "public"."categories_category_id_seq" OWNED BY "categories"."category_id";
ALTER SEQUENCE "public"."users_user_id_seq" OWNED BY "users"."user_id";

-- ----------------------------
-- Primary Key structure for table categories
-- ----------------------------
ALTER TABLE "public"."categories" ADD PRIMARY KEY ("category_id");

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE "public"."users" ADD PRIMARY KEY ("user_id");

-- ----------------------------
-- Foreign Key structure for table "public"."articles"
-- ----------------------------
ALTER TABLE "public"."articles" ADD FOREIGN KEY ("user_id") REFERENCES "public"."users" ("user_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."articles" ADD FOREIGN KEY ("category_id") REFERENCES "public"."categories" ("category_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
