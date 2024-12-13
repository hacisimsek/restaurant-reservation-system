package com.hacisimsek.restaurant_reservation_system.repository;

import com.hacisimsek.restaurant_reservation_system.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
