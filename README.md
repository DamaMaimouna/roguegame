Classification d’image avec l’algorithme KNN-K-plus proches voisins
La méthode des K plus proches voisins également notée KNN est une méthode d’apprentissage supervisé dédiée à la classification.
L’objectif de l’algorithme est de classer les exemples non étiquetés sur la base de leur similarité avec les exemples de la base d’apprentissage. ________________________________________
1. Principe de l’algorithme
Le principe de l’algorithme est le suivant :
On lui fournit :
	un ensemble de données d’apprentissage D
	une fonction de distance d
	et un entier k
Pour tout nouveau point de test x, l’algorithme recherche dans D les k  points les plus proches de x au sens d la distance d, et attribue x à la classe la plus fréquente parmi ses k voisins.
 
Figure 1:exemple de classifieur knn
1.1 Algorithme K du plus proche voisin
1.2 Avantages et inconvénients du classificateur KNN
Les avantages du classificateur KNN sont évidents:
  Il n'est pas nécessaire de connaître la distribution de la valeur de la propriété pour le classifieur KNN. La plupart des autres classificateurs, tels que le classificateur Bayes, nécessitent la distribution de la valeur de la propriété avant d'effectuer une prédiction.
 Le classifieur KNN est toujours efficace compte tenu d'un ensemble de données d'apprentissage suffisamment important ou de la base de données volumineuse.
 Il est simple à construire et facile à implémenter 
Cependant, il y a quelques inconvénients:
 Calcul des frais généraux et stockage.
 Faible vitesse de classification.
2. Implémentation de la solution
Ce projet consiste à faire la classification de deux types de chaussures : les baskets et les bottines . Nous allons commencer à présenter les outils et langages utilisé , ensuite nous détaillerons les étapes de notre algorithme
2.1 Langages et outils
Nous avons utilisé Pysharm (Anaconda) comme environnement de developpement et 
Python comme langage de programmation .
Pour plus d’informations sur leur installation et utilisationn, consultez :
https://www.python.org/
Nous avons également utilisé les bibliotheques sclearn , pour plus d’informations , veullez  consulter : https://scikit-learn.org/stable/modules/neighbors.html#classification







Dans le cas le plus extrême, la valeur K est égale au nombre de tous les échantillons de la base de données, de sorte que la prédiction de l'échantillon test est une solution optimale globale. Sinon, la prédiction de l'échantillon test est la solution optimale locale. Par conséquent, la sélection du paramètre K est le compromis entre solution optimale globale et solution optimale locale
2.2 Etapes principales
•	Importation des  bibliotheques :
•	Chargement des données
•	Extraction des données  et séparation des images à predire de leur classes d’appartenance
•	Séparation en données d'apprentissage et données TEST
•	Première classification sans optimisation de k avec k = 1
•	Optimisation de k sans validation croisée
•	Optimisation de K avec la validation croisée
•	Comparaisons avec les matrices de confusion et la courbe AUC











5. Conclusion
Ce projet introduit systématiquement le principe de base du classifieur KNN, ainsi que les améliorations apportées aux faiblesses du classifieur KNN. Ces améliorations incluent la sélection K, la distance pondérée et la structure des données KD.
Des expériences ont montré qu'une sélection appropriée de la valeur K peut évidemment améliorer les performances du classifieur KNN, notamment en réduisant le taux d'erreur et le temps de formation. De plus, le classifieur KNN avec calcul de la distance pondérée consacre moins de temps aux données d’entraînement et permet d’améliorer le taux d’erreur. L'architecture KD est une bonne structure de données pour améliorer les performances, mais un grand nombre de retours arrière de données entraînera une faible vitesse de fonctionnement.
Cependant, il existe encore des inconvénients dans le classificateur KNN amélioré, tels que la durée de formation. Ce projet n'améliore pas significativement la vitesse de course. À l’avenir, il faudra peut-être pallier les problèmes de rapidité et de recherche afin de trouver des algorithmes plus efficaces pour l’apprentissage automatique.

