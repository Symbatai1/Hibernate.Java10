package org.example2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="medicines")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Medicines {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "medicines_gen")
    @SequenceGenerator(
            name = "medicines_gen",
            sequenceName = "medicines_gen",
            allocationSize = 1)

    private Long id;
    private String name;
    @Column
    private int price;
    @ManyToMany
    private List<Pharmacy> pharmacy;
}
