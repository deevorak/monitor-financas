package com.rocha.monitorfinancas.model.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Income implements Serializable {

    @Serial
    private static final long serialVersionUID = -315430589060002665L;

    @GeneratedValue(generator = "income_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "income_gen", sequenceName = "income_seq", allocationSize = 1)
    @Id
    private Long id;

    private Double amount;

    private String description;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
