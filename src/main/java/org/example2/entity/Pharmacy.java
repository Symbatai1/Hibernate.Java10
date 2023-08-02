package org.example2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="pharmacies")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pharmacies_gen")
    @SequenceGenerator(
            name = "pharmacies_gen",
            sequenceName = "pharmacies_gen",
            allocationSize = 1)
    private Long id;
    private String name;
    private String address;
    @ManyToMany(mappedBy = "pharmacy")
    private List<Medicines> medicines;
    @OneToMany
    private List<Worker> worker;
}
