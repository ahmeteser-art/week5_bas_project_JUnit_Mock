# Solutions for Week 5 labs

# Folders
## src
Contains models, code etc.

## test
Contains test code.

Mockito and JUnit is only available in this folder.

Test classes are suffixed with `Test`.

# Answers to questions

## Uppgift 1
1. Vad är ett enhetstest?
   Ett enhetstest testar en liten avgränsad del av programmet, exempelvis en klass eller metod.

2. Vad verifierar dina tester?
   Att registreringsnummer och märke sparas korrekt i objektet.

3. Vilken del av systemet testas?
   Klassen Car.


## Uppgift 2
1. Vad innebär Red, Green, Refactor?

Red: skriv ett test som misslyckas.
Green: skriv minsta möjliga kod så testet blir grönt.
Refactor: förbättra koden utan att ändra beteendet.

2. Hur skiljer sig TDD från ett mer traditionellt arbetssätt?

Vid TDD skrivs testet före implementationen. I ett traditionellt arbetssätt skrivs ofta koden först och testerna efteråt.

3. Vilka fördelar upplevde du med att skriva testet först?

Det blir tydligare vad metoden ska göra och man får snabb återkoppling på att koden fungerar.

## Uppgift 3
1. Varför bör även felhantering testas?

För att säkerställa att programmet beter sig korrekt även vid ogiltig indata.

2. Vad verifierar assertThrows()?

Att ett specifikt undantag kastas.

3. Vad skulle kunna hända om dessa tester saknas?

Felaktiga värden kan accepteras och orsaka buggar senare i systemet.

## Uppgift 4
1. Vad innebär AAA?

AAA står för Arrange, Act och Assert.

2. Vilken del av testet är Arrange?

Delen där testdata och objekt skapas.

3. Varför kan AAA göra tester enklare att läsa?

Strukturen gör tydligt vad som förbereds, vad som testas och vad som verifieras.

## Uppgift 5
1. Vad är en mock?

En mock är ett simulerat objekt som används istället för en riktig implementation under testning.

2. Varför används mocks?

För att isolera den kod som testas och undvika beroenden till externa komponenter.

3. Hur hjälper ett interface till att göra lösningen enklare att testa?

Klassen kan använda olika implementationer, inklusive mockar, utan att koden behöver ändras.

4. Hur kan Dependency Inversion Principle (DIP) bidra till bättre testbarhet?

Klasser beror på abstraktioner istället för konkreta implementationer, vilket gör det enkelt att byta ut beroenden mot mockar.

5. Varför är det en fördel att CarService arbetar mot Engine istället för en konkret implementation?

CarService blir lösare kopplad, enklare att testa och mer flexibel eftersom olika motorimplementationer kan användas utan att ändra klassen.
