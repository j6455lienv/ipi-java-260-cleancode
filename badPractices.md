 #Cas de bad practices =======================

#####Nom de classes ou methode incompréhensibles et non prononçables ou juste une lettre
#####Aucune normes utilisées pour écriture des mots de methodes, variables ... ex:camelCase ou norme client
#####Code sans commentaires
#####on sépare les couches d'abstraction
#####Indentation inexistante


#transformation de BowlingGame.score() pour répondre à toutes ces bad practices

public int s() {
int s = 0;
int f = 0;
int i;
for (i=0;i<10;i++){
if (isStrike(frame)){score += 10 + strikeBonus(frame);frame++;}
else if (isSpare(frame)) {score += 10 + spareBonus(frame);frame += 2;}
else {score += sumOfRolls(frame);frame += 2;}}
return score;
}
