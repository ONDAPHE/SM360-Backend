package com.assignment.sm360assignment.mappers;

import com.assignment.sm360assignment.dtos.DealerDto;
import com.assignment.sm360assignment.entity.Dealer;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DealerMapper {
    DealerMapper INSTANCE = Mappers.getMapper(DealerMapper.class);

    @BeanMapping(ignoreByDefault  = true)
    @Mapping(source = "idDealer", target = "idDealer")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "limit", target = "limit")
    DealerDto dealerToDealerDto(Dealer dealer);

    @BeanMapping(ignoreByDefault  = true)
    @Mapping(source = "idDealer", target = "idDealer")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "limit", target = "limit")
    Dealer dealerDtoToDealer(DealerDto dealerDto);
}
