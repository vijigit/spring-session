package com.spring.session.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.session.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
