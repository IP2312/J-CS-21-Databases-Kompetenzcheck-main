# Kompetenzcheck - Arbeit mit Datenbanken

## Aufgabe: Personenverwaltung mit Datenbank

Erweitere deine Personenverwaltung (aus J-CS-18-Objektorientierung) um die Möglichkeit, die Daten in einer Datenbank zu speichern statt in Dateien.
Das Ziel ist es, dass beim Start deines Programms entschieden werden, ob es mit Dateien oder mit einer MySQL-Datenbank arbeitet. 

[optional] Verwende hierfür das Design Pattern: [Data Access Object](https://www.geeksforgeeks.org/data-access-object-pattern/)

Das Design Data Access Object ist zum Standard in Bezug auf Datenbankanbindung geworden. Gründe dafür sind:
- bessere Strukturierung und Wartbarkeit des Codes
- Trennung von Persistierung und Business Logic

### Abnahmekriterien

Der:die Teilnehmer:in hat:
- Die entsprechenden Klassen erstellt und die nötigen Methoden implementiert.
- Frontend, Business Logic und Datenbankzugriffe ordentlich getrennt (UI/Business Logic/Persistierung, DAO- und Singleton-Design Patterns).
- Die Klassen seiner Objekte spezifisch für seine Business Logic erstellt (nicht 1:1 aus der Datenbankstruktur übernommen).
- Ein Programm erstellt, das alle oben angeführten Anforderungen erfüllt.
- in seinem:ihrem Code Exceptions ordentlich abgefangen
- entsprechende Unittests erstellt, um die Methoden auf Funktionalität zu prüfen
- seinen:ihren Code in GitHub eingecheckt