package com.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketbooking.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
