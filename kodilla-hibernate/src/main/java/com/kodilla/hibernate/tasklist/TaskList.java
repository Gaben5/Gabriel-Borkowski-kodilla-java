package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
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
    @Column(unique = true)  //adnotacje @Column(name="..") wywalają błąd
    public int getId() {
        return id;
    }
    public String getListName() {
        return listName;
    }
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
