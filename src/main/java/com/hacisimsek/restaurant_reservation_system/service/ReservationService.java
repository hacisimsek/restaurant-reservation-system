package com.hacisimsek.restaurant_reservation_system.service;

import com.hacisimsek.restaurant_reservation_system.entity.Reservation;
import com.hacisimsek.restaurant_reservation_system.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Optional<Reservation> updateReservation(Long id, Reservation reservationDetails) {
        return reservationRepository.findById(id).map(reservation -> {
            reservation.setCustomerName(reservationDetails.getCustomerName());
            reservation.setCustomerEmail(reservationDetails.getCustomerEmail());
            reservation.setReservationTime(reservationDetails.getReservationTime());
            reservation.setNumberOfGuests(reservationDetails.getNumberOfGuests());
            return reservationRepository.save(reservation);
        });
    }

    public boolean deleteReservation(Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
