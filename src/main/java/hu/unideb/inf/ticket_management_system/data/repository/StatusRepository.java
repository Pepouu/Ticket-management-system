package hu.unideb.inf.ticket_management_system.data.repository;

import hu.unideb.inf.ticket_management_system.data.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Integer> {
}