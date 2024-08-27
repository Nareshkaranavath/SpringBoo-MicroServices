package com.makemyTrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.makemyTrip.binding.Passenger;
import com.makemyTrip.binding.Ticket;
import com.makemyTrip.service.PassengerSevice;

import reactor.core.publisher.Mono;

@RestController
public class TicketController {

	@Autowired
	private PassengerSevice service;

	@PostMapping("/ticket")
	public String bookTicket(Model model, Passenger p) {

		Mono<Ticket> mono = service.getTicket(p);
		model.addAttribute("ticket", mono);
		return "index";

	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("passenger", new Passenger());

		return "index";
	}

	@GetMapping("/search")
	public String Search(Model model) {
		model.addAttribute("model", new Ticket());

		return "index";
	}

	@GetMapping("/search-ticket")
	public String ViewAllTickets(@RequestParam("ticketNum") Integer ticketNum, Model model) {
		Mono<Ticket[]> allTickets = service.getAllTicktes();
		model.addAttribute("passenger", allTickets);
		return "search";
	}
}
