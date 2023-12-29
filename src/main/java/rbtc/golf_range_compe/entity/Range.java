package rbtc.golf_range_compe.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Range {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int round;

    @ManyToOne
    private Player player;

    @ManyToOne
    private Club club;

    private double distance;


}
