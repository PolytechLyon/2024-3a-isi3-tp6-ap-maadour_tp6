# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme :

## Exercices 1

Dans cet exercice, le patron de conception utilisé est le patron composite. La classe Vehicule joue le rôle de structure Composite, contenant des objets de type Mobile qui agissent comme des Composants. L'interface Mobile définit un comportement commun à tous les objets pouvant être ajoutés à la structure composite.

La classe TagAlongBike hérite de Bike et comporte un attribut childBike représentant le vélo d'enfant. Dans son constructeur, TagAlongBike ajoute childBike à ses composants. La méthode getSpeed() n'a pas besoin d'être réécrite car elle calcule la vitesse en itérant sur tous les composants.

## Exercices 2

La méthode getSpeed() utilise le patron itérateur, permettant de parcourir les éléments d'une collection sans connaître sa structure interne. Cela simplifie l'ajout de nouveaux types de collections sans modifier la méthode elle-même. La boucle while(iterator.hasNext()) parcourt tous types de collections, rendant la méthode indépendante du type de collection utilisé (Set ou List).

## Exercices 3

Pour implémenter le patron Singleton, le constructeur de la classe Terrain est passé en privé et une variable statique instance est créée. La méthode publique getInstance() est ajoutée pour récupérer l'instance de Terrain. Cela garantit l'utilisation d'une seule instance de Terrain dans toute l'application.

## Exercices 4

Les classes Bike et Wheel appartiennent à des packages différents, créant une dépendance cyclique. Cela rend le code difficile à maintenir car une modification dans l'une des classes peut affecter l'autre. Pour résoudre cela, une abstraction pourrait être introduite en créant une interface Pushable, définissant la fonction getPush(), que Bike implémenterait et que Wheel utiliserait.

## Exercices 5

Le patron Template Method est utilisé pour réutiliser la classe NamedLogger et créer deux nouvelles méthodes. La méthode log() reprend les lignes dupliquées des classes ConsoleLogger et FileLogger, tandis que writeLog() est abstraite et implémentée dans les classes filles. Ainsi, la méthode log() appelle writeLog(), redéfinie dans les classes filles.

## Exercices 6

Pour implémenter le patron méthode de fabrique, une classe LoggerFactory est créée avec une méthode statique pour créer un objet Logger. Les classes Bike et Vehicle appellent cette méthode pour obtenir un Logger. Cela permet de modifier facilement le type de sortie (Fichier, Console) en modifiant uniquement la méthode statique de LoggerFactory.

## Exercices 7

La classe Context utilise le patron Facade pour fournir une interface simplifiée à la librairie complexe ServiceLoader. Le fichier fr.polytech.sim.cycling.Bike contient des types abstraits et concrets pouvant être instanciés par l'injection de dépendance.

## Exercices 8

La méthode injectAll() utilise le patron Itérateur pour parcourir tous les types possibles de vélos à injecter. Cela se fait en récupérant un itérateur à partir de Context.injectAll() et en parcourant les différents types de vélos.
