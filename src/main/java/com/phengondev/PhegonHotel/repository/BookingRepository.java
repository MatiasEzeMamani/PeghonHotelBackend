package com.phengondev.PhegonHotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phengondev.PhegonHotel.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	List<Booking> findByRoomId(Long roomId);
	
	List<Booking> findByBookingConfirmationCode(String confirmationCode);
	
	List<Booking> findByUserId(Long userId);
}
