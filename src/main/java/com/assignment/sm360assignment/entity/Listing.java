package com.assignment.sm360assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdListing;

    @Column(name = "vehicule")
    private String vehicule;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private EtatListing state;

    @ManyToOne
    @JoinColumn(name = "dealer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Dealer dealer;
}
