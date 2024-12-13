package com.hacisimsek.restaurant_reservation_system.service;

import com.hacisimsek.restaurant_reservation_system.entity.Table;
import com.hacisimsek.restaurant_reservation_system.repository.TableRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableService {

    private final TableRepository tableRepository;

    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    public Optional<Table> getTableById(Long id) {
        return tableRepository.findById(id);
    }

    public Table createTable(Table table) {
        return tableRepository.save(table);
    }

    public Optional<Table> updateTable(Long id, Table tableDetails) {
        return tableRepository.findById(id).map(table -> {
            table.setTableNumber(tableDetails.getTableNumber());
            table.setCapacity(tableDetails.getCapacity());
            table.setAvailable(tableDetails.isAvailable());
            return tableRepository.save(table);
        });
    }

    public boolean deleteTable(Long id) {
        if (tableRepository.existsById(id)) {
            tableRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
