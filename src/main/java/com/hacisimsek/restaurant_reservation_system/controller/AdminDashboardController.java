package com.hacisimsek.restaurant_reservation_system.controller;

import com.hacisimsek.restaurant_reservation_system.repository.ReservationRepository;
import com.hacisimsek.restaurant_reservation_system.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminDashboardController {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private TableRepository tableRepository;

    @GetMapping("/dashboard")
    public Map<String, Object> getDashboardStats() {
        long totalReservations = reservationRepository.count();
        long availableTables = tableRepository.countByIsAvailable(true);

        Map<String, Object> stats = new HashMap<>();
        stats.put("totalReservations", totalReservations);
        stats.put("availableTables", availableTables);
        return stats;
    }
}
