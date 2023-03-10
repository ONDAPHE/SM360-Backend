package com.assignment.sm360assignment.mappers;

import com.assignment.sm360assignment.dtos.ListingDto;

import com.assignment.sm360assignment.entity.Listing;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ListingMapper {

    ListingMapper INSTANCE = Mappers.getMapper(ListingMapper.class);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "idListing", target = "idListingDto")
    @Mapping(source = "vehicule", target = "vehiculeDto")
    @Mapping(source = "price", target = "priceDto")
    @Mapping(source = "createdAt", target = "createdAtDto")
    @Mapping(source = "state", target = "stateDto")
    @Mapping(source = "dealer", target = "dealerDto")

    ListingDto listingToListingDto(Listing listing);


    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "idListingDto", target = "idListing")
    @Mapping(source = "vehiculeDto", target = "vehicule")
    @Mapping(source = "priceDto", target = "price")
    @Mapping(source = "createdAtDto", target = "createdAt")
    @Mapping(source = "stateDto", target = "state")
    @Mapping(source = "dealerDto", target = "dealer")
    Listing listingDtoToListing(ListingDto listingDto);
}
