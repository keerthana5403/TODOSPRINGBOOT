package com.ganesan.todospringboot.Service;

import com.ganesan.todospringboot.DAL.DbRepository;
import com.ganesan.todospringboot.Model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private DbRepository dbRepository;

    public List<Todo> getAllTodos() {
        return dbRepository.gettodo();
    }

    public Todo createTodo(Todo todo) {
        return dbRepository.createtodo(todo);
    }

    public Todo updateTodo(String id, Todo newTodo) {
        return dbRepository.updateTodo(id, newTodo);
    }

    public void deleteTodoById(String id) {
        dbRepository.deleteById(id);
    }
}

