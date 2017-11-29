# RIP
A minimal hibernate and jersey project

# Steps
- mvn archetype:generate -DgroupId=com.mkyong.rest -DartifactId=RESTfulExample -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
- mvn eclipse:eclipse -Dwtpversion=2.0

# DB
CREATE DATABASE IF NOT EXISTS jersey;
DROP TABLE IF EXISTS
    `jersey`.`users`;
CREATE TABLE `jersey`.`users`(
    `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NULL,
    `firstname` VARCHAR(45) NOT NULL,
    `lastname` VARCHAR(45) NULL,
    `email` VARCHAR(45) NULL,
    `address` VARCHAR(45) NULL,
    `phone` INT NULL,
    PRIMARY KEY(`username`)
)
