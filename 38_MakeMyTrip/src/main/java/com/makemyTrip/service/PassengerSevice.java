package com.makemyTrip.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.makemyTrip.binding.Passenger;
import com.makemyTrip.binding.Ticket;

import reactor.core.publisher.Mono;

@Service
public class PassengerSevice {

	private final String BOOK_TICKET_URL = "https:localhost:8081/ticket";
	private final String GET_TICKETS_URL = "https:localhost:8081/tickets";

	public Mono<Ticket> getTicket(Passenger p) {

		// logic post request
		WebClient wbClient = WebClient.create();
		return wbClient.post()
						.uri(BOOK_TICKET_URL)
						.body(BodyInserters.fromValue(p))
						.retrieve()
						.bodyToMono(Ticket.class);
	}

	public Mono<Ticket[]> getAllTicktes() {

		// logic to send get req
		WebClient webClient = WebClient.create();
				return	webClient.get()
							 .uri(GET_TICKETS_URL)
							 .retrieve()
							 .bodyToMono(Ticket[].class);
	}
}
