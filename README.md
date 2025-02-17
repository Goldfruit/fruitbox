# Fruitbox Project
> **Node.js + Spring Boot + Docker Compose** – Ein Full-Stack-Projekt
![Node.js Badge](https://img.shields.io/badge/Node-16.x-brightgreen?logo=node.js)
![Java Badge](https://img.shields.io/badge/Java-17-blue?logo=java)

## Inhalt
1. [Überblick](#überblick)
2. [Voraussetzungen](#überblick)
2. [Ordnerstruktur](#ordnerstruktur)
3. [Installation & Start](#installation--start)
   1. [Node.js-App (lokal)](#nodejs-app-lokal)
   2. [Spring Boot (lokal)](#spring-boot-lokal)
   3. [Docker Compose](#docker-compose)
4. [Ports & Hinweise](#ports--hinweise)
5. [Autor & Lizenz](#autor--lizenz)


- **Node.js-App (Frontend)** im Ordner `app/`
- **Spring-Boot-API (Backend)** im Ordner `backend/springboot-api/`
- **MySQL-Datenbank** und **NGINX** per Docker Compose (Konfiguration in `configs/`)

## Voraussetzungen

- **Node.js** (empfohlen Version 16 oder höher)
- **Java** (empfohlen Version 17 oder höher)
- **Maven** (empfohlen 3.8.x)
- **Docker** + **Docker Compose**

## Ordnerstruktur


- **app/**: Node.js-Frontend (Dateien wie `index.js`, `package.json` usw.)
- **backend/springboot-api/**: Spring Boot Projekt (enthält `pom.xml` und Java-Code)
- **configs/**: Enthält Docker- und NGINX-Konfigurationen (z. B. `docker-compose.yaml`, `nginx.conf`)
- **docker-compose.yaml**: Definiert, wie Node.js, Spring Boot, MySQL und NGINX zusammen gestartet werden



## Installation & Start

### 1. Node.js-App (lokal)


```bash
cd app
npm install
npm start
Port: 3000
Abhängigkeiten: via package.json

cd backend/springboot-api
mvn clean package
java -jar target/springboot-api.jar
Port: 8080

cd ~/Goldfruit/Konfiguration/Domains_Hostings/fruitbox/configs
docker-compose up --build

Container Ports & URLs:
Node.js: Port 3000 ( http://localhost:3000)
Spring Boot: Port 8080 (http://localhost:8080)
NGINX: Port 80 (Zugriff über http://localhost3000)
MySQL: Port 3306 (intern im Docker-Netzwerk; externe Verbindung möglich, wenn gemappt)

NGINX lauscht auf Port 80 (Weiterleitung an Node.js + Spring Boot)

MySQL läuft auf Port 3306 (Umgebungsvariablen in docker-compose.yaml)

Node.js und Spring Boot werden als Container gestartet und sind über das NGINX-Routing erreichbar

DNS / Fruitbox.ch (optional)
Wenn du DNS-Einträge für goldfruit.ch oder fruitbox.ch gesetzt hast, kannst du diese auf die IP des Servers zeigen.

NGINX kann dann als Reverse Proxy agieren, damit http://goldfruit.ch oder http://fruitbox.ch auf deine Container verweist.

Datenbank & Persistenz
MySQL-Daten können in einem Docker Volume liegen (siehe docker-compose.yaml).
Für Backups könntest du mysqldump nutzen und die .sql-Dateien z. B. in Proton Drive via Rclone sichern.

Autor & Lizenz 
Autor: Philippe Gabathuler / Goldfruit
Lizenz: (optional) MIT License, GPL oder eine andere – je nach Bedarf.

