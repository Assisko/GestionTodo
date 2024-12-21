package com.rmoss.model;

/**
 * Représente une tâche (Todo) avec une description et un état de complétion.
 */
public class TodoModel {
    private Long id;
    private String description;
    private boolean isCompleted;

    /**
     * Variable statique pour gérer les ID des tâches de manière incrémentale.
     * Le mot-clé static indique que la variable nextId appartient à la classe elle-même, et non à une instance (objet) spécifique de la classe.
     * Il n'y a qu'une seule copie de nextId partagée par toutes les instances de la classe Todo
     */


    private static long nextId = 1;

    /**
     * Constructeur de la classe Todo.
     * Initialise une nouvelle tâche avec la description donnée et un état non complété.
     * L'ID de la tâche est généré automatiquement.
     *
     * @param description La description de la tâche.
     */
    public TodoModel(String description) {
        this.description = description;
        this.isCompleted = false;
        this.id = nextId++;
    }

    /**
     * Retourne l'ID de la tâche.
     *
     * @return L'ID de la tâche.
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'ID de la tâche.
     *
     * @param id Le nouvel ID de la tâche.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne la description de la tâche.
     *
     * @return La description de la tâche.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la description de la tâche.
     *
     * @param description La nouvelle description de la tâche.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Indique si la tâche est complétée.
     *
     * @return `true` si la tâche est complétée, `false` sinon.
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Définit l'état de complétion de la tâche.
     *
     * @param completed Le nouvel état de complétion de la tâche.
     */
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}