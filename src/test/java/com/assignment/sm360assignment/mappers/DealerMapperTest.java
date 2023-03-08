package com.assignment.sm360assignment.mappers;

import com.assignment.sm360assignment.dtos.DealerDto;
import com.assignment.sm360assignment.entity.Dealer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DealerMapperTest {

    @Test
    void given_dealer_id_should_map_dealerDto_id(){
        //GIVEN
        Dealer dealer = Dealer.builder().idDealer(1).build();

        //WHEN
        final DealerDto dealerDto = DealerMapper.INSTANCE.dealerToDealerDto(dealer);

        //THEN
        Assertions.assertEquals(dealer.getIdDealer(),dealerDto.getIdDealer());
    }

    @Test
    void given_dealerDto_id_should_map_dealer_id(){
        //GIVEN
        DealerDto dealerDto = DealerDto.builder().idDealer(1).build();

        //WHEN
        final Dealer dealer = DealerMapper.INSTANCE.dealerDtoToDealer(dealerDto);

        //THEN
        Assertions.assertEquals(dealer.getIdDealer(),dealerDto.getIdDealer());
    }
}
