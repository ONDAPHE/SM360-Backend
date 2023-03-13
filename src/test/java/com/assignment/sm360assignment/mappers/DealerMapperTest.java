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
    void given_dealer_name_should_map_dealerDto_name(){
        //GIVEN
        Dealer dealer = Dealer.builder().name("Arthur").build();

        //WHEN
        final DealerDto dealerDto = DealerMapper.INSTANCE.dealerToDealerDto(dealer);

        //THEN
        Assertions.assertEquals(dealer.getName(),dealerDto.getName());
    }

    @Test
    void given_dealer_limit_should_map_dealerDto_limit(){
        //GIVEN
        Dealer dealer = Dealer.builder().limit_p(1).build();

        //WHEN
        final DealerDto dealerDto = DealerMapper.INSTANCE.dealerToDealerDto(dealer);

        //THEN
        Assertions.assertEquals(dealer.getLimit_p(),dealerDto.getLimit_p());
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

    @Test
    void given_dealerDto_name_should_map_dealer_name(){
        //GIVEN
        DealerDto dealerDto = DealerDto.builder().name("Arthur").build();

        //WHEN
        final Dealer dealer = DealerMapper.INSTANCE.dealerDtoToDealer(dealerDto);

        //THEN
        Assertions.assertEquals(dealer.getName(),dealerDto.getName());
    }

    @Test
    void given_dealerDto_limit_should_map_dealer_limit(){
        //GIVEN
        DealerDto dealerDto = DealerDto.builder().limit_p(1).build();

        //WHEN
        final Dealer dealer = DealerMapper.INSTANCE.dealerDtoToDealer(dealerDto);

        //THEN
        Assertions.assertEquals(dealer.getLimit_p(),dealerDto.getLimit_p());
    }
}
