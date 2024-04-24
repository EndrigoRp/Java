package com.crud.CRUD.Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/table")
public class TableController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping
    public List<?> getTableData(){
        Query query = entityManager.createNativeQuery("SELECT * FROM produto;");
        return query.getResultList();
    }
}

