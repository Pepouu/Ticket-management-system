package hu.unideb.inf.ticket_management_system.data.repository;

import hu.unideb.inf.ticket_management_system.data.entity.TicketTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketTypeRepository extends JpaRepository<TicketTypeEntity, Integer> {
}
