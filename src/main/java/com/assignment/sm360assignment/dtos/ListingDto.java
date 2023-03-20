package com.assignment.sm360assignment.dtos;

import com.assignment.sm360assignment.entity.Dealer;
import com.assignment.sm360assignment.entity.EtatListing;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListingDto {
    private int idListingDto;
    private String vehiculeDto;
    private Double priceDto;
    private LocalDateTime createdAtDto;
    private EtatListing stateDto;
    private Dealer dealerDto;
}
