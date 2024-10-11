# MSE-Gruppe5

## Was ist Git und warum sollte es verwenden werden?

***Definition Git:***
Git ist ein verteiltes Versionskontrollsystem (Version Control System, VCS), welches in der Softwareentwicklung verwendet wird, um Änderungen an Dateien (insbesondere im Quellcode), zu verwalten und zu verfolgen. Es hilft Entwicklern dabei, Änderungen festzuhalten, vorzunehmen und mit anderen Entwicklern in Teams zusammenzuarbeiten. Git speichert jede Änderung an einem Projekt in sogenannten "Commits", die als Schnappschüsse des Projekts zu bestimmten Zeitpunkten dienen. Dadurch kann man den gesamten Verlauf des Projekts nachverfolgen und bei Bedarf zu einer früheren Version zurückkehren. Git ermöglicht es, mehrere Entwicklungszweige zu erstellen, die unabhängig voneinander entwickelt werden können. Es erleichtert die parallele Entwicklung von neuen Features oder das Testen von Ideen, ohne den Hauptzweig zu beeinträchtigen. Änderungen können später wieder zusammengeführt werden.

***Vorteile von Git:*** 
Verteiltes System: Jeder hat eine vollständige Kopie des Projekts lokal, was unabhängig vom Server funktioniert.
Effiziente Zusammenarbeit: Mehrere Entwickler können parallel arbeiten, Änderungen einfach zusammenführen und Konflikte lösen.
Branching und Merging: Entwicklung in Branches, um neue Features zu testen oder Fehler zu beheben, ohne den Hauptcode zu beeinflussen.
Schnelligkeit: Lokale Operationen sind sehr schnell, da keine ständige Serveranbindung notwendig ist.
Versionshistorie: Vollständige Rückverfolgbarkeit aller Änderungen, einfaches Zurücksetzen auf frühere Versionen.
Fehlerbehandlung: Wenn Fehler gemacht werden, ermöglicht Git es, zu früheren Versionen zurückzukehren, fehlerhafte Commits zu entfernen oder Änderungen rückgängig zu machen, ohne das gesamte Projekt zu gefährden.
Skalierbarkeit: Geeignet für kleine und große Projekte, sowie die Einzelarbeit.

## Git mit IntelliJ / PyCharm benutzen: Local Repository und Remote Repository
In Git wird zwischen remote und local repositories unterschieden. 

***Remote:***
Remote repositories werden remote gehostet. Dies kann im Internet oder auch auf einem off-site server stattfinden.
Remote repositories werden von den verschiedenen Teammitgliedern geteilt und kommen zum Einsatz, um Informationen/ Daten / Code
untereinander bereitzustellen und zu teilen. Das remote repository wird also zum Teilen im Team verwendet, die Arbeit an Dateien findet hier nicht statt.


***Local:***
Local repositories werden auf der lokalen Maschine des individuellen Benutzers gehostet. In dieser Art von repositories findet die
eigentliche Arbeit an Code etc. statt. Alle neuen Codeteile oder Modifikationen müssen zuerst lokal gemacht und committed werden und können dann
anschließend auf das remote repo gepusht werden, um allen Teammitgliedern Zugriff auf die lokal erfolgten Änderungen zu geben.
Im lokalen repository kann auch gearbeitet werden, wenn aktuell keine Verbindung zum Internet möglich ist. Die Änderungen lassens ich dennoch lokal committen und können wenn Verbindung möglich ist auf das remote gepusht werden.
Falls Änderungen auf dem remote repository vorgenommen wurden, sollten diese auch lokal übernommen und aktualisiert werden (bspw. durch fetch oder pull).
