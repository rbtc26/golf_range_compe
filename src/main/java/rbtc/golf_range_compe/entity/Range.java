package rbtc.golf_range_compe.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
