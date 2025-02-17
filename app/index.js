// Importiere das Express-Modul
const express = require('express');

// Erstelle eine neue Express-App
const app = express();

// Definiere einen Port
const PORT = 3000;

// Erstelle eine einfache Route
app.get('/', (req, res) => {
  res.send('Hallo Welt! Willkommen zu deiner FruitBox-App, DU BIST GOLDRICHTIG :)!');
});

// Starte den Server
app.listen(PORT, () => {
  console.log(`Server läuft auf http://localhost:${PORT}`);
});
