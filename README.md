# QUALITE DU CODE

## Cours
liens : https://github.com/UDEV-AuRA/ipi-java-260-cleancode/blob/master/Qualit%C3%A9%20du%20code.pdf
Choisir 5 règles et trouver (dans des anciens par exemple ou inventer) des portions de code ne respectant ces règles.
Et proposez des solutions pour l'améliorer

jve : ok

## Cas de bad practices
__* Nom de classes ou methode incompréhensibles et non prononçables ou juste une lettre__<br/>
__* Aucune normes utilisées pour écriture des mots de methodes, variables ... ex:camelCase ou norme client__<br/>
__* Code sans commentaires__<br/>
__* on sépare les couches d'abstraction__<br/>
__* Indentation inexistante__
## Transformation de BowlingGame.score() pour répondre à toutes ces bad practices

public int s() {<br/>
int s = 0;<br/>
int f = 0;<br/>
int i;<br/>
for (i=0;i<10;i++){<br/>
if (isStrike(frame)){score += 10 + strikeBonus(frame);frame++;}<br/>
else if (isSpare(frame)) {score += 10 + spareBonus(frame);frame += 2;}<br/>
else {score += sumOfRolls(frame);frame += 2;}}<br/>
return score;<br/>
}

## TP
Continuer le GameBowling
Rappel des règles de calcul du score au bowling
 https://fr.wikihow.com/calculer-les-scores-au-bowling
 
 
Bon courage !

jve : ok -> src/BowlingGame.java
         -> src/BowlingGameTest.java