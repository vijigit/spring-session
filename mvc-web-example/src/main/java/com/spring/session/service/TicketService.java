package com.spring.session.service;

import com.spring.session.entity.Ticket;
import com.spring.session.repository.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }

}
