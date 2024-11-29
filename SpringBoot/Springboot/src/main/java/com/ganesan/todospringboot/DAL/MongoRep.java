package com.ganesan.todospringboot.DAL;

import com.ganesan.todospringboot.Model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRep extends MongoRepository<Todo, String> {
}