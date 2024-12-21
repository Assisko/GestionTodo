package com.rmoss.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe gérant une liste de tâches (todos).
 */
public class GestTodoModel {
    private final ArrayList<TodoModel> todosList;

    /**
     * Constructeur de la classe GestTodo.
     */
    public GestTodoModel() {
        this.todosList = new ArrayList<>();
    }

    /**
     * Ajoute une tâche à la liste.
     *
     * @param todo La tâche à ajouter.
     */
    public void addTodo(TodoModel todo) {
        this.todosList.add(todo);
    }

    /**
     * Supprime une tâche de la liste en fonction de son ID.
     *
     * @param id L'ID de la tâche à supprimer.
     */
    public void removeTodoById(Long id) {
        this.todosList.removeIf(todo -> todo.getId().equals(id));
    }

    /**
     * Marque une tâche comme complétée en fonction de son ID.
     *
     * @param id L'ID de la tâche à marquer comme complétée.
     */
    public void markTodoAsCompletedById(Long id) {
        for (TodoModel todo : this.todosList) {
            if (todo.getId().equals(id)) {
                todo.setCompleted(true);
                break;
            }
        }
    }

    /**
     * Modifie la description d'une tâche en fonction de son ID.
     *
     * @param id             L'ID de la tâche à modifier.
     * @param newDescription La nouvelle description de la tâche.
     */
    public void modifyTodoById(Long id, String newDescription) {
        for (TodoModel todo : this.todosList) {
            if (todo.getId().equals(id)) {
                todo.setDescription(newDescription);
                break;
            }
        }
    }


    /**
     * Retourne une liste de tâches filtrée selon l'état de complétion.
     *
     * @param completed Si `true`, retourne les tâches complétées.
     *                  Si `false`, retourne les tâches non complétées.
     * @return Une liste de tâches filtrée.
     */
    private List<TodoModel> filterTodosByState(boolean completed) { // <-  nouvelle fonction pour filter les todos
        List<TodoModel> filteredTodos = new ArrayList<>();
        for (TodoModel todo : this.todosList) {
            if (todo.isCompleted() == completed) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }


    /**
     * Affiche toutes les tâches de la liste.
     */
    public void displayAllTodos() {
        displayTodos(this.todosList);
    }


    /**
     * Affiche une liste de tâches dans un format tabulaire.
     *
     * @param todos La liste des tâches à afficher.
     */

    private void displayTodos(List<TodoModel> todos) {
        // Trouver la longueur maximale des descriptions
        int maxDescriptionLength = 0;

        for (TodoModel todo : todos) { // <-  utilisation de la liste donnée en argument pour calculer le max
            maxDescriptionLength = Math.max(maxDescriptionLength, todo.getDescription().length());
        }


        int minDescriptionWidth = 10;
        maxDescriptionLength = Math.max(maxDescriptionLength, minDescriptionWidth);


        String horizontalLine = "+" + "-".repeat(4) + "+" + "-".repeat(maxDescriptionLength + 2) + "+" + "-".repeat(11) + "+";

        // En-tête
        System.out.println(horizontalLine);
        System.out.printf("| %2s | %-" + maxDescriptionLength + "s | %-9s |\n", "ID", "Description", "Completed");
        System.out.println(horizontalLine);

        // Tâches
        for (TodoModel todo : todos) { // <-  utilisation de la liste donnée en argument pour l'affichage
            String completedStatus = todo.isCompleted() ? "✓" : " ";
            String description = todo.getDescription();

            if (description.length() > maxDescriptionLength) {
                description = description.substring(0, maxDescriptionLength - 3) + "...";
            }

            description = String.format("%-" + maxDescriptionLength + "s", description);

            System.out.printf("| %2d | %s | %-9s |\n", todo.getId(), description, completedStatus);
        }

        // Pied de page
        System.out.println(horizontalLine);
    }

    /**
     * Affiche les tâches en filtrant sur leur état de complétion.
     *
     * @param completed Si `true`, affiche les tâches complétées.
     *                  Si `false`, affiche les tâches non complétées.
     */
    public void displayTodosFilterByState(boolean completed) {

        List<TodoModel> filtredList = filterTodosByState(completed);  // filter les todos par etat completed
        displayTodos(filtredList); // affichage des todos deja filtré


    }


}