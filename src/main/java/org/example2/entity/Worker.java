package org.example2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.type.descriptor.java.LocalDateJavaType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="workers")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "worker_gen")
    @SequenceGenerator(
            name = "worker_gen",
            sequenceName = "worker_gen",
            allocationSize = 1)

    private Long id;

    private String name;
    @Column(unique = true)
    private String email;
    private int salary;
    private String address;
    private LocalDate dateOfBirth;
    @ManyToOne
    private Pharmacy pharmacy;
}
