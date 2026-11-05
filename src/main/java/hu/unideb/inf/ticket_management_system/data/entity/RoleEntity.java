package hu.unideb.inf.ticket_management_system.data.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Jelzi, hogy ez egy JPA entitás, ami egy adatbázis táblához kapcsolódik
@Table(name = "roles") // Megadja az adatbázis tábla nevét
@Data // Lombok: automatikusan generál gettert, settert, equals-t, hashCode-ot és toString-et
@NoArgsConstructor // Lombok: automatikusan generál egy konstruktort argumentumok nélkül
@AllArgsConstructor // Lombok: automatikusan generál egy konstruktort az összes mezővel
public class RoleEntity {

    @Id // Jelzi, hogy ez az elsődleges kulcs
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-inkrementáló azonosító
    private Integer id;

    @Column(nullable = false, unique = true) // Nem lehet NULL és egyedi kell, hogy legyen
    private String name; // A szerepkör neve (pl. "USER", "ADMIN")

    @Column(length = 255) // Maximális hossza 255 karakter
    private String description; // A szerepkör rövid leírása
}