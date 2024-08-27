package com.ticketbooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbooking.entity.Passenger;
import com.ticketbooking.entity.Ticket;

import com.ticketbooking.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService service;

	@PostMapping(value = "/ticket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger pass) {
		Ticket bookTicket = service.bookTicket(pass);
		return new ResponseEntity<>(bookTicket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/tickets", produces = "applicaion/json")
	public ResponseEntity<List<Ticket>> getAllTickets() {
		List<Ticket> tickets = service.getTickets();
		return new ResponseEntity<>(tickets, HttpStatus.OK);
	}

	@GetMapping(value = "/ticket/{tid}", produces = "application/json")
	public ResponseEntity<Ticket> getTickets(@PathVariable("tid") Integer tid) {
		Ticket ticket = service.getTicket(tid);
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
}
