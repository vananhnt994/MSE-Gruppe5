# MSE-Gruppe5
<div align="center">
<img src="https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg" alt="Awesome Badge"/>
<img src="https://img.shields.io/static/v1?label=%F0%9F%8C%9F&message=If%20Useful&style=style=flat&color=BC4E99" alt="Star Badge"/>
<a href="https://discord.gg/D98cKTzd"><img src="https://img.shields.io/discord/1032643348026109992.svg?style=flat&label=Join%20Community&color=7289DA" alt="Join Community Badge"/></a>
<br>
<a href="https://github.com/vananhnt994/MSE-Gruppe5/stargazers"><img src="https://img.shields.io/github/stars/vananhnt994/MSE-Gruppe5" alt="Stars Badge"/></a>
<a href="https://github.com/vananhnt994/MSE-Gruppe5/pulls"><img src="https://img.shields.io/github/issues-pr/vananhnt994/MSE-Gruppe5" alt="Pull Requests Badge"/></a>
<a href="https://github.com/vananhnt994/MSE-Gruppe5/commits"><img src="https://img.shields.io/github/commit-activity/t/vananhnt994/MSE-Gruppe5" alt="Total Commits Badge"/></a>

</div>

## Aufgabenteilung
- Lisa: Git mit IntelliJ/PyCharm benutzen: Local Repository und Remote Repository
- Valentin: Grundlegende Git-Befehle (z. B. git init, git add, git commit, git push)
- Tjorven: Was ist Git und warum sollte es verwendet werden?
- Van Anh: Branches und ihre Nutzung, Umgang mit Merge-Konflikten
- Van Anh: Nützliche Git-Tools und Plattformen (z. B. GitHub)

## Frageliste
- [Was ist Git und warum sollte es verwendet werden?](#was-ist-git-und-warum-sollte-es-verwenden-werden)
- [Grundlegende Git-Befehle](#grundlegende-git-befehle)
- [Branches und ihre Nutzung](#branches-und-ihre-nutzung)
- [Umgang mit Merge-Konflikten](#umgang-mit-merge-konflikten)
- [Git mit IntelliJ/PyCharm benutzen](#git-mit-intellijpycharm-benutzen)
- [Nützliche Git-Tools und Plattformen](#nützliche-git-tools-und-plattformen)



## Was ist Git und warum sollte es verwenden werden?

***Was ist Git?***  
Git ist ein verteiltes Versionskontrollsystem (Version Control System, VCS), welches in der Softwareentwicklung verwendet wird, um Änderungen an Dateien (insbesondere im Quellcode), zu verwalten und zu verfolgen. Es hilft Entwicklern dabei, Änderungen festzuhalten, vorzunehmen und mit anderen Entwicklern in Teams zusammenzuarbeiten. Git speichert jede Änderung an einem Projekt in sogenannten "Commits", die als Schnappschüsse des Projekts zu bestimmten Zeitpunkten dienen. Dadurch kann man den gesamten Verlauf des Projekts nachverfolgen und bei Bedarf zu einer früheren Version zurückkehren. Git ermöglicht es, mehrere Entwicklungszweige zu erstellen, die unabhängig voneinander entwickelt werden können. Es erleichtert die parallele Entwicklung von neuen Features oder das Testen von Ideen, ohne den Hauptzweig zu beeinträchtigen. Änderungen können später wieder zusammengeführt werden.

***Vorteile von Git:***
- Verteiltes System: Jeder hat eine vollständige Kopie des Projekts lokal, was unabhängig vom Server funktioniert.
- Effiziente Zusammenarbeit: Mehrere Entwickler können parallel arbeiten, Änderungen einfach zusammenführen und Konflikte lösen.
- Branching und Merging: Entwicklung in Branches, um neue Features zu testen oder Fehler zu beheben, ohne den Hauptcode zu beeinflussen.
- Schnelligkeit: Lokale Operationen sind sehr schnell, da keine ständige Serveranbindung notwendig ist.
- Versionshistorie: Vollständige Rückverfolgbarkeit aller Änderungen, einfaches Zurücksetzen auf frühere Versionen.
- Fehlerbehandlung: Wenn Fehler gemacht werden, ermöglicht Git es, zu früheren Versionen zurückzukehren, fehlerhafte Commits zu entfernen oder Änderungen rückgängig zu machen, ohne das gesamte Projekt zu gefährden.
- Skalierbarkeit: Geeignet für kleine und große Projekte, sowie die Einzelarbeit.

## Die wichtigsten Git Befehle

- git init - initialisieren einer lokalen Github umgebung
- git add - fügt eine Datei dem lokalen Verzeichnis hinzu
- git clone - klonen eines bestehenden Repositorys
- git commit - speichert Änderungen in der Staging Area, dauerhaft im lokalen Repository
- git status - zeigt aktuellen Status des Repositorys und den Status der Dateien innerhalb des Repositorys
- git branch <branch-name> - Erstellt einen neuen Branch
- git merge <branch-name> - führt Änderungen aus einem anderen Branch, mit dem aktuellen Branch zusammen
- git push - überträgt lokale Änderungen in einen Angegebenen remote Branch
- git pull - holt Änderungen von einem Remote Branch und fügt sie dem lokalen Branch hinzu
- git rm - entfernt eine Datei
- git mv - verschiebt eine Datei
- git diff - zeigt Unterschiede zwischen zwei Commits
- git log - zeigt den Commit-Verlauf
- git reset - setzt das Repository auf einen bestimmten Stand zurück


## Branches und Ihre Nutzung

***Git-Branch***
Git-Branches sind ein zentrales Konzept in der Versionskontrolle mit Git. Ein Branch (Zweig) ist eine separate Linie der Entwicklung, die es ermöglicht, Änderungen an einem Projekt vorzunehmen, ohne die Hauptentwicklungslinie (in der Regel der main oder master Branch) zu beeinträchtigen.

***Nutzung von Git-Branches:***
- Isolation von Änderungen: Mit Branches kann man neue Features, Bugfixes oder Experimente isoliert entwickeln. Das bedeutet, dass man an einem neuen Feature arbeiten kann, ohne den stabilen Code zu stören.

- Parallele Entwicklung: Mehrere Entwickler können gleichzeitig an verschiedenen Features oder Fixes arbeiten, indem sie jeweils eigene Branches erstellen. Dies fördert die Zusammenarbeit und verhindert Konflikte.

- Einfache Integration: Wenn die Arbeit an einem Branch abgeschlossen ist, kann dieser in den Hauptbranch gemergt werden. Git bietet verschiedene Merge-Strategien und Tools zur Konfliktlösung.

- Versionsverwaltung: Branches ermöglichen es, verschiedene Versionen des Projekts zu verwalten. Man kann leicht zwischen Branches wechseln und frühere Zustände des Codes wiederherstellen.

- Experimentieren: Man kann einen Branch für experimentelle Features erstellen und diesen später verwerfen, wenn das Experiment nicht erfolgreich war.

***Typische Branching-Strategien:***
- Feature-Branching: Für jedes neue Feature wird ein eigener Branch erstellt.
- Release-Branching: Vor einer Veröffentlichung wird ein stabiler Release-Branch erstellt.
- Hotfix-Branching: Für dringende Bugfixes werden spezielle Hotfix-Branches verwendet.

## Umgang mit Merge-Konflikten

Merge-Konflikte in Git treten auf, wenn zwei Branches Änderungen an denselben Zeilen einer Datei vorgenommen haben und Git nicht automatisch entscheiden kann, welche Version beibehalten werden soll. Hier sind einige grundlegende Informationen und Schritte zum Umgang mit Merge-Konflikten:

### Ursachen von Merge-Konflikten

- **Gleichzeitige Änderungen**: Wenn zwei Entwickler gleichzeitig an derselben Datei arbeiten und unterschiedliche Änderungen an denselben Zeilen vornehmen.
- **Rebase oder Cherry-Pick**: Konflikte können auch auftreten, wenn man einen Branch rebaset oder spezifische Commits aus einem anderen Branch cherry-pickt.

### Schritte zum Umgang mit Merge-Konflikten

1. **Erkennen des Konflikts**: Git zeigt beim Mergen an, dass ein Konflikt aufgetreten ist. Die betroffenen Dateien werden als "unmerged" markiert.

2. **Überprüfen der Konflikte**: Man kann den Befehl `git status` verwenden, um eine Liste der Dateien zu sehen, die Konflikte aufweisen.

3. **Konflikte lösen**:
   - Öffne die betroffenen Dateien in einem Texteditor oder einer IDE. Git markiert die Konfliktstellen mit speziellen Markierungen:
     ```
     <<<<<<< HEAD
     (Änderungen aus dem aktuellen Branch)
     =======
     (Änderungen aus dem gemergten Branch)
     >>>>>>> branch-name
     ```
   - Entscheide, welche Änderungen beibehaltet werden sollen, und entferne die Markierungen sowie die unerwünschten Teile.

4. **Dateien als gelöst markieren**: Nachdem die Konflikte behoben werden, kann die Datei gespeichert und der Befehl `git add <dateiname>` verwendet werden, um Git mitzuteilen, dass der Konflikt gelöst wurde.

5. **Merge abschließen**:  `git commit` soll ausgeführt werden, um den Merge abzuschließen. Git erstellt einen neuen Commit, der die zusammengeführten Änderungen enthält.

## Tipps zur Vermeidung von Merge-Konflikten

- **Regelmäßiges Pullen**: Halte den Branch regelmäßig mit dem Hauptbranch synchronisiert.
- **Kleinere Commits**: Arbeite in kleineren Einheiten und mache häufige Commits.
- **Kommunikation im Team**: Informiere das Team über größere Änderungen oder Features, an denen man arbeitet.

Merge-Konflikte sind ein normaler Teil des Entwicklungsprozesses in Git. Mit den richtigen Strategien und einem systematischen Ansatz lassen sie sich jedoch effektiv bewältigen.

## Git mit IntelliJ/PyCharm benutzen
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

## Nützliche Git-Tools und Plattformen

Diese Übersicht enthält einige Tools und Plattformen, die die Arbeit mit Git unterstützen und verbessern können.

### 1. GitHub

[GitHub](https://github.com) ist eine weit verbreitete Plattform für Versionskontrolle und Zusammenarbeit an Softwareprojekten. Zu den Funktionen gehören:

- **Repository-Hosting**: Speicherung von Projekten in öffentlichen oder privaten Repositories.
- **Pull Requests**: Möglichkeit für Entwickler, Änderungen vorzuschlagen und zu diskutieren.
- **Issues**: Verwaltung von Aufgaben, Bugs und Feature-Anfragen.
- **GitHub Actions**: Automatisierung von Workflows innerhalb des Repositories.

### 2. GitLab

[GitLab](https://gitlab.com) bietet ähnliche Funktionen wie GitHub, jedoch mit integrierten CI/CD-Pipelines (Continuous Integration/Continuous Deployment). Wichtige Merkmale sind:

- **Repository-Verwaltung**: Hosting von Projekten mit verschiedenen Berechtigungsoptionen.
- **CI/CD**: Automatisierung von Tests und Deployments durch integrierte Pipelines.
- **Merge Requests**: Überprüfung und Zusammenführung von Änderungen.

### 3. Bitbucket

[Bitbucket](https://bitbucket.org) ist eine Plattform von Atlassian, die sowohl Git als auch Mercurial unterstützt. Zu den Hauptfunktionen gehören:

- **Repository-Hosting**: Kostenlose private Repositories für kleine Teams.
- **Pull Requests**: Überprüfung und Diskussion von Änderungen vor dem Mergen.
- **Integration mit Jira**: Verbindung zu Atlassian-Projekten zur Aufgabenverwaltung.

### 4. SourceTree

[SourceTree](https://www.sourcetreeapp.com) ist ein kostenloser Git-Client für Windows und macOS, der eine grafische Benutzeroberfläche (GUI) bietet. Vorteile sind:

- **Einfache Bedienung**: Intuitive Benutzeroberfläche zur Verwaltung von Repositories.
- **Visualisierung von Branches**: Grafische Darstellung des Verlaufs und der Struktur von Branches.
- **Unterstützung für mehrere Repository-Typen**: Nutzung von Git und Mercurial in einer Anwendung.

### 5. GitKraken

[GitKraken](https://www.gitkraken.com) ist ein weiterer beliebter Git-Client mit einer benutzerfreundlichen Oberfläche. Zu den Funktionen gehören:

- **Visuelle Darstellung von Commits und Branches**: Unterstützung beim Verständnis des Projektverlaufs.
- **Integrierte Merge-Konfliktlösung**: Hilfestellung beim Lösen von Konflikten direkt in der GUI.
- **Cross-Plattform-Unterstützung**: Verfügbar für Windows, macOS und Linux.

### 6. Tower

[Tower](https://www.git-tower.com) ist ein kostenpflichtiger Git-Client für macOS und Windows, der sich an professionelle Entwickler richtet. Merkmale sind:

- **Intuitive Benutzeroberfläche**: Vereinfachung komplexer Git-Befehle.
- **Erweiterte Funktionen**: Unterstützung für Stash, Cherry-Pick und weitere Optionen.
- **Integration mit verschiedenen Plattformen**: Nahtlose Nutzung mit GitHub, Bitbucket und GitLab.
