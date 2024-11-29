package com.ganesan.todospringboot.Controller;

import com.ganesan.todospringboot.Model.Todo;
import com.ganesan.todospringboot.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo createATodo (@RequestBody Todo todo) {
        System.out.println("Received Todo: " + todo);
        Todo createdTodo = todoService.createTodo(todo);
        System.out.println("Created Todo: " + createdTodo);
        return createdTodo;
    }


    @PutMapping("/{id}")
    public Optional<Todo> updateTodo(@PathVariable String id, @RequestBody Todo newTodo) {
        return Optional.ofNullable(todoService.updateTodo(id, newTodo));
    }
    //
    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable String id) {
        todoService.deleteTodoById(id);
    }
}

