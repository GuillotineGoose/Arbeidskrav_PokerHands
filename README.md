# Innlevering 1: Programmeringsferdigheter

## Oppgave

Lag et program som løser *en* av oppgavene vi har sett på i forelesningene:

* a. [Roman Numerals](https://codingdojo.org/kata/RomanNumerals/)
* b. [Minesweeper](https://codingdojo.org/kata/Minesweeper/)
* c. [Poker Hands](https://codingdojo.org/kata/PokerHands/). Det holder om dere klarer å identifisere minst 5 forskjellige type scores: high card, par, tre like, straight og flush
* d. [Yahtzee](https://codingdojo.org/kata/Yahtzee/). Det holder om dere klarer å identifiere enere til seksere og minst 3 forskjellige typer: par, tre like, liten straight.

## Innlevering

Dere vil bli tildelt grupper på 4-6. Hver gruppe skal internt fordele seg i par som skal levere sammen. Alle skal utføre code review for de andre parene. Code review skal utføres på Feedback-branchen.

Innleveringen skal leveres på Canvas med link til GitHub-repository. Begge skal levere i Canvas (med link til samme repository).

Dere skal ta opp en screencast på 4-7 minutter der dere parprogrammerer med remote eller lokal ping-pong stil: en person skriver den første testen og ser den kjøre rødt; gir over kontrollen til den andre som får testen til å passere, refactorerer og skriver neste teste før første utvikler igjen skal få denne testen til å passere

Det anbefales at dere bruker Discord og Github for remote parprogrammering og tar opp sesjonen med Screencast-o-matic, men andre verktøy kan benyttes. Husk å åpne for tilgang til videoen ("unlisted" i Youtube) og legge inn lenke fra README.md.

Når dere oppretter repository via Github Classroom linken på Canvas, vil det automatisk opprettes en pull request med navn "feedback". Hver par innenfor en gruppe skal utføre en code review på det andre parets kode på denne pull requesten.

## Krav til innlevering

* Innlevering
  * [ ] Begge har levert link til Github Repository i Canvas
  * [ ] Dere har lastet opp zip-fil på Canvas
  * [ ] Koden er sjekket inn på et repository på https://github.com/kristiania-pgr209-2021
  * [ ] GitHub repository er private. Dere skal gi tilgang til de som gir code review
* Github
  * [ ] Dere har en Git branch som viser parprogrammering der dere sjekker inn annenhver gang
  * [ ] Dere har merget pull en pull request fra ping-pong-branchen
  * [ ] Dere har mottatt code review fra medstudenter på feedback-pull request
  * [ ] `.idea`, `*.iml` og `target` er lagt til i .gitignore og ikke sjekket inn
  * [ ] Github Actions rapporterer at 100% av testene kjører grønt
  * [ ] GitHub Actions skal ha `timeout` på bygget
  * [ ] Dere har opprettet og resolved GitHub issues med link til commits
* Kode
  * [ ] Koden skal være korrekt strukturert etter Maven sine standarder (koden skal ligge under `src/main/java` og tester under `src/test/java`)
  * [ ] Klassene skal ligge i Java packages
  * [ ] Koden inneholder en testklasse med 4-7 testmetoder
  * [ ] Klassenavn, pakkenavn, metodenavn og variabelnavn skal følge Java-konvensjoner når det gjelder små og store bokstaver
  * [ ] Koden skal være korrekt indentert
  * [ ] Dersom dere har valgt en stor oppgave behøver dere ikke løse hele. 6-7 tester er tilstrekkelig
* README-fil
  * [ ] Link til video av parprogrammering
  * [ ] Korrekt GitHub Actions status badge
  * [ ] Link til code review dere har gjort for medstudenter med minst én issue fra hver av dere
* Video av parprogrammering viser:
  * [ ] Den som skriver en test gir koden til den andre for å få testen til å passere
  * [ ] Begge skriver tester og begger får tester til å passere
  * [ ] Dere gjør en liten refactoring med Ctrl-alt-shift-t (Windows)/ctrl-t (Mac)
