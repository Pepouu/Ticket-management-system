package hu.unideb.inf.ticket_management_system.data.repository;

import hu.unideb.inf.ticket_management_system.data.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // Felhasználó keresése felhasználónév alapján
    Optional<UserEntity> findByUsername(String username);

    // Felhasználó keresése e-mail cím alapján
    Optional<UserEntity> findByEmail(String email);

    // Ellenőrzés, hogy létezik-e már adott felhasználónév vagy e-mail
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}