package hu.unideb.inf.ticket_management_system.data.repository;

import hu.unideb.inf.ticket_management_system.data.entity.CommentEntity;
import hu.unideb.inf.ticket_management_system.data.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
    List<CommentEntity> findByTicket(TicketEntity ticket);
}