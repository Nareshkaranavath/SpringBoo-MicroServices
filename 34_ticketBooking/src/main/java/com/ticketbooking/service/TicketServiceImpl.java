package com.ticketbooking.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbooking.entity.Passenger;
import com.ticketbooking.entity.Ticket;
import com.ticketbooking.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository repo;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketStatus("CONFIRMED");
		Ticket saveTicked = repo.save(t);
		return saveTicked;
	}

	@Override
	public List<Ticket> getTickets() {
		// TODO Auto-generated method stub
		return repo.findAll();

	}

	@Override
	public Ticket getTicket(Integer ticketId) {
		return repo.findById(ticketId).orElseThrow();
	}
	
}
