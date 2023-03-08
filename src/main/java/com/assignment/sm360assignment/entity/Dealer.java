package com.assignment.sm360assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dealer")
public class Dealer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdDealer;

    @Column(name = "name")
    private String name;

    @Column(name = "limit")
    private int limit;
}
