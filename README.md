# CHECKPOINT 1

Le checkpoint est un moyen de t'autoévaluer, de te montrer de quoi tu es capable.

**Conseils :**

* ne reste pas bloqué, passe au point suivant, ou demande à ton formateur !
* la limite de temps existe, mais tu peux continuer à travailler plus tard si tu veux reprendre des choses à tête reposée
* terminé ou non, pense à tout commiter et pousser

## 1. Récupération et initialisation du projet

### 1.1. Dépôt local

Récupère le contenu de ce dépôt en local. **Ne fait pas de Fork !**

Dans ton dépôt local, crée une branche ayant le format suivant : la ville de ton cursus en minuscule, ton prénom et nom sans accents ni espaces, séparés par des tirets, avec le nom en majuscule. Exemple : pour **Éloïse Durant**, crée une branche **lyon-eloise-DURANT**.

**Passe sur cette branche pour la suite du *checkpoint* !**

> Conseil : ajoute et envoie tes modifications en local après chaque exercice, pour éviter les mauvaises surprises

### 1.2. .gitignore

Trouve et modifie le fichier `.gitignore` de la racine du projet, afin d'ignorer le répertoire `target`.

### 1.3. Maven

Le projet contient un `pom.xml` qui doit automatiquement configurer ton IDE et le JDK.
Le JDK défini ici est le `8`, mais tu peux très bien utiliser une version supérieure.

Assure toi ce fichier est correctement détecté, et que ton IDE à proprement été configuré.


## 2. Ta mission

### 2.1 Algorithmes

Tu trouveras deux packages `com.wcs.java.checkpoint.student` dans les répertoires `src/main/java` et `src/test/java`.
Le premier contient la classe `Student`, que tu dois éditer, et le second la classe `StudentTest` ou sont définis un 
ensemble de tests sur `Student`. 

- Commence par décommenter le contenu de toutes les méthodes de `StudentTest`. Aie Aie Aie, tu obtiens des erreurs de compilation, ne t'inquiète pas, c'est normal !
- Ton but d'éditer `Student` pour que tous les tests de `StudentTest` passent (et que `StudentTest` compile à nouveau).
- Tu peux lancer les tests directement dans IntellIJ, ou avec la commande `mvn test`.

Tu devrais réaliser les trois algorithmes suivants :


- **Majeur**

L'école organise une soirée de fin d'année et tous les élèves majeurs sont invités. 
Afin d'éviter d'envoyer des invitations aux élèves mineurs, tu dois créer une méthode qui vérifie l'âge d'un élève et qui retourne s'il est majeur.

Crée une méthode statique nommée *hasLegalAge*, qui retourne vrai si l'âge passé en argument est supérieur ou égal à 18 et faux sinon.

- **Groupes**

Tu dois répartir les élèves d'une classe en deux groupes. 
Chaque élève possède un numéro et tu veux utiliser cette donnée pour l'assigner à un groupe A ou B.

Crée une méthode statique nommée *getGroup*, qui reçoit le numéro d'un élève. 
S'il est pair, retourner le caractère A, sinon retourner le caractère B.

- **Groupes**

L'école a besoin de compter de nombre de ses futurs étudiants souhaitant faire du Java. 
Pour cela elle a envoyé un sondage demandant le langage à étudier. 
Certains candidats ont écrit Java avec des minuscules et majuscules mal placées, ex : "JAVA" ou "java", au lieu de "Java".

Crée une méthode statique nommée *countStudents*, qui reçoit un tableau contenant les langages choisies par les candidats. 
Retourne le nombre de candidats ayant choisi le langage Java, sans tenir compte de la casse (majuscule/minuscule).

### 2.2. Héritage 

Tout développeur un jour se dit : *et si je programmais un jeu?*

Nous avons besoin de toi pour programmer l'inventaire d'un jeu de rôle !

Dans un jeu de rôle, l'inventaire permet d'équiper des objets (ici, des armures, bottes et anneaux) qui en général 
ont des bonus (par exemple d'intelligence ou d'agilité). Une fois les objets équipés, leurs bonus (exprimés par une valeur numérique) se cumulent et donnent 
pour chaque caractéristique un bonus total. 

Tu trouveras le travail du stagiaire dans le package `com.wcs.java.checkpoint.inventory`, et tu dois le terminer.

- Commence par lire, compiler et executer la classe `Main` pour comprendre ce qu'elle fait.
- Tu as sans doute remarqué que notre héros est à ce stade peu équipé. Il serait bon de lui donner une armure et des anneaux... 
Crée pour cela les classes `Ring` et `Armor`. Elles doivent toutes les deux implémenter `Item`.
- Puisque tu implémentes `Item`, tu dois respecter un contrat (défini dans `Item`). Implémente les méthodes correspondantes.

> NOTE: la méthode `getType()` te surprendra si tu n'es pas familier avec les `enum` en Java. N'hésite pas à t'inspirer de `Boots` au besoin.

- Une fois tes classes crées, il faudra les instancier pour les ajouter au jeu, et finalement à ton héros. La classe `ItemLoader` 
devrait te permettre de faire cela. Crée plusieurs bottes, anneaux, et armures, de manière à ce que lorsque tu lances le programme, ton héros soit complètement équipé.
- Cette étape terminée, il serait souhaitable d'afficher les bonus totaux appliqués à ton héros. Pour cela, complète la 
méthode `displayOverallBonus()` dans `Inventory`. Elle doit afficher les bonus totaux d'intelligence, force, agilité et résistance.
 Essaye de penser à tous les cas ;)

Bon, et bien ca devient pas mal ! Travail terminé ? Pas tout à fait... En fin développeur Java, tu as sans doute remarqué 
qu'il y a beaucoup de code redondant entre les classes `Boots`, `Ring` et `Armor`. Crée une classe abstraite `AbstractItem` 
qui te permettra de factoriser ce code redondant. 

> NOTE: Tu ne dois pas toucher à l'interface `Item`, et bien sur `Boots`, `Ring` et `Armor` doivent continuer de respecter
> le contrat, c'est à dire d'implémenter `Item`.


### 2.3. Quiz

Tu trouveras un fichier `Quiz.java` dans le package `com.wcs.java.checkpoint.quiz` : compile et exécute le.

Réponds aux questions, cela va générer un fichier `quiz.txt` à la racine de ton projet.

Tu peux ensuite éditer le fichier manuellement pour corriger tes réponses.

> Merci de répondre honnêtement, sans t'aider d'Internet !


### 2.4. SQL

Dans le Dojo SQL de la semaine passée, nous vu la modélisation d'un restaurant.
Pour rappel, en voici le diagramme :

![Database diagram](https://image.noelshack.com/fichiers/2019/44/3/1572438454-screenshot-from-2019-10-30-13-27-09.png)


Tu dois importer cette base de donnée sur ton mysql local.
Pour cela, utilise la commande suivante : 
```
    $ mysql -u <user> -h localhost -p < database.sql
```

Et ensuite sélectionne la avec : 
```
    mysql> use restaurant;
```

- Trouve la requête qui permet d'afficher tous les noms de villes, associés aux nombres de plats servis pour chacune d'entre elles.
- Crée ensuite à la racine du projet un fichier `sql.txt` dans lequel tu copieras la requête, et l'affichage de la table de résultats produit par mysql. 

## 3. Finalisation

Envoie les modifications de ta branche locale et pousse ces modifications sur le dépôt distant.

Dans GitHub, vérifie que la branche existe et que tes modifications sont bien présentes.

Tu peux revenir dans Odyssey et partager le lien vers ta branche sur GitHub.
