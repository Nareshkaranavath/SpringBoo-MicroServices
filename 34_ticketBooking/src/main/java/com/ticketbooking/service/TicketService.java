package com.ticketbooking.service;

import java.util.List;

import com.ticketbooking.entity.Passenger;
import com.ticketbooking.entity.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicket(Integer ticketId);
	
	public List<Ticket> getTickets();
}
