package com.ganesan.todospringboot.DAL;

import com.ganesan.todospringboot.Model.Todo;

import java.util.List;
import java.util.Optional;

public interface DbRepository {
    List<Todo> gettodo();
    Todo createtodo(Todo todo);
    Todo updateTodo(String id, Todo newTodo);
    void deleteById(String id);
    Optional<Todo> getTodoById(String id);
}