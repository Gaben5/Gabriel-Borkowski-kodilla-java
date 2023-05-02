package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "TASKSLIST")
public final class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList() {
    }

    public TaskList(String lastName, String description) {
        this.listName = lastName;
        this.description = description;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String lastName) {
        this.listName = lastName;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
