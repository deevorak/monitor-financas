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
public class Expense implements Serializable {

    @Serial
    private static final long serialVersionUID = -1650861286354106592L;

    @GeneratedValue(generator = "expense_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "expense_gen", sequenceName = "expense_seq", allocationSize = 1)
    @Id
    private Long id;

    private Double amount;

    private String description;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
