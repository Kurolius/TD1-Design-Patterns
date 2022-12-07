# TD1-Design-Patterns
## Exercice 1 :
### 1 - Une figure peut être soit un cercle, un rectangle ou un groupe de figures ( **Composite pattern** ).
![image](https://user-images.githubusercontent.com/84138772/206235782-83bfc727-a4e9-43f7-ae5a-ab9e9bef0457.png)

### 2 - Un plugin contient une opération implémentant le squelette d’un algorithme dont deux parties (partie1 et partie2) sont variables. On voudrait laisser le développeur la possibilité d’implémenter les deux parties manquantes de cet algorithme et on voudrait aussi que l’application cliente puisse instancier une implémentation concrète du plugin sans connaitre sa classe d’implémentation ( **Decorator pattern** ).
![image](https://user-images.githubusercontent.com/84138772/206238925-6464c0ed-4026-4e42-a8b4-20451ced7045.png)

### 3 - On dispose d’un composant implémentant une interface qui définir une opération « traitement() ». On voudrait rattacher à ce composant des responsabilités supplémentaires sans modifier son code source. C'est-à-dire envelopper l’exécution de la méthode traitement par d’autres traitements avant et après son exécution ( **Template method pattern** ).
![image](https://user-images.githubusercontent.com/84138772/206240986-971bf798-e343-4e7b-b547-1764c205a209.png)

### 4 - On désire créer une classe Joueur ayant un état représenté par une variable score de type int. On voudrait que les objets de l’environnement du jeu (Couloir, Caméra et Gardien) soient informés à chaque fois que le score du joueur change tout en gardant un couplage faible entre la classe Joueur et les autres classes ( **Observer pattern** ).
![image](https://user-images.githubusercontent.com/84138772/206243872-13829b48-b6ca-4350-be17-f3d321902b18.png)

## Exercice 2 :

### 1 - diagramme de classes du Framework ( Pattern utillisé **Singleton, Strategy, Adapter, Template method** )
![image](https://user-images.githubusercontent.com/84138772/206246624-10be0da2-708e-4cf8-b4ed-5a8de897e348.png)

### 2 et 3 - Pour l'implémentation Java de ce Framework et l'application qui utilise ce Framework vous trouverez le code dans le repo :
