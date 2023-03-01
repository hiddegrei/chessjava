# chessjava
https://github.com/hiddegrei/chessjava/blob/main/README.md

Ik heb het java programma alleen gemaakt zonder andere team leden.

Wanneer u het programma uitvoert, wordt u gevraagd om de coördinaten in te voeren van het stuk dat u wilt verplaatsen en de coördinaten
van waar u het stuk wilt verplaatsen. Het eerste coördinaat is de waarde van welke row van het 
te verplaatsen stuk (0 tot 7) en het tweede coördinaat is de waarde van welke column van het te verplaatsen stuk (0 tot 7).

Het programma controleert of het stuk een geldig stuk is van de
huidige speler en of de zet een geldige zet is. Als het geen geldige zet is, zal het programma 
je vragen om het opnieuw te proberen. Als het een geldige zet is, zal het programma het stuk verplaatsen en de huidige speler wisselen. 
Het spel gaat door totdat een speler wint.

#1. 	Creational design patterns:
• Fabrieksmethode: om objecten van verschillende stukken te maken, gebaseerd op de input van de gebruiker, zoals "pion", "ridder", etc.
• Singleton: om ervoor te zorgen dat er tijdens runtime slechts één exemplaar van het bord wordt gemaakt.

#2. Structurele ontwerppatronen:
• Decorateur: om stukken extra attributen te geven, zoals het aantal zetten dat ze hebben gedaan of hun waarde op het bord.
• Proxy: alleen de stukken maken wanneer ze nodig zijn.

#3. Gedragsontwerppatronen:
• Waarnemer: om de speler op de hoogte te stellen wanneer een zet is gedaan of wanneer het spel is afgelopen.
• Strategie: om verschillende strategieën te implementeren voor het verplaatsen van een stuk, zoals de regels voor het verplaatsen van een paard versus de regels voor het verplaatsen van een loper.
