package com.hacisimsek.restaurant_reservation_system.controller;

import com.hacisimsek.restaurant_reservation_system.entity.Table;
import com.hacisimsek.restaurant_reservation_system.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tables")
public class TableController {

    @Autowired
    private TableRepository tableRepository;

    @GetMapping
    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Table> updateTableStatus(@PathVariable Long id, @RequestBody Table tableDetails) {
        Optional<Table> optionalTable = tableRepository.findById(id);
        if (optionalTable.isPresent()) {
            Table table = optionalTable.get();
            table.setAvailable(tableDetails.isAvailable());
            tableRepository.save(table);
            return ResponseEntity.ok(table);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
