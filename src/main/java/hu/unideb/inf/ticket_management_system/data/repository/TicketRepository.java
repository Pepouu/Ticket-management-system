package hu.unideb.inf.ticket_management_system.data.repository;

import hu.unideb.inf.ticket_management_system.data.entity.TicketEntity;
import hu.unideb.inf.ticket_management_system.data.entity.StatusEntity;
import hu.unideb.inf.ticket_management_system.data.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {

    List<TicketEntity> findByStatus(StatusEntity status);

    List<TicketEntity> findByCreator(UserEntity creator);

    List<TicketEntity> findByAssignedTo(UserEntity assignedTo);
}