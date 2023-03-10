package com.assignment.sm360assignment.mappers;


import com.assignment.sm360assignment.dtos.ListingDto;
import com.assignment.sm360assignment.entity.Dealer;
import com.assignment.sm360assignment.entity.EtatListing;
import com.assignment.sm360assignment.entity.Listing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ListingMapperTest {
    @Test
    void given_listing_id_should_map_listingDto_id(){
        //GIVEN
        Listing listing= Listing.builder().idListing(1).build();

        //WHEN
        final ListingDto listingDto = ListingMapper.INSTANCE.listingToListingDto(listing);

        //THEN
        Assertions.assertEquals(listing.getIdListing(),listingDto.getIdListingDto());
    }

    @Test
    void given_listing_vehicule_should_map_listingDto_vehicule(){
        //GIVEN
        Listing listing= Listing.builder().vehicule("Toyota").build();

        //WHEN
        final ListingDto listingDto = ListingMapper.INSTANCE.listingToListingDto(listing);

        //THEN
        Assertions.assertEquals(listing.getVehicule(),listingDto.getVehiculeDto());
    }

    @Test
    void given_listing_price_should_map_listingDto_price(){
        //GIVEN
        Listing listing= Listing.builder().price(15000000.00).build();

        //WHEN
        final ListingDto listingDto = ListingMapper.INSTANCE.listingToListingDto(listing);

        //THEN
        Assertions.assertEquals(listing.getPrice(),listingDto.getPriceDto());
    }

    @Test
    void given_listing_createdAt_should_map_listingDto_createdAt(){
        //GIVEN
        Listing listing= Listing.builder().createdAt(LocalDateTime.now()).build();

        //WHEN
        final ListingDto listingDto = ListingMapper.INSTANCE.listingToListingDto(listing);

        //THEN
        Assertions.assertEquals(listing.getCreatedAt(),listingDto.getCreatedAtDto());
    }

    @Test
    void given_listing_state_should_map_listingDto_state(){
        //GIVEN
        Listing listing= Listing.builder().state(EtatListing.draft).build();

        //WHEN
        final ListingDto listingDto = ListingMapper.INSTANCE.listingToListingDto(listing);

        //THEN
        Assertions.assertEquals(listing.getState(),listingDto.getStateDto());
    }
    @Test
    void given_listing_dealer_should_map_listingDto_dealer(){
        //GIVEN
        Listing listing= Listing.builder().dealer(new Dealer()).build();

        //WHEN
        final ListingDto listingDto = ListingMapper.INSTANCE.listingToListingDto(listing);

        //THEN
        Assertions.assertEquals(listing.getDealer(),listingDto.getDealerDto());
    }

    @Test
    void given_listingDto_id_should_map_listing_id(){
        //GIVEN
        ListingDto listingDto = ListingDto.builder().idListingDto(1).build();

        //WHEN
        final Listing listing = ListingMapper.INSTANCE.listingDtoToListing(listingDto);

        //THEN
        Assertions.assertEquals(listingDto.getIdListingDto(),listing.getIdListing());
    }
    @Test
    void given_listingDto_vehicule_should_map_listing_vehicule(){
        //GIVEN
        ListingDto listingDto = ListingDto.builder().vehiculeDto("Toyota").build();

        //WHEN
        final Listing listing = ListingMapper.INSTANCE.listingDtoToListing(listingDto);

        //THEN
        Assertions.assertEquals(listingDto.getVehiculeDto(),listing.getVehicule());
    }

    @Test
    void given_listingDto_price_should_map_listing_price(){
        //GIVEN
        ListingDto listingDto = ListingDto.builder().priceDto(15000000.00).build();

        //WHEN
        final Listing listing = ListingMapper.INSTANCE.listingDtoToListing(listingDto);

        //THEN
        Assertions.assertEquals(listingDto.getPriceDto(),listing.getPrice());
    }

    @Test
    void given_listingDto_createdAt_should_map_listing_createdAt(){
        //GIVEN
        ListingDto listingDto = ListingDto.builder().createdAtDto(LocalDateTime.now()).build();

        //WHEN
        final Listing listing = ListingMapper.INSTANCE.listingDtoToListing(listingDto);

        //THEN
        Assertions.assertEquals(listingDto.getCreatedAtDto(),listing.getCreatedAt());
    }

    @Test
    void given_listingDto_state_should_map_listing_state(){
        //GIVEN
        ListingDto listingDto = ListingDto.builder().stateDto(EtatListing.draft).build();

        //WHEN
        final Listing listing = ListingMapper.INSTANCE.listingDtoToListing(listingDto);

        //THEN
        Assertions.assertEquals(listingDto.getStateDto(),listing.getState());
    }

    @Test
    void given_listingDto_dealer_should_map_listing_dealer(){
        //GIVEN
        ListingDto listingDto = ListingDto.builder().dealerDto(new Dealer()).build();

        //WHEN
        final Listing listing = ListingMapper.INSTANCE.listingDtoToListing(listingDto);

        //THEN
        Assertions.assertEquals(listingDto.getDealerDto(),listing.getDealer());
    }
}
