package com.hacisimsek.restaurant_reservation_system.repository;

import com.hacisimsek.restaurant_reservation_system.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Long>  {
    long countByIsAvailable(boolean isAvailable);
}
