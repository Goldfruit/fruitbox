# Wähle ein Node-Image (Version 16) als Basis
FROM node:16-alpine

# Setze das Arbeitsverzeichnis im Container
WORKDIR /usr/src/app

# Kopiere zuerst die package-Dateien aus dem Ordner 'app'
# (bezogen auf den Build-Kontext 'fruitbox' in docker-compose)
COPY app/package*.json ./

# Installiere die Dependencies
RUN npm install

# Kopiere nun den gesamten Code aus dem Ordner 'app'
COPY app/. .

# Der Container soll Port 3000 bereitstellen
EXPOSE 3000

# Standard-Kommando: Starte deine Node-App
CMD ["npm", "start"]
