package hu.unideb.inf.ticket_management_system.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "priorities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriorityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String name; // Pl. "Minor", "Normal", "Major", "Critical"

    @Column(nullable = false)
    private Integer level; // Szint számban (pl. 1, 2, 3, 4) a sorrendhez

    @Column(name = "color_code", length = 20)
    private String colorCode; // Pl. "#FF0000" vagy "red" a frontendhez
}