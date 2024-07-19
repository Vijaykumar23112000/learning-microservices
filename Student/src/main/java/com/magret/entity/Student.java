package com.magret.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer schoolId;

}
