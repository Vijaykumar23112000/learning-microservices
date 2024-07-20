package com.magret.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String name;
    private String email;

}
