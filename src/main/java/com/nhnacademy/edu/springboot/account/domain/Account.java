package com.nhnacademy.edu.springboot.account.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Account {
    @Id
    private Long id;
    private String number;
    private Integer balance;
}
