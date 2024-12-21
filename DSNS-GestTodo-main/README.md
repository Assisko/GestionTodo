# DSNS - Gestion de Tâches Todo

Ce projet est une simple application de gestion de tâches (TODO) en Java.  Elle permet d'ajouter, supprimer, marquer comme complétées et modifier des tâches.

## Diagramme de classes

![diagramme de classes](https://github.com/radnou/DSNS-GestTodo/blob/e6194110ea3e0b31eba8a05899bbee286c227c85/docs/diagramme%20de%20classes.png)


## Fonctionnalités

* **Ajouter une tâche:**  Ajouter une nouvelle tâche avec une description.
* **Supprimer une tâche:** Supprimer une tâche par son ID.
* **Marquer comme complétée:** Marquer une tâche comme complétée.
* **Modifier une tâche:** Modifier la description d'une tâche existante.
* **Afficher les tâches:** Afficher la liste des tâches avec leur ID, description et statut (complétée ou non).

## Exécution

1. **Prérequis:** Assurez-vous d'avoir Java Development Kit (JDK) installé sur votre système.
2. **Compilation:**  Ouvrez un terminal et naviguez jusqu'au répertoire racine du projet.  Exécutez la commande `mvn compile`.
3. **Exécution:** Exécutez la commande `mvn exec:java -Dexec.mainClass="com.rmoss.Main"`.

Le programme affichera ensuite la liste des tâches générées, puis les modifications successives.

## Package et exécution du fichier JAR

Pour exécuter le projet à partir du fichier JAR généré, suivez les étapes suivantes :

1. **Compilation et packaging :** Utilisez la commande Maven `mvn clean package` pour compiler le code source et créer un fichier JAR exécutable dans le répertoire `target`.

2. **Exécution du fichier JAR :** Naviguez jusqu'au répertoire `target` dans votre terminal. Exécutez ensuite le fichier JAR à l’aide de la commande : `java -jar DSNS-Gestion-Todo-1.0-SNAPSHOT.jar`

Cela lancera l’application de gestion des tâches TODO.
